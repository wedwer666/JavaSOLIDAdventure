package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Witch;

/**
 * Created by Maria on 02.12.2018.
 */
public class enemywitchDAOImpl implements genericDAO<Witch, String> {
    public String curse()
    {
        System.out.println("It is curse functionality for enemy witch");
        return ("---------------------------------------------------------");
    }
    public String fly(){
        System.out.println("It is fly functionality for enemy witch");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for enemy witch");
        return ("---------------------------------------------------------");    }
}
