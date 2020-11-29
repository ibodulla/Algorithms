import java.util.HashSet;
import java.util.Set;

/**
 * Ibodulla Ibodullaev
 */
public class SudokuValidator {

    private boolean validate(int[][] sudoku) {
        int n = 9;

        if(sudoku.length < 1 || sudoku.length > 9)
            return false;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> setIntColumn = new HashSet<>();
            HashSet<Integer> setIntRow = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if ((sudoku[i].length < 1 || sudoku[i].length > 9)
                        || (sudoku[i][j] < 1 || sudoku[i][j] > 9)
                        || (sudoku[j][i] < 1 || sudoku[j][i] > 9)
                        || setIntColumn.contains(sudoku[i][j]) || setIntRow.contains(sudoku[j][i])) {
                    return false;
                }
                setIntColumn.add(sudoku[i][j]);
                setIntRow.add(sudoku[j][i]);
            }
        }
        for (int l = 0; l <= 6; l = l + 3) {
            for (int k = 0; k <= 6; k = k + 3) {
                HashSet<Integer> setIntBoxTwo = new HashSet<>();
                for (int i = l; i < l + 3; i++) {
                    for (int j = k; j < k + 3; j++) {
                        if (setIntBoxTwo.contains(sudoku[i][j])) {
                            return false;
                        }
                        setIntBoxTwo.add(sudoku[i][j]);
                    }
                }
            }
        }
        return true;
    }


}