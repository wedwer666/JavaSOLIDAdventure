package adventureSOLID.allysAndenemys;


import adventureSOLID.interfaceSegregation.IHuman;

/**
 * Created by Maria on 01.12.2018.
 */
public class Comander extends Players implements IHuman{

    @Override
    public int getRaceBonus(Players players) {
        return 50;
    }

    @Override
    public int raceHit() {
        return 60;
    }

    @Override
    public void add(int value) {

    }

    @Override
    public void delete(int value) {

    }

    @Override
    public void humanDamage() {

    }
}
