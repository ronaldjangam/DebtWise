package src.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button btnAddExpense;

    @FXML
    private Button btnAddIncome;

    @FXML
    private Button btnAddDebt;

    @FXML
    public void initialize() {
        btnAddExpense.setOnAction(e -> openExpenseView());
        btnAddIncome.setOnAction(e -> openIncomeView());
        btnAddDebt.setOnAction(e -> openDebtView());
    }

    private void openExpenseView() {
        // Navigate to Expense view (open ExpenseView.fxml)
    }

    private void openIncomeView() {
        // Navigate to Income view (open IncomeView.fxml)
    }

    private void openDebtView() {
        // Navigate to Debt view (open DebtView.fxml)
    }
}
