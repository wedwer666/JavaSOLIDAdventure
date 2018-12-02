package adventureSOLID.allysAndenemys;

import adventureSOLID.interfaceSegregation.IMagic;

/**
 * Created by Maria on 01.12.2018.
 */
public class Witch extends Players implements IMagic{
    @Override
    public int getRaceBonus(Players players) {
        return 0;
    }

    @Override
    public int raceHit() {
        return 0;
    }

    @Override
    public void add(int value) {
        
    }

    @Override
    public void delete(int value) {

    }

    @Override
    public void MagicDamage() {

    }
}
