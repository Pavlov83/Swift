package ArraysStrings;

import java.util.Scanner;


/**
 *
 * @author Pavel Pavlov
 */
public class Excercise2_A {
    //print largest number without using an array
   public static void main(String[] args) {
        System.out.println("Welcome to Java Program to find largest number " );
        System.out.println("Please enter the amount of numbers to compare: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
       
        System.out.printf("Please enter %d numbers %n", n);
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            if (current > largest) {
                largest = current;
            }
            
        }
        System.out.println("largest of N number is : " + largest);
       
    }

}
