package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 */
public class BigBonuses implements Bonuses {
    @Override
    public void getBonuses() {
        System.out.println("Add 15 coins in bag");
    }
}
