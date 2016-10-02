import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise1_A {
    
      public static void main(String[] args) {            //user input
 Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Matrix: ");
        int n = sc.nextInt();

        int count = 1;                          //iteration
        int[][] arr = new int[n][n];
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                arr[col][row] = count;
                count++;
            }
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {     //result
                System.out.print(arr[col][row]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}