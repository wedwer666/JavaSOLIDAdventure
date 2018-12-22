package adventureSOLID.allysAndenemys;

import adventureSOLID.interfaceSegregation.IHuman;

/**
 * Created by Maria on 01.12.2018.
 */
public class Soldier extends Players implements IHuman{
    @Override
    public int getRaceBonus(Players players) {
        return 0;
    }

    @Override
    public int raceHit() {
        return 0;
    }

    @Override
    public int add(int s) {
        return 10;
    }

    @Override
    public void delete(int value) {

    }

    @Override
    public void humanDamage() {

    }

}
