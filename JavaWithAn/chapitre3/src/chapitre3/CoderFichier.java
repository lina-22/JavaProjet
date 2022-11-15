package chapitre3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CoderFichier {

    public static char[] lireFichier(String nomFichier) {
        byte[] b = null;
        try {
            b = Files.readAllBytes(Paths.get(nomFichier));
        } catch (IOException e) {
// TODO Auto-generated catch block
            System.out.println("Erreur de lecture sur le fichier");
            System.exit(0);
        }
        int taille = b.length;
        char[] c = new char[taille];
        for (int i = 0; i < taille; i++)
            c[i] = (char) b[i];
        for (int i = 0; i < taille; i++)
            System.out.print(c[i]);
        return c ;
    }
    public static boolean estMinuscule(char c) {
		/*if (Character.isLowerCase(c)==true)
			return true ;
		else return false ;*/
		/*if (c>='a' && c <='z')
			return true ;
		else return false ;*/
        return Character.isLowerCase(c);
    }
    public static char coderCar(char c, int n) {
        char car = (char) (c+n) ;
        return car ;
    }
    static char[] decoderMessage(char []texteCode, int n) {
        char t[] = new char[texteCode.length];
        for (int i=0; i<texteCode.length; i++) {
            if (texteCode[i] >='c' && texteCode[i]<='|')
                t[i] = (char) (texteCode[i]-2) ;
            else t[i] = texteCode[i] ;
        }
        return t ;
    }
    public static void ecrireFichier(String nomFichier, char []texte) {
        byte b[] = new byte[texte.length];
        for (int i=0; i<texte.length;i++)
            b[i] = (byte) texte[i] ;
        try {
            Files.write(Paths.get(nomFichier), b);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String nomFichier = "C:\\Users\\GMTE94\\Desktop\\texte.txt";
        char texte[] = lireFichier(nomFichier);
        char texteCode[] = new char[texte.length];
        for (int i=0; i<texte.length; i++) {
            if (estMinuscule(texte[i])==true)
                texteCode[i] = coderCar(texte[i],2) ;
            else texteCode[i] = texte[i] ;
        }
        System.out.println();
        for (int i=0; i<texteCode.length;i++)
            System.out.print(texteCode[i]);
        System.out.println('\n');

        char newTexte[] = decoderMessage(texteCode,2);
        for (int i=0; i<newTexte.length;i++)
            System.out.print(newTexte[i]);
        System.out.println();
        String nomFichierDest = "C:\\Users\\GMTE94\\Desktop\\textecode.txt";
        ecrireFichier(nomFichierDest,texteCode);
    }
}

