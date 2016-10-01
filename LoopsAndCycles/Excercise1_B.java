package LoopsAndCycles;

/**
 *
 * @author Pavel Pavlov
 */
public class Excercise1_B {

    //print mirror number
    public static void main(String args[]) {
        int n, reverse = 0;
        //This functionality uses user assigned number
        // System.out.println("Enter the number to reverse");
        // Scanner in = new Scanner(System.in);
        // n = in.nextInt();

        n = 8976;

        while (n != 0) {
            reverse = reverse * 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }

}
