public class PrintEven {
    // Create a program that prints all the even numbers between 0 and 500
    public static void main(String[] args) {
        for (int i = 0; i <= 500; i=i+2){
                System.out.println(i);
        }
    }
}


/* masik, pazarlobb megoldas:
    public static void main(String[] args) {
        for (int i = 0; i <= 500; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
} */