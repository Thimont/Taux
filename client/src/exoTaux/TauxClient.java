package exoTaux;

import javax.naming.InitialContext;
import java.io.*;
import java.util.*;

public class TauxClient {
    private static exoTaux.session.TauxItf refBeanTaux;

    public static void main(String[] args) throws Exception{
        try {
            InitialContext ctx = new InitialContext();
            refBeanTaux = (exoTaux.session.TauxItf) ctx.lookup("GestionTaux");
        } catch (Exception ex) {
            System.err.println("erreur dans le lookup");
            ex.printStackTrace();
        }

        double valeurConvertie = refBeanTaux.conversion("euros", "dollars", 1.50);
        System.out.println("Conversion de 1.50 euros en dollars : " + valeurConvertie);

        /*Collection<String> lesTitres = refBeanTaux.getAllTitle();
        for (Iterator i = lesTitres.iterator() ; i.hasNext() ; )
        {
            String unTitre = (String) i.next();
            System.out.println(unTitre);
        }*/

        //refBeanTaux.changer("dollars", "euros", 0.90);
    }
}
