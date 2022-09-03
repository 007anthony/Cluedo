package ch.bbw.ap.cluedo.Model;

public class Weapon {

    private String name;
    private int laenge;
    private int gewicht;
    private String typ;
    private String merkmal;
    private String material;

    // Constructor
    public Weapon(String name, int laenge, int gewicht, String typ, String merkmal, String material) {
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

    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int laenge) {
        this.laenge = laenge;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
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

    // Method to kill a person
    public void toeten(Person person) {
        person.sterben();
    }
}
