package Ex_18042024;

public class Lab034 {
    public static void main(String[] args) {
        //Logical Operators
        // NOT Gate, OR gate, AND gate

        boolean a = true;
          System.out.println(!a); // This reverses the condition
        // You CANNOT apply the Negation sign at the end of the condition or statement- It wont make any sense to java.
        // For exmaple immedately below
        //System.out.println((30>90)!;)
        System.out.println(!(10>20));// This !  will reverse to the statement to mean 20>10 and the result is true which is the ooposite of false
        System.out.println(!(30>90));//The ! reverses the statement to mean 90 > 30 and the result will be true= which is the opposite of false

        // It is also possible to do Double Negation that is !!
        // Double Negation sign !! reverse the statement/condition again and again
        // You can Tripple Negation !!! as so on and so forth- It keeps reversing again and again
        // For example
        System.out.println(!!(30>90));


    }


}
