package adventureSOLID.abstractFactoryPattern;

/**
 * Created by Maria on 22.12.2018.
 */
public class FactoryProducer {
    public static FighterFactory getFactory(String variant)
    {
        if(variant.equalsIgnoreCase("movement")){
            return new MovementFactory();

        }else if(variant.equalsIgnoreCase("bonuses")){
            return new BonusesFactory();
        }
        return null;
    }
}
