package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class ExpenseController {

    @FXML
    private TextField txtExpenseDescription;

    @FXML
    private TextField txtExpenseAmount;

    @FXML
    private ListView<String> expenseListView;

    @FXML
    public void addExpense() {
        String description = txtExpenseDescription.getText();
        String amount = txtExpenseAmount.getText();
        if (!description.isEmpty() && !amount.isEmpty()) {
            expenseListView.getItems().add("Expense: " + description + " - " + amount);
            clearFields();
        }
    }

    @FXML
    public void deleteExpense() {
        String selectedExpense = expenseListView.getSelectionModel().getSelectedItem();
        if (selectedExpense != null) {
            expenseListView.getItems().remove(selectedExpense);
        }
    }

    private void clearFields() {
        txtExpenseDescription.clear();
        txtExpenseAmount.clear();
    }
}
