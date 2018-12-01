package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Soldier;

/**
 * Created by Maria on 01.12.2018.
 */
public class enemysoldierDAOImpl implements genericDAO<Soldier, String>  {

    public String walk(){
        System.out.println("It is walk functionality for enemy soldier");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for enemy soldier");
        return ("---------------------------------------------------------");
    }
}
