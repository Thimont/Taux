package exoTaux.session;

import javax.ejb.Remote;
import java.util.Collection;


@Remote
public interface TauxItf {

    public double conversion(String uneMonnaieA, String uneMonnaieB, double unMontant) throws Exception;
    public void changer(String uneMonnaieA, String uneMonnaieB, double nouveauTaux) throws Exception;
    public Collection<String> getAllTitle();

}