package ch.bbw.ap.cluedo;

import ch.bbw.ap.cluedo.Model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;

@Controller
public class CluedoController {

    // People
    private Person scarlet;
    private Person mustard;
    private Person white;
    private Person plun;
    private Person green;
    private Person peacock;

    public CluedoController() {

        // Scarlet
        String[] scarletMermale = {"umwerfend schön"};
        scarlet = new Person("Scarlet", "Miss", "weiblich", scarletMermale, Color.yellow);

        // Colonel Mustard
        String[] mustardMermale = {"Schnauz"};
        mustard = new Person("Mustard", "Colonel", "männlich", mustardMermale, Color.black);

        // Mrs White
        String[] whiteMermale = {"alt"};
        white = new Person("White", "Mrs", "weiblich", whiteMermale, Color.gray);

        // Professor Plun
        String[] plunMermale = {"Brille"};
        plun = new Person("Plun", "Professor", "männlich", plunMermale, Color.gray);

        // Reverend Green
        String[] greenMermale = {"Halbglatze"};
        green = new Person("Green", "Reverend", "männlich", greenMermale, Color.gray);

        // Mrs Peacock
        String[] peacockMermale = {"Schmuck"};
        peacock = new Person("Peacock", "Mrs", "weiblich", peacockMermale, Color.gray);

    }

    @GetMapping("/")
    public void index() {

    }
}
