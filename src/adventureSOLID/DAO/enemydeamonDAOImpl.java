package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Deamon;
import sun.net.www.content.text.Generic;

/**
 * Created by Maria on 22.12.2018.
 */
public class enemydeamonDAOImpl implements genericDAO<Deamon,String> {
    public String freeze()
    {
        System.out.println("It is freeze functionality for enemy deamon");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for enemy deamon");
        return ("---------------------------------------------------------");
    }
}
