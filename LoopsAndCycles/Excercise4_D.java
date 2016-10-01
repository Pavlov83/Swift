/**
 *
 * @author Pavel Pavlov
 */
public class Excercise4_D {
    //Sum of numbers in string
    	public static void main(String[] args) {
		String str = "12 hi when 8 and 9";
		str=str.replaceAll("[\\D]+"," ");
		String[] numbers=str.split(" ");
		int sum = 0;
                for (String number : numbers) {
                    try {
                        sum += Integer.parseInt(number);
                    }catch( Exception e ) {
                        //Just in case, the element in the array is not parse-able into Integer, Ignore it
                    }
                }
		System.out.println("The sum is:"+sum);

	}
    
}
