package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Hospital;
import view.HospitalListJavaFXView;

/**
 * Created by faith on 7/25/16.
 */
public class HospitalListController {

    @FXML
    private TableView<Hospital> hospitalTable;
    @FXML
    private TableColumn<Hospital, String> hospitalName;
    @FXML
    private TableColumn<Hospital, String> streetAddress;
    @FXML
    private TableColumn<Hospital, String> city;
    @FXML
    private TableColumn<Hospital, String> state;
    @FXML
    private TableColumn<Hospital, String> zip;
    @FXML
    private TableColumn<Hospital, String> latitude;
    @FXML
    private TableColumn<Hospital, String> longitude;
    @FXML
    private TableColumn<Hospital, String> pNumber;
    @FXML
    private TableColumn<Hospital, String> photo;

    private HospitalListJavaFXView hospitalApp;

   /* @FXML
    private void initialize() {
        hospitalName.setCellValueFactory(cellData -> cellData.getValue());

    }

    public void setHospitalApp(HospitalListJavaFXView hospitalApp) {
        this.hospitalApp = hospitalApp;

        hospitalTable.setItems(hospitalApp.getHospitalData());
    } */
}
