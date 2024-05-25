package Ex_18042024;

public class Lab037 {
    public static void main(String[] args) {
       int a= 12;
       boolean b =! (a>10 || a< 5);  // The answer is false- ( follow the breakdown steps below)
        //boolean b = (a>12); true   (step 1)
        //  || or  (step 2)
        //boolean b = (a<5); false   (step 3)
        // Compara the result of step 1 and step 3  that is (true || false)           -Step 4
        // Since one of the the condition is true, then acordingg to the OR gate rule, the result is (true)
        //The negate ! the result of Step 4, that is Negate !(true)
        //The answer will be        boolean b = false
System.out.println(b);

    }



}
