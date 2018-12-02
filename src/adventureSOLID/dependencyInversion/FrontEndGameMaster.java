package adventureSOLID.dependencyInversion;

import adventureSOLID.interfaceSegregation.GameMaster;

/**
 * Created by Maria on 02.12.2018.
 */
public class FrontEndGameMaster implements GameMaster {

    public String addDesign(){
        System.out.println("Add new design in game");
        return ("---------------------------------------------------------");
    }

    @Override
    public String addnewElements() {
        System.out.println("Add new elements in design");
        return ("---------------------------------------------------------");
    }
}
