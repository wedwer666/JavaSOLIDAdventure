package adventureSOLID.dependencyInversion;

import adventureSOLID.interfaceSegregation.GameMaster;

/**
 * Created by Maria on 02.12.2018.
 */
public class BackEndGameMaster implements GameMaster {
    public String addLogic(){
        System.out.println("New back end logic");
        return ("");
    }

    @Override
    public String addnewElements() {
    System.out.println("Add new elements in logic");
        return ("");
    }
}
