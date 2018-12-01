package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Soldier;

/**
 * Created by Maria on 01.12.2018.
 */

//allySoldier
public class allysoldierDAOImpl implements genericDAO<Soldier, String> {

    public String walk()
    {
        System.out.println("It is walk functionality for ally soldier");
        return ("---------------------------------------------------------");
    }
    public String protect(){
        System.out.println("It is protect functionality for ally soldier");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for ally soldier");
        return ("---------------------------------------------------------");
    }
}
