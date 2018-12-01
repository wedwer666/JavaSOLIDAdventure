package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Comander;

/**
 * Created by Maria on 01.12.2018.
 */

public class enemycomanderDAOImpl implements genericDAO<Comander, String>  {

    public String SendOrders(){
        System.out.println("It is send order functionality for enemy comander");
        return ("---------------------------------------------------------");
    }
    public String promoteSubordinate(){
        System.out.println("It is promote subordinate functionality for enemy comander");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for enemy comander");
        return ("---------------------------------------------------------");
    }
}
