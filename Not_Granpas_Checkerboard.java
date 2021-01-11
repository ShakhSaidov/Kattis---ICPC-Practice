import java.io.IOException;
import java.util.Scanner;

public class Not_Granpas_Checkerboard {
    /**
     *
     * @param n number of squares per row/column
     * @param board the grid to be checked
     */
    private static boolean checkRow(int n, char board[][]) {
        int half = n / 2;

        for (int row = 0; row < n; row++) {
            int count = 0;
            var line = new StringBuilder();
            for (int column = 0; column < n; column++) {
                if(board[row][column] == 'B') count++;
                line.append(board[row][column]);
            }

            if (count != half || line.toString().contains("WWW") || line.toString().contains("BBB")) {
                return false;
            }
        }

        return true;
    }

    /**
     *
     * @param n number of squares per row/column
     * @param board the grid to be checked
     */
    private static boolean checkColumn(int n, char board[][]) {
        int half = n / 2;

        for (int column = 0; column < n; column++) {
            int count = 0;
            var line = new StringBuilder();
            for (int row = 0; row < n; row++) {
                if(board[row][column] == 'B') count++;
                line.append(board[row][column]);
            }
            if (count != half || line.toString().contains("WWW") || line.toString().contains("BBB")) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            char[][] board = new char[n][n];

            for (int i = 0; i < n; i++) {
                board[i] = scan.next().toCharArray();
            }

            System.out.println((checkRow(n, board) && checkColumn(n, board)) ? 1 : 0);
            scan.close();
        } catch (Exception e) {
            System.out.println("Encountered exception: " + e);
        }
    }
}
