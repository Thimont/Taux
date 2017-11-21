package exoTaux.session;

import exoTaux.entity.TauxEntity;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.Collection;

@Stateless (mappedName="GestionTaux")
public class TauxBean implements TauxItf {
    @PersistenceContext (unitName="tauxPU")
    private EntityManager em;
    private float taux;
    private TauxEntity tauxEntity;

    public float conversion(String useMonnaieA, String useMonnaieB, float unMontant) throws Exception {
        try {
            taux = (float)em.createQuery("SELECT t.taux from TauxEntity t WHERE t.monnaieA=:unParamA and t.monnaieB=:unParamB").
                    setParameter("unParamA", useMonnaieA).
                    setParameter("unParamB", useMonnaieB).
                    getSingleResult();

            return taux * unMontant;
        } catch (NoResultException e) {
            System.err.println("Aucun résultat");
            e.printStackTrace();
            return -1.0f;
        } catch (NonUniqueResultException ne) {
            System.err.println("Pas de résultat unique");
            ne.printStackTrace();
            return -2.0f;
        }
    }

    public void changer(String uneMonnaieA, String uneMonnaieB, float nouveauTaux) throws Exception {
        try {
            tauxEntity = (TauxEntity) em.createQuery("SELECT t from TauxEntity t WHERE t.monnaieA=:unParamA and t.monnaieB=:unParamB").
                    setParameter("unParamA", uneMonnaieA).
                    setParameter("unParamB", uneMonnaieB).
                    getSingleResult();

            tauxEntity.setTaux(nouveauTaux);
        } catch (NoResultException e) {
            System.err.println("Aucun résultat");
            e.printStackTrace();
        } catch (NonUniqueResultException ne) {
            System.err.println("Pas de résultat unique");
            ne.printStackTrace();
        }
    }

    public Collection<String> getAllTitle() {
        return em.createQuery("SELECT t.monnaieA FROM TauxEntity t").getResultList();
    }
}