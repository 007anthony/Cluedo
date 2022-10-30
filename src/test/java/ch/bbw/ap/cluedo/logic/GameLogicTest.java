package ch.bbw.ap.cluedo.logic;

import ch.bbw.ap.cluedo.logic.GameLogic;
import ch.bbw.ap.cluedo.model.Crime;
import ch.bbw.ap.cluedo.model.DataService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    private GameLogic gameLogic;
    private Crime suggestion;
    private Crime secret;
    private DataService service;

    private int numberOfSuggestion;
    private int maxNumberOfSuggestions;
    int i;

    @BeforeEach
    private void setupBevorEachTest() {
        gameLogic = new GameLogic();
        suggestion = new Crime();
        secret = new Crime();
    }

    @Test
    void ActorWeaponSceneNotEqualThenReturnFalseAndHistory0() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;
        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(1);


        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("0", secret.getHistory().get(i));


    }

    @Test
    void ActorEqualWeaponSceneNotEqualThenReturnFalseAndHistory1() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(0);
        secret.setWeapon(1);
        secret.setScene(1);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("1", secret.getHistory().get(i));

    }

    @Test
    void WeaponEqualActorSceneNotEqualThenReturnFalseAndHistory1() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(1);
        secret.setWeapon(0);
        secret.setScene(1);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("1", secret.getHistory().get(i));
    }

    @Test
    void SceneEqualWeaponActorNotEqualThenReturnFalseAndHistory1() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(1);
        secret.setWeapon(1);
        secret.setScene(0);


        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("1", secret.getHistory().get(i));
    }

    @Test
    void ActorWeaponEqualSceneNotEqualThenReturnFalseAndHistory2() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(1);


        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("2", secret.getHistory().get(i));
    }

    @Test
    void ActorSceneEqualWeaponNotEqualThenReturnFalseAndHistory2() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(0);
        secret.setWeapon(1);
        secret.setScene(0);


        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("2", secret.getHistory().get(i));
    }

    @Test
    void WeaponSceneEqualActorNotEqualThenReturnFalseAndHistor2() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(1);
        secret.setWeapon(0);
        secret.setScene(0);


        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("2", secret.getHistory().get(i));
    }

    @Test
    void ActorWeaponSceneEqualThenReturnTrueAndHistoryWin() {
        numberOfSuggestion = 0;
        maxNumberOfSuggestions = 8;

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        assertTrue(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("gewonnen", secret.getHistory().get(i));
    }

    @Test
    void MaxNumberOfSuggestionReachedAndNotWinThenReturnFalseAndHistoryNoneLeft() {
        numberOfSuggestion = 8;
        maxNumberOfSuggestions = 8;
        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(0);
        secret.setWeapon(1);
        secret.setScene(1);

        assertFalse(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("verloren", secret.getHistory().get(i));

    }

    @Test
    void MaxNumberOfSuggestionReachedAndWinThenReturnTrueAndHistoryWin() {
        numberOfSuggestion = 8;
        maxNumberOfSuggestions = 8;
        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        assertTrue(gameLogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestions));
        i = i = secret.getHistory().size() -1;
        assertEquals("gewonnen", secret.getHistory().get(i));

    }
}