package adventureSOLID.allysAndenemys;

import adventureSOLID.interfaceSegregation.IDeamon;

/**
 * Created by Maria on 22.12.2018.
 */
public class Deamon extends Players implements IDeamon {
    @Override
    public int add(int s) {
      return 10;
    }

    @Override
    public void delete(int value) {

    }

    @Override
    public void deamonDamage() {

    }

    @Override
    public int getRaceBonus(Players players) {
        return 0;
    }

    @Override
    public int raceHit() {
        return 0;
    }


}
