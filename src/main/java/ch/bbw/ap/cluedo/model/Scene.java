package ch.bbw.ap.cluedo.model;

import java.awt.*;

public class Scene {

    private String name;
    private int anzahlTueren;
    private int anzahlFenster;
    private String boden;
    private Color wandFarbe;
    private String moebel;

    public Scene(String name, int anzahlTueren, int anzahlFenster, String boden, Color wandFarbe, String moebel){
        this.name = name;
        this.anzahlTueren = anzahlTueren;
        this.anzahlFenster = anzahlFenster;
        this.boden = boden;
        this.wandFarbe = wandFarbe;
        this.moebel = moebel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlTueren() {
        return anzahlTueren;
    }

    public void setAnzahlTueren(int anzahlTueren) {
        this.anzahlTueren = anzahlTueren;
    }

    public int getAnzahlFenster() {
        return anzahlFenster;
    }

    public void setAnzahlFenster(int anzahlFenster) {
        this.anzahlFenster = anzahlFenster;
    }

    public String getBoden() {
        return boden;
    }

    public void setBoden(String boden) {
        this.boden = boden;
    }

    public Color getWandFarbe() {
        return wandFarbe;
    }

    public void setWandFarbe(Color wandFarbe) {
        this.wandFarbe = wandFarbe;
    }

    public String getMoebel() {
        return moebel;
    }

    public void setMoebel(String moebel) {
        this.moebel = moebel;
    }

    @Override
    public String toString() {
        return String.format("name: %s, anzahlTueren: %d, anzahlFenster: %d, boden: %s, wandFarbe: %s, moebel: %s",
                getName(), getAnzahlTueren(), getAnzahlFenster(), getBoden(), getWandFarbe().toString(), getMoebel());
    }
}
