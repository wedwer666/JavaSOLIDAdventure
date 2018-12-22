package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 */
public class MediumBonuses implements Bonuses {
    @Override
    public void getBonuses() {
        System.out.println("Add 10 coins in bag");
    }
}
