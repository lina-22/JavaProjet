package chapitre4.date;

import java.time.LocalDate;

public class CDate {

    private int jour;

    private int mois;

    private int annee;

    public CDate(){
        LocalDate date = LocalDate.now();
        int jour = date.getDayOfMonth();
        int mois = date.getMonthValue();
        int annee = date.getYear();
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
