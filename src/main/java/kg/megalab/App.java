package kg.megalab;

import service.SqlService;

public class App {
        public static void main(String[] args) {
            SqlService sqlService = new SqlService();
            sqlService.getUsers();

        }
    }

