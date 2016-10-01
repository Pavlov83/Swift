

/**
 *
 * @author Pavel Pavlov
 */

 //Convert to binary and hexa
    
   


import java.util.Scanner;
 
 public class Excercise1_F {
     
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         System.out.print("The decimal number is: ");
         int n = sc.nextInt();
         
         System.out.println("The binary number is: " + Integer.toBinaryString(n));
         System.out.println("The hexadecimal number is: " + Integer.toHexString(n));                
     }
     
 }