package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Dragon;

/**
 * Created by Maria on 02.12.2018.
 */
public class enemydragonDAOImpl implements genericDAO<Dragon, String> {
    static final String DRAGON_FLY = "Enemy Dragon is flying ...";
    static final String DRAGON_ATTACK = "Enemy Dragon is attacking ...";

    public String fly()
    {
        return DRAGON_FLY;
    }
    @Override
    public String attack() {
        return DRAGON_ATTACK;
    }
}
