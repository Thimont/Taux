package exoTaux.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TAUX")
public class TauxEntity {
    private int id;
    private String monnaieA;
    private String monnaieB;
    private float taux;

    public TauxEntity() {
    }

    public TauxEntity(int id, String monnaieA, String monnaieB, float taux) {
        this.id = id;
        this.monnaieA = monnaieA;
        this.monnaieB = monnaieB;
        this.taux = taux;
    }

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonnaieA() {
        return monnaieA;
    }

    public void setMonnaieA(String monnaieA) {
        this.monnaieA = monnaieA;
    }

    public String getMonnaieB() {
        return monnaieB;
    }

    public void setMonnaieB(String monnaieB) {
        this.monnaieB = monnaieB;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }
}