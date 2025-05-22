package main.java.model;

public class Cell {
  private int value;
  private boolean isFixed;

  public Cell() {
    this.value = 0; // Default value for an empty cell
    this.isFixed = false; // Default to not fixed
  }

  public Cell(int value, boolean isFixed) {
    this.value = value;
    this.isFixed = isFixed;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    if(!isFixed) {
      this.value = value;
    } else {
      throw new Error("Cannot change the value of a fixed cell.");
    }
  }

  public void clear() {
    if(!isFixed) {
      this.value = 0; // Reset to empty
    } else {
      throw new Error("Cannot clear a fixed cell.");
    }
  }

  public boolean isEmpty() {
    return value == 0;
  }

  public boolean isFixed() {
    return isFixed;
  }

}
