package ch.bbw.ap.cluedo;

import ch.bbw.ap.cluedo.model.Person;
import ch.bbw.ap.cluedo.model.Room;
import ch.bbw.ap.cluedo.model.Weapon;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewController {

    // People
    List<Person> people;

    // Weapons
    List<Weapon> weapons;

    // Rooms
    List<Room> rooms;

    public ViewController() {

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

        // Weapons
        weapons = new ArrayList<>();

        // Candlestick
        Weapon candlestick = new Weapon("Candlestick", 40, 1500, "Dekoration", "schwer",
                "metal");
        weapons.add(candlestick);

        // Dagger
        Weapon dagger = new Weapon("Dagger", 20, 500, "Messer", "scharf", "Metal");
        weapons.add(dagger);

        // Lead Piping
        Weapon leadPiping = new Weapon("Lead Piping", 40, 300, "Rohr", "hart", "Metal");
        weapons.add(leadPiping);

        // Revolver
        Weapon revolver = new Weapon("Revolver", 17, 2000, "Schusswaffe", "Schusskraft",
                "Metal");
        weapons.add(revolver);

        // Rope
        Weapon rope = new Weapon("Rope", 200, 1000, "Seil", "lang", "Fasern");
        weapons.add(rope);

        // Spanner
        Weapon spanner = new Weapon("Spanner", 25.5, 2500, "Werkzeug", "schwer",
                "Metal");
        weapons.add(spanner);

        // Rooms
        rooms = new ArrayList<>();

        // Hall
        Room hall = new Room("Hall", 3, 1, "kacheln", Color.white, "Tisch");
        rooms.add(hall);

        // Lounge
        Room lounge = new Room("Lounge", 1, 5, "blauer Teppich", Color.white,
                "Sofa, Sessel, Tisch");
        rooms.add(lounge);

        // Dining Room
        Room diningRoom = new Room("Dining Room", 2, 4, "Holz", Color.yellow,
                "Tisch, Komoden");
        rooms.add(diningRoom);
    }

    @GetMapping("/showView")
    public String showIndex(Model model) {
        model.addAttribute("people", people);
        model.addAttribute("weapons", weapons);
        model.addAttribute("rooms", rooms);

        return "cluedolistview";
    }
}