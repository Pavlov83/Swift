
import java.util.*;

/**
 *
 * @author Pavel Pavlov
 */
public class Excercise4_A {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1, str2 = "";
        int i;

        System.out.println("Enter any sentence");
        str1 = sc.nextLine();

        for (i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == 'A' || str1.charAt(i) == 'E' || str1.charAt(i) == 'I' || str1.charAt(i) == 'O' || str1.charAt(i) == 'U' || str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {

            } else {
                str2 = str2 + str1.charAt(i);
            }
        }

        System.out.println(str2);
    }
    
    
}
