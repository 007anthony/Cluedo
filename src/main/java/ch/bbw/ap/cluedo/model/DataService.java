package ch.bbw.ap.cluedo.model;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

/**
 * DataService
 * @author bbwpr
 * @version 07.09.2022
 */
@Service
public class DataService {
    private List<Person> persons = List.of(
    new Person("Scarlet", "Miss", "weiblich", "unwerfend schön", Color.yellow),
    new Person("Mustard", "Colonel", "männlich", "Schnauz", Color.black),
    new Person("White", "Mrs", "weiblich", "alt", Color.gray),
    new Person("Plun", "Professor", "männlich", "Brille", Color.gray),
    new Person("Green", "Reverend", "männlich", "Halbglatze", Color.gray),
    new Person("Peacock", "Mrs", "weiblich", "Schmuck", Color.gray)
    );

    private List<Weapon> weapons = List.of(
            new Weapon("Candlestick", 40, 1500, "Dekoration", "schwer", "metal"),
            new Weapon("Dagger", 20, 500, "Messer", "scharf", "metal"),
            new Weapon("Lead Piping", 40, 300, "Rohr", "hard", "metal"),
            new Weapon("Revolver", 17, 2000, "Schusswaffe", "schusskraft", "metal"),
            new Weapon("Rope", 200, 1000, "Seil", "lang", "fasern"),
            new Weapon("Spanner", 25.5, 2500, "Werkzeug", "schwer", "material")
    );
    private List<Scene> scenes = List.of(
            new Scene("Hall", 3, 1, "kacheln", Color.white, "Tisch"),
            new Scene("Lounge", 1, 5, "blauer Teppich", Color.white,
                    "Sofa, Sessel, Tisch"),
            new Scene("Dining Room", 2, 4, "Holz", Color.yellow,
                    "Tisch, Komoden")
    );

    public List<Person> getPersons() {
        return persons;
    }
    public List<Weapon> getWeapons() {
        return weapons;
    }
    public List<Scene> getScenes() {
        return scenes;
    }
}