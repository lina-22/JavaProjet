package examChap2.exemplePractice;

public class No1 {
    public static void main(String[] args) {
        int [] tab1 ={4,8,10};
        System.out.println(tab1[2]);
        tab1[1]--;
        System.out.println(tab1[1]);

        double [] tab2 = {1.3,5.6,7.8,4.75};
        System.out.println(tab2[3]);
        tab2[0] = 79.6;
        System.out.println(tab2[0]);

        String[]tab3 = {"toto","tata"};

        char[]tab4 = {'a','b','c','d'};
        System.out.println(tab4[0]);
        tab4[2] +=6;
        System.out.println(tab4[2]);

        int j = 5, k = 3;
        System.out.println(tab4[j-k]);


    }
}
