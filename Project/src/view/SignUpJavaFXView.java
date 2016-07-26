package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

public class SignUpJavaFXView {

    public SignUpJavaFXView() throws IOException {
        Stage signupStage = new Stage();
        Parent signupView = FXMLLoader.load(getClass().getResource("SignupJavaFx.fxml"));
        signupStage.setTitle("Signup");
        signupStage.setScene(new Scene(signupView, 500, 1000));
        signupStage.show();
    }

}
