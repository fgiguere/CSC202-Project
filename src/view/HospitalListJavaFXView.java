package view;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Hospital;
import model.ReadExcelFile;
import utils.BinarySearchTree;

import java.io.IOException;
import java.util.List;
import java.util.Observable;

/**
 * Created by faith on 7/25/16.
 */
public class HospitalListJavaFXView {

    private static Stage hospitalListStage = new Stage();
    private String name;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String latitude;
    private String longitude;
    private String number;
    private String photo;
    private ObservableList<Hospital> hospitalData = FXCollections.observableArrayList();

    public HospitalListJavaFXView() throws IOException {

        loadHospitals();
        Parent hospitalListView = FXMLLoader.load(getClass().getResource("HospitalListJavaFX.fxml"));
        hospitalListStage.setTitle("Hospital List Page");
        Scene hospitalListScene = new Scene(hospitalListView, 575, 575);
        hospitalListStage.setScene(hospitalListScene);
        hospitalListStage.show();

        }

    public void loadHospitals() {
        BinarySearchTree<Hospital> hospitalBSTree = new BinarySearchTree<Hospital>();
        List hospitalList = null;
        try {
            hospitalList = ReadExcelFile.excelReader("HospitalList.xls");
        } catch (Exception e) {
            System.err.println("Problem reading in excel file.");
            e.printStackTrace();
        }
        //ReadExcelFile.showExcelData(hospitalList);
        for (int i = 0; i < 124; i++) {
            List record = (List) hospitalList.get(i); //list row
            name = String.valueOf(record.get(0));
            streetAddress = String.valueOf(record.get(1));
            city = String.valueOf(record.get(2));
            state = String.valueOf(record.get(3));
            zip = String.valueOf(record.get(4));
            latitude = String.valueOf(record.get(5));
            longitude = String.valueOf(record.get(6));
            number = String.valueOf(record.get(7));
            photo = String.valueOf(record.get(8));

            Hospital hospital = new Hospital(name, streetAddress, city, state, zip, latitude, longitude, number, photo);
            hospitalBSTree.add(hospital);
            hospitalData.add(hospital);
        }
    }

    public ObservableList<Hospital> getHospitalData() {
        return hospitalData;
    }
}

