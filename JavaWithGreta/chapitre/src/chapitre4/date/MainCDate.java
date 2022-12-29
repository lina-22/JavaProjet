package chapitre4.date;

import chapitre4.date.CDate;
public class MainCDate {
    public static void testbissextile(CDate d) {
        System.out.println(d.testAnneeBissextile(2000));
        System.out.println(d.testAnneeBissextile(2008));
        System.out.println(d.testAnneeBissextile(1900));
        System.out.println(d.testAnneeBissextile(2020));
        System.out.println(d.testAnneeBissextile(2022));
    }
    public static void testChangerDate(CDate d) {
        System.out.println(d.changeDate(29, 2, 2020));	//true
        System.out.println(d.changeDate(30, 2, 2020));	//false
        System.out.println(d.changeDate(32, 12, 2018));	//false
        System.out.println(d.changeDate(15, 13, 2018));	//false
        System.out.println(d.changeDate(15, 0, 2018));	//false
        System.out.println(d.changeDate(0, 4, 2018));	//false
    }
    public static void testChangerDateString(CDate d) {
        System.out.println(d.changeDate("29/2/2020"));	//true
        System.out.println(d.changeDate("20/52018"));	//false
        System.out.println(d.changeDate("32/12/2018"));	//false
        System.out.println(d.changeDate("15:13:2018"));	//false
    }
    public static void testCompareDate(CDate d) {
        CDate n = new CDate();
        n.changeDate("23/11/2022");
        System.out.println(d.compareCDate(n));   //-1
        n.changeDate("22/11/2022");
        System.out.println(d.compareCDate(n));	// 0
        n.changeDate("21/11/2022");
        System.out.println(d.compareCDate(n));	// +1
    }
    public static void testGetNombreJours(CDate d) {
        System.out.println(d.getNombreJoursEcoules());
        d.changeDate("31/12/2000");
        System.out.println(d.getNombreJoursEcoules());
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CDate d = new CDate() ;
        System.out.println(d.getJour()+"/"+d.getMois()+"/"+d.getAnnee());
        //testChangerDateString(d);
        //testCompareDate(d);
        System.out.println(d.getDateTexte());
        testGetNombreJours(d);
        CDate e = new CDate() ;
        System.out.println(e.getDateTexte());
        System.out.println(e.getNombreJoursEcoules(2020));
    }
}
