package ch.bbw.ap.cluedo.control;

import ch.bbw.ap.cluedo.model.DataService;
import ch.bbw.ap.cluedo.model.Scene;
import ch.bbw.ap.cluedo.model.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private DataService dataService;

    @GetMapping("/showView")
    public String showIndex(Model model) {
        model.addAttribute("people", dataService.getPersons());
        model.addAttribute("weapons", dataService.getWeapons());
        model.addAttribute("scenes", dataService.getScenes());

        return "cluedolistview";
    }
}
