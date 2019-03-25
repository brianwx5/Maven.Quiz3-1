package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;

    }

    public TicTacToe() {
        this.board = new String[0][0];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        String[] columns = new String[board.length];
        for (int i = 0; i < board.length ; i++) {
            columns[i] = board[i][value];
        }
        return columns;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        String base = row[0];
        for (int i = 0; i < row.length ; i++) {
            if(base != row[i]) {
                return false;
            }

        }
        return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] column = getColumn(columnIndex);
        String base = column[0];
        for (int i = 0; i < column.length ; i++) {
            if(base != column[i]) {
                return false;
            }
        } return true;
    }

    public String getWinner() {
        for (int i = 0; i < board.length ; i++) {
            if(isRowHomogenous(i)) {
                return getRow(i)[i];
            }
            if(isColumnHomogeneous(i)){
                return getColumn(i)[i];
            }
        }
        return "X";
    }

    public String[][] getBoard() {
        return this.board;
    }
}
