package part1;

import java.util.Random;

/**
 * Fill this 20 x 20 int array with random numbers. The numbers should have
 * values between 0 and 99. Then use a nested loop to print out the array row by
 * row with the numbers in evenly spaced columns.
 *
 * @author Your Name Here
 */
public class T1P1 {

    public static void main(String[] args) {
        final int rowWidth = 20;
        final int colHeight = 20;
        Random rand = new Random();
        
        int[][] board = new int[rowWidth][colHeight];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
