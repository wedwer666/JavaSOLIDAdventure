package adventureSOLID.statePatternBehavioral;

/**
 * Created by Maria on 23.12.2018.
 */
public class PlayerContext implements State{
    private State playerContext;
    public void setState(State state){
        this.playerContext=state;
    }
    public State getState(){
        return this.playerContext;
    }
    @Override
    public void doAction() {
        this.playerContext.doAction();
    }
}
