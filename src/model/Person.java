package model;

public class Person {

    private String firstName;
    private String lastName;
    private int SSN;
    private String dob;
    private String gender;

    public Person(String firstName, String lastName, int SSN, String dob, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.dob = dob;
        this.gender = gender;
    }

    public Person() {
        this.firstName = "NULL";
        this.lastName = "NULL";
        this.SSN = 0;
        this.dob = "NULL";
        this.gender = "NULL";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
