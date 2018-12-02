package adventureSOLID.allysAndenemys;
/**
 * Created by Maria on 01.12.2018.
 */
public abstract class Players {
    public String nickName = "X";
    int agility;
    int health;
    int mana;
    short currentProgress;
    int level;
    int bonus;

    int simpleHint() {
        return 50;
    }

    public abstract int getRaceBonus(Players players);

    //  abstract int weaponHit();
//  abstract int magicHit();
    public abstract int raceHit();
}
