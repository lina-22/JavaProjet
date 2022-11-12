package arrayPracticeAnisVd;

public class Vd56 {

    public static void main(String[] args) {
        int[][]nb = new int [2][3];
        nb[0][0]=10;
        nb[0][1]=30;
        nb[0][2]=40;
        nb[1][0]=70;
        nb[1][1]=60;
        nb[1][2]=80;

        for (int row = 0; row <2 ; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print("  "+nb[row][col]);
            }
            System.out.println();
        }

    }
}
