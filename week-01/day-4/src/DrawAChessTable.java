public class DrawAChessTable {
    public static void main(String[] args) {
        int numberOfLines = 7;
        for (int line = 0; line <= numberOfLines; line++) {

            for (int column = 0; column <= numberOfLines; column++) {
                //System.out.print("%");
                // paros sorokban paros oszlopokban van %jel
                // vagy paratlan sorokban, es paratlan oszlopokban %jel
                if (line % 2 == 0 && column % 2 == 0 || line % 2 == 1 && column % 2 == 1) {
                    System.out.print("%");
                } else {
                    // uresen hagyja a helyeket!!
                    System.out.print(" ");
                }
                // sor vegere ertunk, uj sort kezd, kulonben egy sorba irna ki a % jeleket!
                if (column == numberOfLines) {
                    System.out.println();
                }
            }
        }
    }
}
// Create a program that draws a chess table like this
//  01234567
//0 % % % %
//1  % % % %
//2 % % % %
//3  % % % %
//4 % % % %
//5  % % % %
//6 % % % %
//7  % % % %
