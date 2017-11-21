package exoTaux.session;

import javax.ejb.Remote;
import java.util.Collection;


@Remote
public interface TauxItf {

    public float conversion(String uneMonnaieA, String uneMonnaieB, float unMontant) throws Exception;
    public void changer(String uneMonnaieA, String uneMonnaieB, float nouveauTaux) throws Exception;
    public Collection<String> getAllTitle();
}