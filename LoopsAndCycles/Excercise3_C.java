package LoopsAndCycles;


/**
 *
 * @author Pavel Pavlov
 */
public class Excercise3_C {
     //Print Z-Shape
    
    public static void main(String[] args){
    
    	    
	    int n = 5;
	    for (int row = 0; row < n; row++) {
	        for (int column = 0; column < n; column++) {
	            if (row == 0 || row == n - 1 || column == n - 1 - row) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	}
    
    
    
}
