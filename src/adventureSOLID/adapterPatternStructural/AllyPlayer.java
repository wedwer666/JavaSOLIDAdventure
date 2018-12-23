package adventureSOLID.adapterPatternStructural;

/**
 * Created by Maria on 23.12.2018.
 * Concrete class 1
 */
public class AllyPlayer implements AdvancedPlayer {
    @Override
    public void playEnemy(String playerName) {
        // no action
    }

    @Override
    public void playAlly(String playerName) {
        System.out.println("Playing advanced level with ally: " + playerName);
    }
}
