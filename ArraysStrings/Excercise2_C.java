import java.util.Scanner;

/**
 *
 * @author Pavel Pavlov
 */
public class Excercise2_C {
    
   //Count of cluster occurence
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);       //assign size of input
            System.out.println("enter the number of elements");
            String str = sc.nextLine();
            int N = Integer.parseInt(str);

            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {               //assign values of input
                System.out.println("enter element " + (i + 1));
                String str2 = sc.nextLine();
                int number = Integer.parseInt(str2);

                arr[i] = number;
            }

            //find cluster count
            int clusterCount = 0;

            for (int h = 0; h < N - 1; h++) {
                if (arr[h] == arr[h + 1]) {
                    int count = h + 1;
                    while (arr[h] == arr[count]) {
                        count++;
                    }
                    h = count;
                    clusterCount++;
                }
            }                                                 //output 
            System.out.println(clusterCount);

    }
    
}
