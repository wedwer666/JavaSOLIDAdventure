package adventureSOLID.DAO;

import adventureSOLID.allysAndenemys.Mage;

/**
 * Created by Maria on 02.12.2018.
 */
public class allymageDAOImpl implements genericDAO<Mage, String> {
    static final String MAGE_CAST_SPELLING = "Ally Mage is castSpelling ...";
    static final String MAGE_FLY = "Ally Mage is flying ...";
    static final String MAGE_ATTACK = "Ally Mage is attacking ...";

    public String castSpell()
    {
        return MAGE_CAST_SPELLING;
    }
    public String fly(){
        return MAGE_FLY;
    }
    @Override
    public String attack() {
        return MAGE_ATTACK;
    }
}
