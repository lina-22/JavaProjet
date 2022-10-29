package examChap1;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        System.out.println("Plz enter a number");
        Scanner sc = new Scanner(System.in);
         int nb = sc.nextInt();
//         normal ************
//        for (int row = 1; row <=nb ; row++) {
//            for (int col = 1; col <=nb ; col++) {
//                System.out.print("1 ");
//            }
//            System.out.println();

//        normal ************ end

//        normal ************
//        for (int row = 1; row <=nb ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        end*****************

//        increasing triangle ************
//        for (int row = 1; row <=nb ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //        end*****************

        //        decreasing triangle ************
//        for (int row = 1; row <=nb ; row++) {
//            for (int col = row; col <=nb ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //        end*****************

        //        decreasing space and increasing * ************
//        for (int row = 1; row <=nb ; row++) {
//            for (int col = row; col <=nb ; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //        end*****************

        //        increasing space and decreasing * ************
//        for (int row = 1; row <=nb ; row++) {
//            for (int col = 1; col <=row ; col++) {
//                System.out.print("  ");
//            }
//            for (int col = row; col <=nb ; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        //        end*****************

        //      decreasing space + increasing * and increasing * again * ************
//        for (int row = 1; row <=nb; row++) {
//            for (int col = row; col <=nb; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <=row; col++) {
//                System.out.print("*");
//            }
//            for (int col = 1; col <=row; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //        end*****************

        //        Hill Pattern = decreasing space + increasing * and increasing * again * ************
//        for (int row = 1; row <=nb; row++) {
//            for (int col = row; col <=nb; col++) {
//                System.out.print(" ");
//            }
//            for (int col = 1; col <row; col++) {
//                System.out.print("*");
//            }
//            for (int col = 1; col <=row; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //        end*****************

        //     Reverse Hill Pattern =  increasing * and increasing * again * +decreasing space +************
//        for (int row = 1; row <=nb; row++) {
//            for (int col = 1; col <=row; col++) {
//                System.out.print(" ");
//            }
//            for (int col = row; col <nb; col++) {
//                System.out.print("*");
//            }
//            for (int col = row; col <=nb; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //        end*****************

        //        Diamond patern* ************
        for (int row = 1; row <=nb; row++) {
            for (int col = row; col <=nb; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <row; col++) {
                System.out.print("*");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row <=nb; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(" ");
            }
            for (int col = row; col <nb; col++) {
                System.out.print("*");
            }
            for (int col = row; col <=nb; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //        end*****************
    }
}
