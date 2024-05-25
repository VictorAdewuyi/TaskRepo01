package Ex_18042024;

public class Lab049 {
    public static void main(String[] args) {
        // More Example

        int a = 10;
        System.out.println(++a + a++ + a++);  // Like Lab048, divide the expression into parts
        // Part  A ---> ++a, Expression Value 1 = 11, a = 12
        // Part B ----> a++  Expression Value 2 = 11, a = 12
        //Part C ----> ++a   Expression Value 3 = 12, a = 13

        // Output ---> expV1+expV2 +expV3
        //What is the Value of a?
        System.out.println(a);
    }
}
