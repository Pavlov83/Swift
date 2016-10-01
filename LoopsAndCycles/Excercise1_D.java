package LoopsAndCycles;

import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise1_D {
    //Print All Divisors
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);          //User Input
        System.out.println("Enter number");
        int n = sc.nextInt();

        int i = 0;
        System.out.print("1,");                      //Constant Value                  

        for (i = 2; i <= n / 2; i++) {          //incrementing with division by two
            if (n % i == 0) {
                System.out.print(i + ",");
            }

        }

        System.out.println(n);

    }

    
    
    
    
    
}
