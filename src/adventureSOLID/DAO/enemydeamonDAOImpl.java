package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Deamon;

/**
 * Created by Maria on 22.12.2018.
 */
public class enemydeamonDAOImpl implements genericDAO<Deamon,String> {
    static final String DEAMON_FREEZE = "Enemy Deamon is freezing ...";
    static final String DEAMON_ATTACK = "Enemy Deamon is attacking ...";

    public String freeze()
    {
        return DEAMON_FREEZE;
    }
    @Override
    public String attack() {
        return DEAMON_ATTACK;
    }
}
