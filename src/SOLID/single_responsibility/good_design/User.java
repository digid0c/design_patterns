package SOLID.single_responsibility.good_design;

public class User {

    private String firstName;
    private String lastName;
    private String nickname;

    public User() {

    }

    public User(String firstName, String lastName, String nickname) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickname() {
        return nickname;
    }
}
