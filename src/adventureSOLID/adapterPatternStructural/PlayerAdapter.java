package adventureSOLID.adapterPatternStructural;

/**
 * Created by Maria on 23.12.2018.
 * Adapter class
 */
public class PlayerAdapter implements Player {
    AdvancedPlayer advancedPlayer;

    public PlayerAdapter(String typeofPlayer){
        if(typeofPlayer.equalsIgnoreCase("ally")){
            advancedPlayer = new AllyPlayer();
        }
        else if (typeofPlayer.equalsIgnoreCase("enemy")){
            advancedPlayer = new EnemyPlayer();
        }
    }

    @Override
    public void play(String typeofPlayer, String playerName) {
        if(typeofPlayer.equalsIgnoreCase("ally"))
        {
            advancedPlayer.playAlly(playerName);
        }
        else if (typeofPlayer.equalsIgnoreCase("enemy"))
        {
            advancedPlayer.playEnemy(playerName);
        }
    }
}
