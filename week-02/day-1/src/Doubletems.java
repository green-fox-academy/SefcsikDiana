// - Create an array variable named `numList` with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array
public class Doubletems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        // 1. megoldas, for each loop nelkul!!
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * 2;
            // egymas ala irja ki az eredmenyt!
            System.out.println(numList[i]);
        }
        // egymas melle irja ki az eredmenyt, spaccel elvalasztva!
        //System.out.print (numList[i] + " ");
    }
}

/*      2. megoldas for each loop-pal:
        int[] numList = {3, 4, 5, 6, 7};
        for (int i = 0; i < numList.length; ++i) {
            numList[i] = numList[i] * 2;
        }
        for (int i : numList) {
            System.out.print(i + " ");
        }
    }
} */