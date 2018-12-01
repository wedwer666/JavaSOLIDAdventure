package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Soldier;

/**
 * Created by Maria on 01.12.2018.
 */
public class enemysoldierDAOImpl implements genericDAO<Soldier, String>  {

    void walk(Soldier soldier){
        System.out.println(" It is walk functionality for enemy soldier");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for enemy soldier");
        return String.valueOf(1);
    }
}
