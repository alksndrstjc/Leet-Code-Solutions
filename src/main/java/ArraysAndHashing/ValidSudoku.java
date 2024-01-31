package ArraysAndHashing;

import java.util.*;

public class ValidSudoku {

    //TODO: Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    //    Each row must contain the digits 1-9 without repetition.
    //    Each column must contain the digits 1-9 without repetition.
    //    Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
    // Note:
    //    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    //    Only the filled cells need to be validated according to the mentioned rules.

    private static final int ROW_COLUMN_LENGTH = 9;

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < ROW_COLUMN_LENGTH; i++) {
            if (!isRowValid(board, i) || !isColumnValid(board, i)) return false;
        }

        Map<Box, Set<Character>> boxNumbers = new HashMap<>();
        for (int i = 0; i < ROW_COLUMN_LENGTH; i++) {
            for (int j = 0; j < ROW_COLUMN_LENGTH; j++) {
                if (!isBoxValid(board, i, j, boxNumbers)) return false;
            }
        }

        return true;
    }


    private static boolean isRowValid(char[][] board, int row) {
        Set<Character> rowElements = new HashSet<>();
        for (int i = 0; i < ROW_COLUMN_LENGTH; i++) {
            char currentRowElement = board[row][i];
            if (currentRowElement != '.' && rowElements.contains(currentRowElement)) return false;
            else rowElements.add(currentRowElement);
        }
        return true;
    }

    private static boolean isColumnValid(char[][] board, int column) {
        Set<Character> columnElements = new HashSet<>();
        for (int i = 0; i < ROW_COLUMN_LENGTH; i++) {
            char currentColumnElement = board[i][column];
            if (currentColumnElement != '.' && columnElements.contains(currentColumnElement)) return false;
            else columnElements.add(currentColumnElement);
        }
        return true;
    }

    private static boolean isBoxValid(char[][] board, int row, int column, Map<Box, Set<Character>> boxNumbers) {
        Box box = new Box(row / 3, column / 3);
        char element = board[row][column];
        if (boxNumbers.containsKey(box)) {
            if (element != '.' && boxNumbers.get(box).contains(element)) return false;
            else boxNumbers.get(box).add(element);
        } else {
            HashSet<Character> set = new HashSet<>();
            set.add(element);
            boxNumbers.put(box,set);
        }
        return true;
    }

    private static class Box {
        int row;
        int column;

        public Box(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return row == box.row && column == box.column;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, column);
        }
    }
}
