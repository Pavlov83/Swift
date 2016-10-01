
package LoopsAndCycles;

/**
 *
 * @author Pavel Pavlov
 */
public class Excercise1_C {
    //Print Sum of Digits
    
    public static void main(String args[]){
   
        int[] array = {8, 1, 7, 2, 6, 1};
      int sum = 0;
      //Advanced for loop
      for( int num : array) {
          sum = sum + num;
      }
      System.out.println("Sum of array elements is: "+ sum);
   }
}
    
    
 
    

