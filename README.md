# DebtWise

## Overview
DebtWise is a financial management application designed to assist users in tracking and managing their debt, income, and expenses efficiently. The application provides a user-friendly interface for managing financial data and analyzing personal finance trends to support better decision-making.

---

## Goals and Objectives
- Facilitate debt management by allowing users to add, view, and remove debts.
- Enable income tracking through an intuitive input and display system.
- Provide tools for managing and analyzing expenses.
- Deliver a user-friendly graphical interface for interacting with financial data.

## System Overview
The system architecture is based on a Model-View-Controller (MVC) design pattern:
- ### Model
  Represents the data structure and business logic. This includes:
  
    - Debt.java
    - Income.java
    - Expense.java
    - MainApp.java

- ### View
  Provides the graphical user interface (GUI) written in FXML, located in the view folder. It includes layout definitions for input   fields, buttons, and tables to interact with debts, income, and expenses. This includes:

    - DebtManagementView.fxml
    - ExpenseManagementView.fxml
    - IncomeManagementView.fxml
      
- ### Controller
  Manages user interactions, input validation, and business logic. The controllers handle adding, removing, and displaying data.

    - DebtManagementController.java
    - ExpenseController.java
    - IncomeManagementController.java
    - MainController.java

---

## Functional Requirements

### Debt Management
- **Add New Debt**: Add a new debt to the list.
- **Remove Debt**: Delete a selected debt from the list.
- **Display Debts**: View all debts in a list.

### Expense Management
- **Add New Expense**: Add a new expense to the list.
- **Delete Expense**: Remove a selected expense from the list.
- **Display Expenses**: View all expenses in a list.

### Income Management
- **Add New Income**: Add a new income to the list.
- **Delete Income**: Remove a selected income from the list.
- **Display Incomes**: View all income records in a list.


## Non-Functional Requirements

### Maintainability
- Modular code design to enable integration of additional financial categories (e.g., investments).
---

## Technology Stack

### Frontend
- **JavaFX**: For UI components and interaction handling.

### Backend
- **Java**: For core business logic and data handling.

---
