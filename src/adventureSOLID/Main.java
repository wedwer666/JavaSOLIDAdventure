package adventureSOLID;

import adventureSOLID.DAO.allycomanderDAOImpl;
import adventureSOLID.DAO.allysoldierDAOImpl;
import adventureSOLID.DAO.enemycomanderDAOImpl;
import adventureSOLID.allysAndenemys.Comander;
import adventureSOLID.allysAndenemys.Players;
import adventureSOLID.allysAndenemys.Soldier;
import solid.dao.GenericDao;
import solid.players.Player;

/**
 * Created by Maria on 01.12.2018.
 */
public class Main {
    public static void main(String... args) {
        //ally comander functionality
        Players comander1 = new Comander();
        System.out.println("Ally Comander Nickname - " + comander1.nickName);
        //test allyComander functionlity
        allycomanderDAOImpl allycomanderDAO1 = new allycomanderDAOImpl();
        System.out.println(allycomanderDAO1.SendOrders());
        System.out.println(allycomanderDAO1.promoteSubordinate());
        System.out.println(allycomanderDAO1.attack());

        //enemy comander functionality
        Players comander2 = new Comander();
        System.out.println("Enemy Comander Nickname - " + comander2.nickName);
        //test allyComander functionlity
        enemycomanderDAOImpl allycomanderDAO2 = new enemycomanderDAOImpl();
        System.out.println(allycomanderDAO2.SendOrders());
        System.out.println(allycomanderDAO2.promoteSubordinate());
        System.out.println(allycomanderDAO2.attack());

        //ally soldier functionality
        Soldier soldier1 = new Soldier();
        System.out.println("Ally Soldier Nickname - " + soldier1.nickName);
        allysoldierDAOImpl allysoldierDAOImpl1 = new allysoldierDAOImpl();
        System.out.println(allysoldierDAOImpl1.walk());
        System.out.println(allysoldierDAOImpl1.protect());
        System.out.println(allysoldierDAOImpl1.attack());

        //enemy soldier functionality
        Soldier soldier2 = new Soldier();
        System.out.println("Enemy Soldier Nickname - " + soldier1.nickName);
        allysoldierDAOImpl allysoldierDAOImpl2 = new allysoldierDAOImpl();
        System.out.println(allysoldierDAOImpl2.walk());
        System.out.println(allysoldierDAOImpl2.protect());
        System.out.println(allysoldierDAOImpl2.attack());


    }
}
