package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Soldier;

/**
 * Created by Maria on 01.12.2018.
 */

//allySoldier
public class allysoldierDAOImpl implements genericDAO<Soldier, String> {
    static final String SOLDIER_WALK = "Ally Sodier is walking ...";
    static final String SOLDIER_PROTECT = "Ally Soldier is protecting ...";
    static final String SOLDIER_ATTACK = "Ally Soldier is attacking ...";

    public String walk()
    {
       return SOLDIER_WALK;
    }
    public String protect()
    {
        return SOLDIER_PROTECT;
    }
    @Override
    public String attack()
    {
       return SOLDIER_ATTACK;
    }
}
