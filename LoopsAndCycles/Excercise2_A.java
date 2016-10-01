package LoopsAndCycles;

import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise2_A {
    //Print Sum of Numbers
    public static void main(String args[])
   {

       Scanner console = new Scanner(System.in);

        String input = "";
        int sum = 0;

        System.out.println("Please enter a number: ");
        input = console.next();

        int i = 0;

        while (i < input.length()) {
            char temp = input.charAt(i);
            sum += Character.getNumericValue(temp);
            i++;
        }

        System.out.println("The number entered was " + input + ". The sum of these digits is: " + sum + ".");

    }
}
    

