


/**
 *
 * @author Pavel Pavlov
 */
public class Excercise3_A {
    //Print Square
    
    public static void main(String[] args) {

        int m = 6;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m) {
                    System.out.print("*");
                } else if (j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }

}
