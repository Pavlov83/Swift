package LoopsAndCycles;

import java.util.Scanner;

/**
 *
 * @author Pavel Pavlov
 */
public class Excercise2_C {
    
	   public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);

        System.out.println("Please insert a number");
        int limit = in.nextInt();
        //define limit

        System.out.println("Printing Even numbers between 1 and " + limit);

        for (int i = 1; i <= limit; i++) {

            // if the number is divisible by 2 then it is even
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

