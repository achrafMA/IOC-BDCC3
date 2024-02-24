package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        /*
        Injection des dependances par instanciation statique
         */
        DaoImpl d = new DaoImpl();
        MetierImpl metier=new MetierImpl(d);//injectionn via le constructeur
        //metier.setDao(d); //Injection via le setter
        System.out.println("RES = "+metier.calcul());
    }
}
