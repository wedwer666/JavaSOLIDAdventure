package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Deamon;

/**
 * Created by Maria on 22.12.2018.
 */
public class allydeamonDAOImpl implements genericDAO<Deamon, String> {
    public String save()
    {
        System.out.println("It is save functionality for ally deamon");
        return ("---------------------------------------------------------");
    }
    @Override
    public String attack() {
        System.out.println("It is attack functionality for ally deamon");
        return ("---------------------------------------------------------");
    }
}
