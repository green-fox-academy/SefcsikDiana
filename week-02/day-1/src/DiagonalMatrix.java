public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array with the following matrix. Use a loop!
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        // - Print this two dimensional array to the output
        // [i] jelenti a SOR
        // [j] jelenti az OSZLOP
        int[][] numbers = new int[4][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    numbers[i][j] = 1;
                } else {
                    numbers [i][j] = 0;
                }
                System.out.print(numbers [i][j] + " ");
            }
            System.out.println();
        }
    }
}
        /* Teljesen mukodik, csak lusta valtozat, es nem ketdimenzios array!!
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    System.out.print("1");
                } else System.out.print("0");
            }
            System.out.println();

        }
    }
}

    public static void main(String[] args) {
        int numberOflines = 3;
        for (int line = 0; line <= numberOflines; line++) {

            for (int column = 0; column <= numberOflines; column++) {

                if (line == 0 || column == 0 || line == column || line == numberOflines || column == numberOflines) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                if (column == numberOflines) {
                    System.out.println();
                }
            }
        }
    }
} megoldas
0000
0010
0100
0000    */



