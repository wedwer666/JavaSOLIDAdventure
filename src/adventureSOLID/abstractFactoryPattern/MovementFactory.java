package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 */
public class MovementFactory extends FighterFactory {

    @Override
    public TypeOfMovements getMovement(String move){

        if(move == null){
            return null;
        }
        if(move.equalsIgnoreCase("vertical")){
            return new VerticalMove();

        }else if(move.equalsIgnoreCase("horizontal")){
            return new HorizontalMove();

        }else if(move.equalsIgnoreCase("diagonal")){
            return new DiagonalMove();
        }

        return null;
    }

    @Override
    public Bonuses getBonuses(String bonus) {
        return null;
    }
}
