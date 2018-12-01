package adventureSOLID.allysAndenemys;



/**
 * Created by Maria on 01.12.2018.
 */
public class Comander extends Players{
     
    @Override
    public int getRaceBonus(Players players) {
        return 50;
    }

    @Override
    public int raceHit() {
        return 60;
    }

}
