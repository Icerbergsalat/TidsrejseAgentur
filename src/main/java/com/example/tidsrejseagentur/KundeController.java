package com.example.tidsrejseagentur;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class KundeController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TableView<Kunde> Lgaard;
    @FXML
    private TableColumn<Kunde, Integer> colId;
    @FXML
    private TableColumn<Kunde, String> colName;
    @FXML
    private TableColumn<Kunde, Integer> colFamily;

    private ObservableList<Kunde> data = FXCollections.observableArrayList();

    @FXML
    protected void onReturnButtonClick(javafx.event.ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void initialize() {
        colId.setCellValueFactory();
    }
}