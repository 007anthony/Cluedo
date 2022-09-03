package ch.bbw.ap.cluedo;

import ch.bbw.ap.cluedo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CluedoController {

    // People
    List<Person> people;

    public CluedoController() {

        people = new ArrayList<>();

        // Scarlet
        Person scarlet = new Person("Scarlet", "Miss", "weiblich", "unwerfend schön", Color.yellow);
        people.add(scarlet);

        // Colonel Mustard
        Person mustard = new Person("Mustard", "Colonel", "männlich", "Schnauz", Color.black);
        people.add(mustard);

        // Mrs White
        Person white = new Person("White", "Mrs", "weiblich", "alt", Color.gray);
        people.add(white);

        // Professor Plun
        Person plun = new Person("Plun", "Professor", "männlich", "Brille", Color.gray);
        people.add(plun);

        // Reverend Green
        Person green = new Person("Green", "Reverend", "männlich", "Halbglatze", Color.gray);
        people.add(green);

        // Mrs Peacock
        Person peacock = new Person("Peacock", "Mrs", "weiblich", "Schmuck", Color.gray);
        people.add(peacock);
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("people", people);

        return "index";
    }
}
