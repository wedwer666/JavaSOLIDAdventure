package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 * Concrete class 1
 */
public class HorizontalMove implements TypeOfMovements {
    @Override
    public void move() {
        System.out.println("One move in horizontal mode");
    }
}
