package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import model.*;
import view.SignUpJavaFXView;

public class LoginController {
    @FXML
    TextField userName;

    @FXML
    PasswordField password;

public void authenticate() {

    for(int i = 0; i < UserDB.getUsers().size(); i++) {
        if(userName.getText().equals(UserDB.getUsers().get(i).getUserName())) {
            System.out.println("Welcome " + userName.getText());
        }
    }

}

public void openSignupView() throws IOException {
    System.out.println("Open signup view");
    new SignUpJavaFXView();
}


}
