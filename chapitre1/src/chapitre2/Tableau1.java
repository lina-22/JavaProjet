package chapitre2;

public class Tableau1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] tab1 = {4, 8 , 10}; //(*1)
        double tab2 [] = {1.3, 5.6, 7.8, 4.75}; //(*2)
        String [] tab3 = {"toto", "tata"}; //(*3)
        char tab4 [] = {'a', 'b', 'c', 'd'}; //(*4)

        System.out.println("1er élément: "+tab1[0]);
        System.out.println("2ème élément: "+tab1[1]);
        System.out.println("3ème élément: "+tab1[2]);
        System.out.println("1er élément: "+tab3[0]);
        System.out.println("2ème élément: "+tab3[1]);
        System.out.println();
        tab1[1] = 15;
        System.out.println("1er élément: "+tab1[0]);
        System.out.println("2ème élément: "+tab1[1]);
        System.out.println("3ème élément: "+tab1[2]);
        //System.out.println("3ème élément: "+tab1[3]); Génère une exception déclenchée par l'accès à une case qui n'existe pas

        int t = tab1.length;
        System.out.println("Taille: "+t);
        System.out.println();

        for (int i=0; i<t; i++)
            System.out.print(tab1[i]+"  ");
        System.out.println();
        // On incrémente de 5 la valeur de chaque élément du tableau
        for (int i=0; i<t; i++) {
            tab1[i] = tab1[i]+5;
            System.out.print(tab1[i]+"  ");
        }
        // Autre solution pour parcourir le tableau
        System.out.println();
        for (int x : tab1)
            System.out.print(x+"  ");
        System.out.println();

    }
}
