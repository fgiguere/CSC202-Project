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

}
