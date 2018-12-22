package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 * Concrete class 3
 */
public class DiagonalMove implements TypeOfMovements {
    @Override
    public void move() {
        System.out.println("One move in diagonal mode");
    }
}
