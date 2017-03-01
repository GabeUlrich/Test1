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
        Random gen = new Random();
        int[][] a = new int[20][20];

        for (int row = 0; row < a.length; row++) {
//            System.out.printf("%3d ", row);
            for (int column = 0; column < a[row].length; column++) {
                a[row][column] = (int) (Math.random() * 100);
                System.out.printf("\t" + a[row][column]);
               
            }
        }

        System.out.println();

    }
}
