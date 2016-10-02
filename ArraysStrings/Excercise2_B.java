
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise2_B {
    
    //print sorted numbers in array
    
    public static void main(String[] args){
        int[] a = {10,34,2,56,7,67,88,42}; // input
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {             // for descending order change a[i]>a[j]
                    int temp;   //storing temp value
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
       
    }
    
}
