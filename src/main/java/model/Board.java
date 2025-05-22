package main.java.model;

public class Board {
  private Cell[][] cells;
  private SudokuValidator validator;


  public Board() {
    cells = new Cell[9][9];
    validator = new SudokuValidator();

    //initialize the board with empty cells
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        cells[i][j] = new Cell();
      }
    }
  }

  public void setFixedNumber(int row, int col, int value) {
    cells[row][col] = new Cell(value, true);  
  }

  public void setNumber(int row, int col, int value) {
    if (!cells[row][col].isFixed()) {
      cells[row][col].setValue(value);
    } else {
       System.out.println("Essa é uma célula fixa, não pode ser alterada.");
    }
  }

  public void removeNumber(int row, int col) {
    if (!cells[row][col].isFixed()) {
      cells[row][col].clear();
    } else {
      System.out.println("Essa é uma célula fixa, não pode ser alterada.");
    }
  }
  public void clearUserNumbers() {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (!cells[i][j].isFixed()) {
          cells[i][j].clear();
        }
      }
    }
  }
  public boolean isFull() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (cells[i][j].isEmpty()) return false;
            }
        }
        return true;
    }
public boolean hasConflicts() {
        return validator.hasConflict(cells);
    }

    public void display() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) System.out.println("+-------+-------+-------+");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) System.out.print("| ");
                int val = cells[i][j].getValue();
                System.out.print(val == 0 ? ". " : val + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }

    public Cell[][] getCells() {
        return cells;
    }
}
