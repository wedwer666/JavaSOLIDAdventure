package adventureSOLID;

import adventureSOLID.DAO.*;
import adventureSOLID.abstractFactoryPattern.*;
import adventureSOLID.adapterPatternStructural.SimplePlayer;
import adventureSOLID.allysAndenemys.*;
import adventureSOLID.dependencyInversion.BackEndGameMaster;
import adventureSOLID.dependencyInversion.FrontEndGameMaster;
import adventureSOLID.interfaceSegregation.GameMaster;
import adventureSOLID.singletonPaternCreational.Singleton;
import adventureSOLID.statePatternBehavioral.PlayerContext;
import adventureSOLID.statePatternBehavioral.StartState;
import adventureSOLID.statePatternBehavioral.State;
import adventureSOLID.statePatternBehavioral.StopState;

/**
 * Created by Maria on 01.12.2018.
 */
public class Main {
    public static void main(String... args) {
        System.out.println("PLAYERS AND THEIR RESPONSABILITIES:");
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
        enemycomanderDAOImpl enemycomanderDAO = new enemycomanderDAOImpl();
        System.out.println(enemycomanderDAO.SendOrders());
        System.out.println(enemycomanderDAO.promoteSubordinate());
        System.out.println(enemycomanderDAO.attack());

        //ally soldier functionality
        Soldier soldier1 = new Soldier();
        System.out.println("Ally Soldier Nickname - " + soldier1.nickName);
        allysoldierDAOImpl allysoldierDAOImpl1 = new allysoldierDAOImpl();
        System.out.println(allysoldierDAOImpl1.walk());
        System.out.println(allysoldierDAOImpl1.protect());
        System.out.println(allysoldierDAOImpl1.attack());

        //enemy soldier functionality
        Soldier soldier2 = new Soldier();
        System.out.println("Enemy Soldier Nickname - " + soldier2.nickName);
        enemysoldierDAOImpl enemysoldierDAOImpl2 = new enemysoldierDAOImpl();
        System.out.println(enemysoldierDAOImpl2.walk());
        System.out.println(enemysoldierDAOImpl2.attack());

        //ally dragon functionality
        Dragon dragon1 = new Dragon();
        System.out.println("Ally Dragon Nickname - " + dragon1.nickName);
        allydragonDAOImpl allydragonDAO = new allydragonDAOImpl();
        System.out.println(allydragonDAO.fly());
        System.out.println(allydragonDAO.attack());

        //enemy dragon functionality
        Dragon dragon2 = new Dragon();
        System.out.println("Ally Dragon Nickname - " + dragon2.nickName);
        enemydragonDAOImpl enemydragonDAO = new enemydragonDAOImpl();
        System.out.println(enemydragonDAO.fly());
        System.out.println(enemydragonDAO.attack());

        //ally mage functionality
        Mage mage = new Mage();
        System.out.println("Ally Mage Nickname - " + mage.nickName);
        allymageDAOImpl allymageDAO = new allymageDAOImpl();
        System.out.println(allymageDAO.castSpell());
        System.out.println(allymageDAO.fly());
        System.out.println(allymageDAO.attack());

        // enemy witch functionality
        Witch witch = new Witch();
        System.out.println("Enemy Witch Nickname - " + witch.nickName);
        enemywitchDAOImpl enemywitchDAO = new enemywitchDAOImpl();
        System.out.println(enemywitchDAO.curse());
        System.out.println(enemywitchDAO.fly());
        System.out.println(enemywitchDAO.attack());

        // ally deamon functionality
        Deamon deamon = new Deamon();
        System.out.println("Ally Deamon Functionality - " + deamon.nickName);
        allydeamonDAOImpl allydeamonDAO = new allydeamonDAOImpl();
        System.out.println(allydeamonDAO.attack());
        System.out.println(allydeamonDAO.save());

        // enemy deamon functionality
        Deamon deamon2 = new Deamon();
        System.out.println("Enemy Deamon Functionality - " + deamon2.nickName);
        enemydeamonDAOImpl enemydeamonDAO = new enemydeamonDAOImpl();
        System.out.println(enemydeamonDAO.attack());
        System.out.println(enemydeamonDAO.freeze());

        //dependency inversion functionality
        GameMaster gameMaster1 = new BackEndGameMaster();
        System.out.println(gameMaster1.addnewElements());

        GameMaster gameMaster2 =  new FrontEndGameMaster();
        System.out.println(gameMaster2.addnewElements());

        //abstract factory implementation
        System.out.println("PLAYER'S MOVEMENTS AND THEIR COST");
        FighterFactory movementFactory = FactoryProducer.getFactory("movement");
        FighterFactory bonusesFactory = FactoryProducer.getFactory("bonuses");
        TypeOfMovements typeOfMovements1 = movementFactory.getMovement("horizontal");
        typeOfMovements1.move();
        Bonuses bonuses1 = bonusesFactory.getBonuses("small");
        bonuses1.getBonuses();
        TypeOfMovements typeOfMovements2 = movementFactory.getMovement("vertical");
        typeOfMovements2.move();
        Bonuses bonuses2 = bonusesFactory.getBonuses("medium");
        bonuses2.getBonuses();
        TypeOfMovements typeOfMovements3 = movementFactory.getMovement("diagonal");
        typeOfMovements3.move();
        Bonuses bonuses3 = bonusesFactory.getBonuses("big");
        bonuses3.getBonuses();

        //singleton pattern implementation
        System.out.println("\n");
        Singleton.getInstance().publicMethod();

        //adapter pattern implementation
        System.out.println("\n" +"PERSON MUST CHOOSE TYPE OF PLAYER AND NICKNAME");
        SimplePlayer simplePlayer = new SimplePlayer();
        simplePlayer.play("invisible", "MisterX");
        simplePlayer.play("enemy", "ZLO");
        simplePlayer.play("ally", "SOVESTI");
        simplePlayer.play("ownperson","Mary");

        //state patern implementation
        System.out.println("\n" + "PLAYER STATE: ");
        PlayerContext context = new PlayerContext();
        State startState = new StartState();
        State stopState = new StopState();
        context.setState(startState);
        context.doAction();
        context.setState(stopState);
        context.doAction();
    }
}
