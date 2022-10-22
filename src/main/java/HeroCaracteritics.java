import java.util.HashMap;
import java.util.Map;

public class HeroCaracteritics {
    HashMap<String, HashMap<String, Integer>> specMap = new HashMap<String, HashMap<String, Integer>>();

//    specMAp{
//        tank:{
//            hp= 1000,
//            power = 100,
//            armor = 20
//        }
//        KILLER:{
//            hp= 1000,
//            power = 100,
//            armor = 20
//        }
//        MAGICIAN:{
//            hp= 1000,
//            power = 100,
//            armor = 20
//        }
//    }

    public static Hero initHero(Hero hero){
//        hero.hp = specMAp[hero.speciality]['hp']
//        hero.power = specMAp[hero.speciality][power]
//        hero.armor = specMAp[hero.speciality][armor]
        if(hero.speciality == Speciality.TANK){
            hero.hp = 1000;
            hero.power = 100;
            hero.armor = 20;
            //TODO • Puissance supplémentaires contre mages : 20
        }
        else if(hero.speciality == Speciality.KILLER){
            hero.hp = 800;
            hero.power = 200;
            hero.armor = 5;
            //TODO • Puissance supplémentaires contre tanks : 30
        }
        else if(hero.speciality == Speciality.MAGICIAN){
            hero.hp = 700;
            hero.power = 150;
            hero.armor = 10;
            //TODO • Puissance supplémentaires contre mages : 25
        }
        return hero;
    }

    public static Hero enhaceCaracteritics(Hero hero){
//        hero.hp = specMAp[hero.speciality]['hp']
//        hero.power = specMAp[hero.speciality][power]
//        hero.armor = specMAp[hero.speciality][armor]
        if(hero.rarety == Rarety.COMMON){
            hero.hp += 0;
            hero.power += 0;
            hero.armor += 0;
        }
        else if(hero.rarety == Rarety.RARE){
            hero.hp += hero.hp * 0.1;
            hero.power += hero.power * 0.1;
            hero.armor += hero.armor * 0.1;
        }
        else if(hero.rarety == Rarety.LEGENDARY){
            hero.hp += hero.hp * 0.2;
            hero.power += hero.power * 0.2;
            hero.armor += hero.armor * 0.2;
        }
        return hero;
    }
}
