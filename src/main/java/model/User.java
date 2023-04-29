package model;

public class User {
    private int id;
    private String login;
    private String email;
    private String fullname;
    private int age;
    private String gender;
    private Account account;

    public User(int id, String login, String email, String fullname, int age, String gender, Account account) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.fullname = fullname;
        this.age = age;
        this.gender = gender;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", account id =" + account +
                '}';
    }
}
