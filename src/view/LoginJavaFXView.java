package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

import java.io.IOException;

import utils.LinkedListStack;
//import utils.OrderedList;

public class LoginJavaFXView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        loadUserDB();
        Parent root = FXMLLoader.load(getClass().getResource("LoginJavaFX.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }

    public void loadUserDB() {
        try {
            UserDB.setUsers((LinkedListStack) UserIO.readUsers());
        } catch (IOException e) {
            System.err.print("Failed to open/read users.dat file.");
        } catch (ClassNotFoundException e) {
            System.err.print("Failed reading and casting UserDB to User class.");
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
