package chapitre2;

public class E1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char t[] = {'a','b','c','d','e','f','g','h','i','j'};

        for(int i=0; i<t.length;i++) {
            System.out.print(t[i]+"  ");
        }
        System.out.println();


        //Autre solution pour créer le tableau
        char t1[] = new char[10];

        for (int i=0; i<t1.length;i++)
            t1[i] = (char) ('a'+ i) ;
        for (int i=0;i<t1.length; i++)
            System.out.print(t1[i]+"  ");

    }
}
