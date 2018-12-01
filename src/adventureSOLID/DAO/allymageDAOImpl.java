package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Mage;

/**
 * Created by Maria on 02.12.2018.
 */
public class allymageDAOImpl implements genericDAO<Mage, String> {

    public String castSpell()
    {
        System.out.println("It is cast spell functionality for ally mage");
        return ("---------------------------------------------------------");
    }
    public String fly(){
        System.out.println("It is fly functionality for ally mage");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for ally mage");
        return ("---------------------------------------------------------");    }
}
