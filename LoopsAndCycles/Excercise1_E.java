package LoopsAndCycles;

import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise1_E {
    
    public static void main(String args[]) {
        int temp;                             //capture the input in an integer
        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for check:");

        int num = scan.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //Ifis Prime is true then the number is prime else not
        if (isPrime) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is not Prime Number");
        }
    }
}
