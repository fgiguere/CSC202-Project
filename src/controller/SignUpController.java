package controller;

import Exceptions.UnderflowException;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.*;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import model.*;
import utils.LinkedListNode;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpController {
    @FXML
    TextField userName;

    @FXML
    TextField firstName;

    @FXML
    TextField lastName;

    @FXML
    TextField SSN;

    @FXML
    TextField dob;

    @FXML
    TextField gender;

    @FXML
    TextField email;

    @FXML
    TextField pNumber;

    @FXML
    PasswordField password;

    @FXML
    PasswordField confirm;

    String photo = "NULL";

    public void browseFiles() {
        FileChooser fc = new FileChooser();

        Stage browse = new Stage();
        String path = fc.showOpenDialog(browse).getAbsolutePath();

        photo = path;
        System.out.println(photo);
    }

    public void createAccount() {
        boolean pass = true;

        LinkedListNode <User> temp = null;
        try {
            temp = UserDB.getUsers().top();
        } catch (UnderflowException e) {
        }

        for(int i = 0; i < UserDB.getUsers().size(); i++) {
            if (temp.getElement().getUserName().equals(userName.getText())) {
                pass = false;
                System.out.println("Username already exists.");
            }
            temp = temp.getPointer();
        }

        if((firstName.getText().isEmpty() || lastName.getText().isEmpty() || dob.getText().isEmpty() || gender.getText().isEmpty() || userName.getText().isEmpty() || password.getText().isEmpty() || confirm.getText().isEmpty())) {
            pass = false;
            System.out.println("Required fields not all completed.");
        }

        if(!(password.getText().equals(confirm.getText()))) {
            pass = false;
            System.out.println("Passwords do not match.");
        }

        Pattern emailPattern = Pattern.compile("^[\\w]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher emailMatch = emailPattern.matcher(email.getText());

        if(!emailMatch.find()) {
            pass = false;
            System.out.println("Email not valid.");
        }

        Pattern lowerCase = Pattern.compile("[a-z]+");
        Matcher lowerCaseMatch = lowerCase.matcher(password.getText());

        Pattern upperCase = Pattern.compile("[A-Z]+");
        Matcher upperCaseMatch = upperCase.matcher(password.getText());

        Pattern number = Pattern.compile("[0-9]+");
        Matcher numberMatch = number.matcher(password.getText());

        Pattern special = Pattern.compile("[^A-Za-z0-9]+");
        Matcher specialMatch = special.matcher(password.getText());

        if(!lowerCaseMatch.find() || !upperCaseMatch.find() || !numberMatch.find() || !specialMatch.find()) {
            pass = false;
            System.out.println("Password not valid.");
        }

        Pattern phoneNumber = Pattern.compile("[0-9]{3}[-][0-9]{3}[-][0-9]{4}");
        Matcher phoneNumberMatch = phoneNumber.matcher(pNumber.getText());

        if(!phoneNumberMatch.find()) {
            pass = false;
            System.out.println("Phone number not valid. ex. 123-456-7890");
        }

        if(pass == true){
            User user = new User(firstName.getText(), lastName.getText(), Integer.parseInt(SSN.getText()), dob.getText(), gender.getText(), userName.getText(), email.getText(), pNumber.getText(), password.getText(), photo);
            LinkedListNode newNode = new LinkedListNode(user);
            UserDB.getUsers().push(newNode);

            try{
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e) {
                System.err.println("Cannot write UserDB to binary file.");
                e.printStackTrace();
            }

            System.out.println("Account created successfully.");
            //int totalUsers = UserDB.getUsers().size();
            //System.out.println("Total users in system: " + totalUsers);
        }
    }

}
