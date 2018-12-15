package Chapter2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntentionalRevealingNames {
    // difficult code to understand because of the naming
    // 1) what are the things inside theList?
    // 2) what is the significance of the zeroth subscript of an item in theList?
    // 3) what is the significance of the value 4?
    // 4) what would I use the list being returned?
    private List<int[]> theList;

    public List<int[]> geThem() {
        List<int[]> list1 = new ArrayList<>();
        for(int[] x : theList) {
            if (x[0] == 4)
                list1.add(x);
        }

        return list1;
    }


    // say we are working on a minesweeper game
    // we have a board that is a list of cells called theList, which is renamed to gameBoard
    // each cell is represented by a single array
    // the zeroth is the location of a status value
    // and the status value of 4 means flagged
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 4;
    private List<int[]> gameBoard;

    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();

        for (int[] cell: gameBoard) {
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        }

        return flaggedCells;
    }


    private static class Cell {
        private boolean flagged;

        public boolean isFlagged() {
            return flagged;
        }
    }

    private List<Cell> gameBoard2;
    public List<Cell> getFlaggedCells2() {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell: gameBoard2)
            if (cell.isFlagged())
                flaggedCells.add(cell);

        return flaggedCells;
    }
}
