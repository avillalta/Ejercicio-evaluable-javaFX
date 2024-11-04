package org.example.ejercicioevaluablejavafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.ejercicioevaluablejavafx.models.User;
import org.example.ejercicioevaluablejavafx.models.UserUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Label idLabel;
    @FXML
    private TableColumn<User, String> tcAdmin;
    @FXML
    private TextField tfPlatform;
    @FXML
    private TableColumn<User, String> tcPlatform;
    @FXML
    private TextField tfMail;
    @FXML
    private CheckBox checkAdmin;
    @FXML
    private TableView<User> table;
    @FXML
    private Button addBtn;
    @FXML
    private TableColumn<User, String> tcDate;
    @FXML
    private TableColumn<User, String> tcVersion;
    @FXML
    private TableColumn<User, String> tcMail;
    private ChoiceBox choicePlatform;

    private User userSelected = null;
    private Integer posUserSelected = null;
    @FXML



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        table.getItems().clear();
        table.getItems().addAll(UserUtils.userList);
        tcMail.setCellValueFactory((fila) -> new SimpleStringProperty(fila.getValue().getMail()));
        tcPlatform.setCellValueFactory((fila) -> new SimpleStringProperty(fila.getValue().getPlatform()));
        tcAdmin.setCellValueFactory((fila) -> new SimpleStringProperty(fila.getValue().getIs_admin().toString()));
        tcVersion.setCellValueFactory((fila) -> new SimpleStringProperty(fila.getValue().getVersion().toString()));
        tcDate.setCellValueFactory((fila) -> new SimpleStringProperty(fila.getValue().getDate()));

        //choicePlatform.getItems().addAll("Linux", "MacOS", "Windows");


        // Convierte userList en una ObservableList y cárgala en el TableView
        ObservableList<User> userList = FXCollections.observableArrayList(UserUtils.userList);
        table.setItems(userList);


    }

    @FXML
    public void add(ActionEvent actionEvent) {
        String mail = tfMail.getText();
        String platform = tfPlatform.getText();
        Boolean isAdmin = checkAdmin.isSelected();

        Integer version = 1;  
        String date = "Fecha actual"; 

        
        if (mail.isEmpty() || platform.isEmpty()) {
            
            System.out.println("Por favor, completa todos los campos obligatorios.");
            return;
        }

        User newUser = new User(mail, platform, isAdmin, version, date);
        UserUtils.userList.add(newUser);
        table.getItems().add(newUser);
        tfMail.clear();
        tfPlatform.clear();
        checkAdmin.setSelected(false);
    }



}
