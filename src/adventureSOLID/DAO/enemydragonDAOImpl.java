package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Dragon;

/**
 * Created by Maria on 02.12.2018.
 */
public class enemydragonDAOImpl implements genericDAO<Dragon, String> {

    public String fly()
    {
        System.out.println("It is fly functionality for enemy dragon");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for enemy dragon");
        return ("---------------------------------------------------------");
    }
}
