package com.sjmillington.naming;

public class Cell {

    private final static int STATUS_VALUE = 0;
    private final static int FLAGGED = 4;

    private int[] cells;

    public Cell(int[] cells) {
        this.cells = cells;
    }

    public boolean isFlagged(){
      return cells[STATUS_VALUE] == FLAGGED;
    }


}
