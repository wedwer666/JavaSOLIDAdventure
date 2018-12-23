package adventureSOLID.statePatternBehavioral;

/**
 * Created by Maria on 23.12.2018.
 */
public class StopState implements State {
    @Override
    public void doAction() {
        System.out.println("Player X is in Stop State");
    }
}
