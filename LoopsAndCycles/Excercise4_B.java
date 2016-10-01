
/**
 *
 * @author Pavel Pavlov
 */
public class Excercise4_B {
    
    	//word counter
    public static void main(String[] args) {

        System.out.println("Simple Java Word Count Program");

        String str1 = "Today is my new Java Wordcounter";

        int wordCount = 1;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                wordCount++;
            }
        }

        System.out.println("Word count is = " + wordCount);
    }

	}
    
