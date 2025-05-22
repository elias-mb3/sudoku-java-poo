package main.java.model;

import java.util.HashSet;

public class SudokuValidator {
  public boolean hasConflict(Cell[][] cells) {
        return !validateRows(cells) || !validateColumns(cells) || !validateBlocks(cells);
    }

    private boolean validateRows(Cell[][] cells) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int val = cells[i][j].getValue();
                if (val != 0) {
                    if (seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }
        return true;
    }

    private boolean validateColumns(Cell[][] cells) {
        for (int j = 0; j < 9; j++) {
            HashSet<Integer> seen = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int val = cells[i][j].getValue();
                if (val != 0) {
                    if (seen.contains(val)) return false;
                    seen.add(val);
                }
            }
        }
        return true;
    }

    private boolean validateBlocks(Cell[][] cells) {
        for (int blockRow = 0; blockRow < 3; blockRow++) {
            for (int blockCol = 0; blockCol < 3; blockCol++) {
                HashSet<Integer> seen = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int row = blockRow * 3 + i;
                        int col = blockCol * 3 + j;
                        int val = cells[row][col].getValue();
                        if (val != 0) {
                            if (seen.contains(val)) return false;
                            seen.add(val);
                        }
                    }
                }
            }
        }
        return true;
    }
}
