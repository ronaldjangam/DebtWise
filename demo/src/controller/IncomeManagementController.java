package com.example;

import com.example.model.Income;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.time.LocalDate;

public class IncomeManagementController {

    @FXML
    private TextField sourceField;
    @FXML
    private TextField amountField;
    @FXML
    private ListView<Income> incomeListView;

    private ObservableList<Income> incomeList;

    public IncomeManagementController() {
        incomeList = FXCollections.observableArrayList();
    }

    @FXML
    public void initialize() {
        incomeListView.setItems(incomeList);
    }

    @FXML
    private void addIncome() {
        String source = sourceField.getText();
        String amountText = amountField.getText();

        if (source.isEmpty() || amountText.isEmpty()) {
            showAlert("Invalid input", "Please fill in all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            Income newIncome = new Income(source, amount, LocalDate.now());
            incomeList.add(newIncome);

            // Clear input fields
            sourceField.clear();
            amountField.clear();
        } catch (NumberFormatException e) {
            showAlert("Invalid input", "Please enter a valid amount.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
