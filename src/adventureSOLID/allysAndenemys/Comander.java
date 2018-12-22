package adventureSOLID.allysAndenemys;


import adventureSOLID.interfaceSegregation.IHuman;

/**
 * Created by Maria on 01.12.2018.
 */
public class Comander extends Players implements IHuman{

    public int getRaceBonus() {
        return 50;
    }

    @Override
    public int getRaceBonus(Players players) {
        return 0;
    }

    @Override
    public int raceHit() {
        return 60;
    }

    @Override
    public int add(int s) {
        return 5;
    }

    @Override
    public void delete(int value) {

    }

    @Override
    public void humanDamage() {

    }

}
