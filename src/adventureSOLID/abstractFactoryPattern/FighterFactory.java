package adventureSOLID.abstractFactoryPattern;

import adventureSOLID.allysAndenemys.*;
import adventureSOLID.interfaceSegregation.IDeamon;
import adventureSOLID.interfaceSegregation.IHuman;
import adventureSOLID.interfaceSegregation.IMagic;

/**
 * Created by Maria on 22.12.2018.
 * Abstract Factory
 */

public abstract class FighterFactory {
    public abstract TypeOfMovements getMovement(String move);
    public abstract Bonuses getBonuses(String bonus);
}
