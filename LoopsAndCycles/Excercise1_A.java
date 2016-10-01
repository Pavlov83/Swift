package LoopsAndCycles;

import java.util.Scanner;
/**
 *
 * @author Pavel Pavlov
 */


public class Excercise1_A {
    //print first digit

    public static void main(String[] args) {
        int a;
        int lastdigit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int n = input.nextInt();

        while (n > 10) {
            n = n / 10;
        }

        System.out.println(n);

    }
    
    
}
