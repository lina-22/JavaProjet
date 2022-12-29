package chapitre4.date;

import java.time.LocalDate;

public class CDate {
    private int jour ;
    private int mois ;
    private int annee ;
    public CDate() {
        LocalDate date = LocalDate.now() ;
        jour = date.getDayOfMonth();
        mois = date.getMonthValue();
        annee = date.getYear();
    }
    public int getNombreJoursEcoules(int annee) {
        int nb = 0;
        for (int i=annee; i<this.annee; i++) {
            if (testAnneeBissextile(i)==true)
                nb += 366;
            else nb +=365 ;
        }
        nb += getNombreJoursEcoules();
        return nb;
    }
    public int getNombreJoursEcoules() {
        int jours[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (testAnneeBissextile(annee)==true)
            jours[1]=29;
        int nb = 0 ;
        for (int i=0; i<mois-1; i++)
            nb += jours[i] ;
        nb += jour ;
        return nb ;
    }
    public String getDateTexte() {
        return jour+"/"+mois+"/"+annee;
    }
    public int[] getDate() {
        int [] t = new int[3] ;
        t[0] = jour; t[1] = mois; t[2] = annee ;
        return t ;
    }
    public int compareCDate(CDate date) {
        if (annee>date.annee) return 1;
        if (annee<date.annee) return -1;
        // même année
        if (mois>date.mois) return 1;
        if (mois<date.mois) return -1;
        // même année et même mois
        if (jour>date.jour) return 1;
        if (jour<date.jour) return -1;
        // même année et même mois et même jour
        return 0;
    }
    public boolean testAnneeBissextile(int annee) {
        if ((annee%4==0 && annee%100!=0) || annee%400==0)
            return true ;
        else return false ;
    }
    public boolean changeDate(String ladate) {
        //conversion de ladate en tableau de String
        String dates[] = ladate.split("/");
        if (dates.length!=3) return false ;
        int j = Integer.parseInt(dates[0]);
        int m = Integer.parseInt(dates[1]);
        int a = Integer.parseInt(dates[2]);
        return changeDate(j,m,a);
    }
    public boolean changeDate(int jour, int mois, int annee) {
        if (annee<1582)
            return false;
        if (mois<=0 || mois>12)
            return false;
        int jours[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (testAnneeBissextile(annee)==true)
            jours[1]=29;
        if (jour<=0 || jour>jours[mois-1])
            return false ;
        this.jour=jour; this.mois=mois;this.annee=annee;
        return true;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }
}
