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

    @FXML
    TextField removeUser;

public void authenticate() {
    LinkedListNode <User> temp = null;

    try {
         temp = UserDB.getUsers().top();

    } catch (UnderflowException e) {
        e.printStackTrace();
    }

    User userTemp = temp.getElement();
    User user = null;

    for(int i = 0; i < UserDB.getUsers().size(); i++) {
        if(userTemp.getUserName().equals(userName.getText())) {
            user = userTemp;
        }
        temp = temp.getPointer();
        if (temp != null) {
            userTemp = temp.getElement();
        }
    }

    if (user == null) {
        System.out.println("User not found.");
    }
    else {
        if(user.getPassword().equals(password.getText())) {
            System.out.println("Welcome " + userName.getText());
        }
        else {
            System.out.println("Password is incorrect.");
        }
    }

}

public void openSignupView() throws IOException {
    System.out.println("Open signup view");
    new SignUpJavaFXView();
}

}
