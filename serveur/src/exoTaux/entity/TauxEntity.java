package exoTaux.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mpgervai.TAUX")
public class TauxEntity {
    private int id;
    private String monnaieA;
    private String monnaieB;
    private double taux;

    public TauxEntity() {
    }

    public TauxEntity(int id, String monnaieA, String monnaieB, double taux) {
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

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}