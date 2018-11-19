package sample;

public class Human {
    String password;
    String firstName;
    String secondName;
    int age;
    String login;


    public Human(String firstName, String secondName, String password, int age, String login) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.age = age;
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
