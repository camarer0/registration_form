package com.example.ui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private DatePicker date;
    @FXML
    private TextArea info;
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private DialogPane dialog;
    @FXML
    private ChoiceBox<String> choice;
    @FXML
    private ChoiceBox<String> gender;
    @FXML
    private Button confirm;
    @FXML
    private Button ok;
    @FXML
    protected void confirmClick()
    {
        dialog.setVisible(true);
        info.setText("name: " + name.getText() + "\n" +
                "surname: " + surname.getText() + "\n" +
                "date: " + date.getValue() + "\n" +
                "gender: " + gender.getValue() + "\n" +
                "pet: " + choice.getValue() + "\n");
    }
    @FXML
    protected void okClick()
    {
        dialog.setVisible(false);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choice.getItems().addAll("cat","dog","other");
        gender.getItems().addAll("male","female");
    }
}