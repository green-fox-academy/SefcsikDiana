//- Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
public class Doubling {
    public static void main(String[] args) {
        int baseNum = 123;
        //Print the result of `doubling(baseNum) ezzel a kifezejessel hatarozom meg, hogy idekeruljon a kiiratas!
       System.out.println(doubling(baseNum));
    }
    //called 'doubling' a funkcioba! 11. sorban, es duplazd meg az input parameteret ami, a 10.sorban parameter=(int i)!!
    public static int doubling(int x) {
        x *= 2;
        //returns with an integer! 13. sor
        return x;
    }
}

