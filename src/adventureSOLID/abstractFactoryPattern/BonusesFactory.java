package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 */
public class BonusesFactory extends FighterFactory {

    @Override
    public TypeOfMovements getMovement(String move) {
        return null;
    }

    @Override
    public Bonuses getBonuses(String bonus) {
        if(bonus == null){
            return null;
        }
        if(bonus.equalsIgnoreCase("small")){
            return new SmallBonus();

        }else if(bonus.equalsIgnoreCase("medium")){
            return new MediumBonuses();

        }else if(bonus.equalsIgnoreCase("big")){
            return new BigBonuses();
        }
        return null;
    }
}
