package model;

import java.io.Serializable;


public class User extends Person implements Serializable {

    private String userName;
    private String email;
    private String phone;
    private String password;
    private String photo;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User(String userName, String email, String phone, String password, String photo) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    public User(String firstName, String lastName, int SSN, String dob, String gender, String userName, String email, String phone, String password, String photo) {
        super(firstName, lastName, SSN, dob, gender);
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.photo = photo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public boolean equals(User user) {
        return (this.userName.equals(user.getUserName()));
    }

    public int compareTo(User user) {
        return (this.userName.compareTo(user.getUserName()));
    }

    public String toString() {
        return "Username: " + this.userName;
    }
}