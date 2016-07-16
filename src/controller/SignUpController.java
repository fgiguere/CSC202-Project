package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.*;

import java.io.IOException;

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

    public void createAccount() {
        boolean pass = true;

        if((firstName.getText().isEmpty() || lastName.getText().isEmpty() || dob.getText().isEmpty() || gender.getText().isEmpty() || userName.getText().isEmpty() || password.getText().isEmpty() || confirm.getText().isEmpty())) {
            pass = false;
            System.out.println("Required fields not all completed.");
        }

        if(!(password.getText().equals(confirm.getText()))) {
            pass = false;
            System.out.println("Passwords do not match.");
        }

        if(pass == true){
            User user = new User(userName.getText(), password.getText());
            UserDB.getUsers().add(user);
            try{
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e) {
                System.err.println("Cannot write UserDB to binary file.");
                e.printStackTrace();
            }
        }
        System.out.println(UserDB.getUsers());

    }

}
