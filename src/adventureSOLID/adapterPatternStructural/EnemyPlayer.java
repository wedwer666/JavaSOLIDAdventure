package adventureSOLID.adapterPatternStructural;

/**
 * Created by Maria on 23.12.2018.
 * Concrete class 2
 */
public class EnemyPlayer implements AdvancedPlayer {
    @Override
    public void playEnemy(String playerName) {
        System.out.println("Playing advanced level with enemy: " + playerName);
    }

    @Override
    public void playAlly(String playerName) {
        // no action
    }
}
