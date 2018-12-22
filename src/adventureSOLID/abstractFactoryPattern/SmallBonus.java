package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 */
public class SmallBonus implements Bonuses {
    @Override
    public void getBonuses() {
        System.out.println("Add 5 coins in bag");
    }
}
