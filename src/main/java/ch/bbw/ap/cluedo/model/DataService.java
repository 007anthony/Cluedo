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

    public List<Person> getPersons() {
        return persons;
    }
}