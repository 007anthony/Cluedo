package ch.bbw.ap.cluedo.logic;

import ch.bbw.ap.cluedo.model.DataService;
import ch.bbw.ap.cluedo.model.Crime;

import java.util.List;
import java.util.Random;

/**
 * GameLogic
 *
 * @author Peter Rutschmann
 * @version 18.09.2022
 */
public class GameLogic {

   /**
    * Setup randomly the secret of the game.
    * @param service Contains the list for actors, weapons and scenes.
    * @param secret  Randomly generate the secret for actor, weapon and scene.
    */
   public void setupNewGame(DataService service, Crime secret){
      Random random = new Random();
      int person = random.nextInt(service.getPersons().size());
      int weapon = random.nextInt(service.getWeapons().size());
      int scene = random.nextInt(service.getScenes().size());

      secret.setActor(person);
      secret.setWeapon(weapon);
      secret.setScene(scene);
   }

   /**
    * Evaluates the suggestion to find the solution of the game.
    * @param suggestion The suggestion from the player
    * @param secret The game secret.
    * @param numberOfSuggestion Current number of suggestion
    * @param maxNumberOfSuggestions Max number of possible suggestions
    * @return true if games ends, false if another suggestion is allowed
    */
   public boolean evaluateSuggestion(Crime suggestion, Crime secret, int numberOfSuggestion, int maxNumberOfSuggestions){

      int counter = 0;

      if(suggestion.getActor() == secret.getActor()) {
         counter++;
      }

      if(suggestion.getScene() == secret.getScene()) {
         counter++;
      }

      if(suggestion.getWeapon() == secret.getWeapon()) {
         counter++;
      }

      List<String> history = secret.getHistory();

      history.add(String.valueOf(counter));

      if(counter == 3 && numberOfSuggestion <= maxNumberOfSuggestions) {
         history.add("gewonnen");
      } else if(numberOfSuggestion >= maxNumberOfSuggestions) {
         history.add("verloren");
      }

      return counter == 3;
   }
}
