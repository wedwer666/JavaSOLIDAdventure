package adventureSOLID.adapterPatternStructural;

/**
 * Created by Maria on 23.12.2018.
 */
public class SimplePlayer implements Player {
    PlayerAdapter playerAdapter;
    @Override
    public void play(String typeofPlayer, String playerName) {
        if (typeofPlayer.equalsIgnoreCase("invisible")){
            System.out.println("Playing invisible player: " + playerName);
        }
        else if (typeofPlayer.equalsIgnoreCase("enemy") || typeofPlayer.equalsIgnoreCase("ally")){
            playerAdapter = new PlayerAdapter(typeofPlayer);
            playerAdapter.play(typeofPlayer, playerName);
        }
        else{
            System.out.println("This type of player is not supported: " + typeofPlayer);
        }
    }
}
