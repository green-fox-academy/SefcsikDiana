// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
public class SumAllElements {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        int x = 0;

       /* for (int i = 0; i < ai.length; i++){
            x += ai[i];
        }
        System.out.println(x);
    }
} */
        for (int i : ai) {
            x += i;
        }
        System.out.println(x);
    }
}