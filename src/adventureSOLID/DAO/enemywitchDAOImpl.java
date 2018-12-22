package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Witch;

/**
 * Created by Maria on 02.12.2018.
 */
public class enemywitchDAOImpl implements genericDAO<Witch, String> {
    static final String WITCH_CURSE = "Enemy Witch is cursing ...";
    static final String WITCH_FLY = "Enemy Witch is flying...";
    static final String WITCH_ATTACK = "Enemy Witch is attacking ...";

    public String curse()
    {
        return WITCH_CURSE;
    }
    public String fly(){
        return WITCH_FLY;
    }
    @Override
    public String attack() {
        return WITCH_ATTACK;
    }

}
