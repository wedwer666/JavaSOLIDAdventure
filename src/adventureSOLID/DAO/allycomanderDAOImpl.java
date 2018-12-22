package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Comander;
import adventureSOLID.interfaceSegregation.IHuman;

/**
 * Created by Maria on 01.12.2018.
 */

public class allycomanderDAOImpl implements genericDAO<Comander, String> {
    static final String COMANDER_SEND_ORDERS = "Ally Comander is moving ...";
    static final String COMANDER_PROMOTE_SUBORDINATE = "Ally Comander is promoting subordinate ...";
    static final String COMANDER_ATTACK = "Ally Comander is attacking ...";

    public String SendOrders()
    {
        return COMANDER_SEND_ORDERS;
    }
    public String promoteSubordinate(){
        return COMANDER_PROMOTE_SUBORDINATE;
    }
    @Override
    public String attack() {
        return COMANDER_ATTACK;
    }

}
