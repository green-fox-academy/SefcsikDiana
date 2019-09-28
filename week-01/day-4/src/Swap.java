public class Swap {
     //Swap the values of the variables
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int c = a; // c=123
        a = b; // a= 526
        b = c; // b=123

        System.out.println("a=" + a + " b=" + b);


        //int a = 123;
       // int b = 526;
        a = a + b; // a=7
        b = a - b;  // b=7-4=3
        a = a - b;  // a=7-3=4
        System.out.println("a=" + a + " b=" + b);

    }
}