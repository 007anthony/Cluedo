package ch.bbw.ap.cluedo.model;

public class Weapon {

    private String name;
    private double laenge;
    private double gewicht;
    private String typ;
    private String merkmal;
    private String material;

    // Constructor
    public Weapon(String name, double laenge, double gewicht, String typ, String merkmal, String material) {
        this.name = name;
        this.laenge = laenge;
        this.gewicht = gewicht;
        this.typ = typ;
        this.merkmal = merkmal;
        this.material = material;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getMerkmal() {
        return merkmal;
    }

    public void setMerkmal(String merkmal) {
        this.merkmal = merkmal;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format("name: %s, laenge: %f, gewicht: %f, typ: %s, mermal: %s, material: %s",
                getName(), getLaenge(), getGewicht(), getTyp(), getMerkmal(), getMaterial());
    }

    // Method to kill a person
    public void toeten(Person person) {
        person.sterben();
    }
}
