package Ex_18042024;

public class Lab043 {
    public static void main(String[] args) {
        //float course = 100;
        //float GST = 18.45f;
       // double total = course + GST;
       // System.out.println(total);

        // Whenever 2 floats are used, the result will be double

        float lesson = 200;
        float GST = 18.75f;
        double total = lesson + (int)GST; // Now, the GST is coverted to integar, and the integar part is 18
        System.out.println(total);
        // Here, I want the integar part of the GST


    }
}
