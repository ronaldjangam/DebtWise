package com.example;

import com.example.model.Debt;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class DebtManagementController {

    @FXML
    private TextField nameField;
    @FXML
    private TextField amountField;
    @FXML
    private TextField typeField;
    @FXML
    private ListView<Debt> debtListView;

    private ObservableList<Debt> debtList;

    public DebtManagementController() {
        debtList = FXCollections.observableArrayList();
    }

    @FXML
    public void initialize() {
        // Initialize ListView with the debt list
        debtListView.setItems(debtList);
    }

    @FXML
    private void addDebt() {
        String name = nameField.getText();
        String amountText = amountField.getText();
        String type = typeField.getText();

        // Validate input fields
        if (name.isEmpty() || amountText.isEmpty() || type.isEmpty()) {
            showAlert("Invalid input", "Please fill in all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            Debt newDebt = new Debt(name, amount, type);
            debtList.add(newDebt);

            // Clear input fields
            nameField.clear();
            amountField.clear();
            typeField.clear();
        } catch (NumberFormatException e) {
            showAlert("Invalid input", "Please enter a valid amount.");
        }
    }

    @FXML
    private void removeDebt() {
        Debt selectedDebt = debtListView.getSelectionModel().getSelectedItem();
        if (selectedDebt != null) {
            debtList.remove(selectedDebt);
        } else {
            showAlert("No selection", "Please select a debt to remove.");
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
