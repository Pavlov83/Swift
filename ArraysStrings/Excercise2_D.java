package ArraysStrings;

import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise2_D {
    
    
    public static void main(String[] args) {

        //Creating the array and setting the number of its elements ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        String str = sc.nextLine();
        int N = Integer.parseInt(str);

        int[] arr = new int[N];

        //Giving value to the elements
        for (int i = 0; i < N; i++) {
            System.out.println("enter element " + (i + 1));
            String str2 = sc.nextLine();
            int number = Integer.parseInt(str2);

            arr[i] = number;
        }

        //finding the index where is the middle of sum
        int sum = 0;
        for (int j = 0; j < N; j++) {
            sum += arr[j];
        }
        if (sum % 2 != 0) {
            System.out.print("NO");
        } else {
            int half = sum / 2;
            int temp = 0;
            for (int k = 0; k < N; k++) {
                temp += arr[k];
                if (temp == half) {
                    System.out.print("index " + k);
                    break;
                }
                if (temp > half) {
                    System.out.print("NO");
                    break;
                }
            }
        }
    }
    
    
}
