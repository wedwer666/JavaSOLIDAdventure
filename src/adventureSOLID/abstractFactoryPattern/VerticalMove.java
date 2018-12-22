package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 * Concrete class 2
 */
public class VerticalMove implements TypeOfMovements{
    @Override
    public void move() {
        System.out.println("One move in vertical mode");
    }
}
