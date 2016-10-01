
package Variables_Operators_Memory;

/**
 * @author Pavel Pavlov
 */
public class Excercise3 {
    
// Check if  given year is leap.
    
   public static void main(String[] args){
       
      int year =  1980;   // user input
      
      
                      //if can be divided by 100 and 400  also should be divided by 4;
       boolean check = ((year % 100 !=0)||(year % 400 != 0)) && (( year % 4 == 0));
       
          System.out.println(check); // result
       
       
       
   }
    
    
    
    
    
    
    
}



