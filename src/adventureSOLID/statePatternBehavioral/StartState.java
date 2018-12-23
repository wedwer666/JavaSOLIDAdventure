package adventureSOLID.statePatternBehavioral;

import javax.naming.Context;

/**
 * Created by Maria on 23.12.2018.
 */
public class StartState implements State {

    @Override
    public void doAction() {
        System.out.println("Player Y is in Start State");
    }
}
