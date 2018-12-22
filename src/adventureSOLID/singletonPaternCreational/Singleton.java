package adventureSOLID.singletonPaternCreational;

/**
 * Created by Maria on 22.12.2018.
 */
public class Singleton {
    private static Singleton SINGLE_INSTANCE;
    public static Singleton getInstance() {
        if (SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new Singleton();
        }
        return SINGLE_INSTANCE;
    }
    private void privateMethod() {
        System.out.println("print from private method: " + SINGLE_INSTANCE);
    }


    public void publicMethod() {
        System.out.println("One instance of objects per game " + SINGLE_INSTANCE);
    }
}
