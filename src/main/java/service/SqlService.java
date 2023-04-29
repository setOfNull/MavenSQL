package service;

import model.Account;
import model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlService {
    static final String QUERY = "SELECT u.id, u.login, u.email, u.fullname, u.age, u.gender, a.id as acc_id, a.currency, a.acc_num " +
            "From users u join accounts a on u.id=a.id join users_accounts ua on u.id=ua.user_id";

    public void getUsers() {
        try{
            Statement stm = ConnectionService.getConnection().createStatement();
            ResultSet rs = stm.executeQuery(QUERY);
            printUsers(rs);

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    private void printUsers(ResultSet resultSet) throws SQLException {

        while(resultSet.next()){
            Account acc = new Account(resultSet.getLong(("id")), resultSet.getString(("acc_num")), resultSet.getBigDecimal(("currency")));

            User user = new User(resultSet.getInt(("id")),resultSet.getString(("login")), resultSet.getString(("email")), resultSet.getString(("fullname")),
                    resultSet.getInt(("age")), resultSet.getString(("gender")), acc);


            System.out.println(user);
            System.out.println();
        }
    }
}
