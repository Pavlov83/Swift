package ArraysStrings;

import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise1_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix Size: ");   //Definition of matrix size
        int n = sc.nextInt();
        int count = 1;                              //declare variables
        int remain = count;
        
        
        int[][] arr = new int[n][n];
        for (int col = 0; col < n; col++) {          //iteration algorithm
            remain = count;
            if (col != 0 && col % 2 == 0) {
                count += n;
            }
            for (int row = 0; row < n; row++) {
                if (col % 2 == 0) {

                    arr[row][col] = count;
                    count++;
                } else {
                    arr[row][col] = remain + n - 1;
                }
                remain--;
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {        // result
                System.out.print(arr[row][col]);
                System.out.print(" ");

            }
            System.out.println();
        }

}
    
}
