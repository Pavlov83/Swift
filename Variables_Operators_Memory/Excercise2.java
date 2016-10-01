package Variables_Operators_Memory;

/**
 * @author Pavel Pavlov
 */
public class Excercise2 {

    // Calculate the following expression: 
    //(3291 + 88581)/14 + (1116 % 171) * 5 - 312/(4+18)
    public static void main(String[] args) {

        byte b1 = 4;                    //assign values to corresponding data types
        byte b2 = 5;
        byte b3 = 14;
        byte b4 = 18;
        short s1 = 171;
        short s2 = 312;
        short s3 = 1116;
        short s4 = 3921;
        int i1 = 88581;

        int result = (s4 + i1) / b3 + (s3 % s1) * b2 - s2 / (b1 + b4); //expression

        System.out.println(result);     //result
    }
}
