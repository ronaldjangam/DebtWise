package src.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

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
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/ExpenseView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Expense");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openIncomeView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/IncomeView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Income");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openDebtView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/view/DebtView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle("Add Debt");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
