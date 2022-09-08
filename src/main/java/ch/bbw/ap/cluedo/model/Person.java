package ch.bbw.ap.cluedo.model;

import java.awt.*;

public class Person {

    private String name;
    private String anrede;
    private String geschlecht;
    private String mermale;
    private Color haarfarbe;
    private boolean isAlive;

    public Person(String name, String anrede, String geschlecht, String mermale, Color haarfarbe) {
        this.name = name;
        this.anrede = anrede;
        this.geschlecht = geschlecht;
        this.mermale = mermale;
        this.haarfarbe = haarfarbe;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getMermale() {
        return mermale;
    }

    public void setMermale(String mermale) {
        this.mermale = mermale;
    }

    public Color getHaarfarbe() {
        return haarfarbe;
    }

    @Override
    public String toString() {
        return String.format("{name: %s, anrede: %s, geschlecht: %s, merkmale: %s, haarfarbe: %s, isAlive: %b}",
                getName(), getAnrede(), getGeschlecht(), getMermale(), getHaarfarbe().toString(), isAlive());
    }

    public void setHaarfarbe(Color haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void sterben() {
        setAlive(true);
    }
}
