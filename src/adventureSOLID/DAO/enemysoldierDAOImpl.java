package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Soldier;

/**
 * Created by Maria on 01.12.2018.
 */
public class enemysoldierDAOImpl implements genericDAO<Soldier, String> {
    static final String SOLDIER_WALK = "Ally Sodier is walking ...";
    static final String SOLDIER_ATTACK = "Ally Soldier is attacking ...";

    public String walk()
    {
        return SOLDIER_WALK;
    }
    @Override
    public String attack()
    {
        return SOLDIER_ATTACK;
    }
}
