package main.java;

import java.util.Scanner;

import main.java.model.Board;
import main.java.model.GameStatus;

public class Game {
    private GameStatus status;
    private boolean hasErrors;
    private Board board;
    private Scanner scanner;

    public Game(Scanner scanner) {
        this.status = GameStatus.NOT_STARTED;
        this.hasErrors = false;
        this.board = new Board();
        this.scanner = scanner;
    }

    public void start(int[][] fixedValues) {
        // Preenche os valores fixos no tabuleiro
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (fixedValues[i][j] != 0) {
                    board.setFixedNumber(i, j, fixedValues[i][j]);
                }
            }
        }
        this.status = GameStatus.IN_PROGRESS;
        System.out.println("New game started!");
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n====== Sudoku Menu ======");
            System.out.println("1 - Start new game");
            System.out.println("2 - Insert number");
            System.out.println("3 - Remove number");
            System.out.println("4 - View board");
            System.out.println("5 - Check game status");
            System.out.println("6 - Clear user numbers");
            System.out.println("7 - Finalize game");
            System.out.println("8 - Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Starting new game...");

                    int[][] fixed = new int[9][9];
                    // Exemplo: aqui você poderia preencher fixed manualmente ou receber por args
                    // fixed[0][0] = 5;

                    start(fixed);
                }
                case 2 -> {
                    System.out.print("Enter row (0-8): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column (0-8): ");
                    int col = scanner.nextInt();
                    System.out.print("Enter number (1-9): ");
                    int val = scanner.nextInt();
                    board.setNumber(row, col, val);
                }
                case 3 -> {
                    System.out.print("Enter row (0-8): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column (0-8): ");
                    int col = scanner.nextInt();
                    board.removeNumber(row, col);
                }
                case 4 -> board.display();
                case 5 -> checkStatus();
                case 6 -> board.clearUserNumbers();
                case 7 -> finalizeGame();
                case 8 -> System.out.println("Exiting game...");
                default -> System.out.println("Invalid option!");
            }

        } while (option != 8);
    }
    public void startWithMatrix(int[][] values, boolean[][] fixed) {
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            int value = values[i][j];
            boolean isFixed = fixed[i][j];
            if (value != 0) {
                if (isFixed) {
                    board.setFixedNumber(i, j, value);
                } else {
                    board.setNumber(i, j, value);
                }
            }
        }
    }

    this.status = GameStatus.IN_PROGRESS;
    System.out.println("Game started with preset matrix!");
}
    public void checkStatus() {
        if (status == GameStatus.NOT_STARTED) {
            System.out.println("Game not started. No errors.");
            return;
        }

        hasErrors = board.hasConflicts();

        if (board.isFull() && !hasErrors) {
            status = GameStatus.COMPLETED;
        }

        System.out.println("Status: " + status);
        System.out.println("Has errors? " + hasErrors);
    }

    public void finalizeGame() {
        hasErrors = board.hasConflicts();

        if (!board.isFull()) {
            System.out.println("Board not complete. Fill all cells first.");
        } else if (hasErrors) {
            System.out.println("Board is filled but has conflicts!");
        } else {
            status = GameStatus.COMPLETED;
            System.out.println("Congratulations! You completed the Sudoku!");
        }
    }
}