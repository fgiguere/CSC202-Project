package controller;

import Exceptions.UnderflowException;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import model.*;
import utils.LinkedListNode;
import view.SignUpJavaFXView;

public class LoginController {
    @FXML
    TextField userName;

    @FXML
    PasswordField password;

public void authenticate() {
    if(UserDB.getUsers().contains(userName.getText())) {
        if(UserDB.getUsers().get(userName.getText()).getPassword().equals(password.getText())) {
            System.out.println("Welcome " + userName.getText());
        }
        else {
            System.out.println("Password is incorrect");
        }
    }
    else {
        System.out.println("Username not found.");
    }
}

public void openSignupView() throws IOException {
    System.out.println("Open signup view");
    new SignUpJavaFXView();
}

}
