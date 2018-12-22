package adventureSOLID.allysAndenemys;


import adventureSOLID.interfaceSegregation.IMagic;

/**
 * Created by Maria on 01.12.2018.
 */
public class Mage extends Players implements IMagic{
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
        return 1;
    }

    @Override
    public void delete(int value) {

    }

    @Override
    public void MagicDamage() {

    }

}
