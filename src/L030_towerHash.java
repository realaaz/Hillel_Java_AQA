public class L030_towerHash {


    public static void main(String[] args) {

        towerForRobert(6);
    }


    public static void towerForRobert(int height) {
        towerOut(2, height);
    }


    public static void towerOut(int startHash, int lines) {

        for (int i = 0; i < lines; i++) {

            // first spaces
            for (int j = 0; j < lines - startHash + 1; j++) {
                System.out.print(" ");
            }

            // hashes #1
            for (int j = 0; j < startHash; j++) {
                System.out.print("#");
            }

            // double spaces
            System.out.print("  ");

            // hashes #2 TODO: may be remove duplicates (call hashes counter) from function ???
            for (int j = 0; j < startHash; j++) {
                System.out.print("#");
            }

            System.out.println();
            startHash = startHash + 1;
        }

    }

}