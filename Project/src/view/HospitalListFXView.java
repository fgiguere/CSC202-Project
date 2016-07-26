package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by faith on 7/25/16.
 */
public class HospitalListFXView extends Application {

    private static Stage hospitalListStage = new Stage();

    public HospitalListFXView () throws IOException {

            Parent hospitalListView = FXMLLoader.load(getClass().getResource("HospitalSearchFX.fxml"));

        }


    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}

