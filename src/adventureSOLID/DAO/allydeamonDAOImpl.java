package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Deamon;

/**
 * Created by Maria on 22.12.2018.
 */
public class allydeamonDAOImpl implements genericDAO<Deamon, String> {
    static final String DEAMON_SAVE = "Ally Deamon is saving ...";
    static final String DEAMON_ATTACK = "Ally Deamon is attacking ...";

    public String save()
    {
        return DEAMON_SAVE;
    }
    @Override
    public String attack() {
        return DEAMON_ATTACK;
    }
}
