import java.util.HashMap;
import java.util.Map;

public class HeroCaracteritics {
//    HashMap<String, HashMap<String, Integer>> specialitiesMap = new HashMap<String, HashMap<String, Integer>>();
//    public void configSpecMap(){
//        HashMap<String, Integer> tank = new HashMap<String, Integer>();
//        tank.put("hp", 1000);
//        tank.put("power", 100);
//        tank.put("armor", 20);
////        tank.put("specialPower", 20);
//        HashMap<String, Integer> killer = new HashMap<String, Integer>();
//        killer.put("hp", 800);
//        killer.put("power", 200);
//        killer.put("armor", 5);
//        HashMap<String, Integer> magician = new HashMap<String, Integer>();
//        magician.put("hp", 700);
//        magician.put("power", 150);
//        magician.put("armor", 10);
////        HashMap<String, Integer> specialPower = new HashMap<String, Integer>();
////        specialPower.put("magician", 20);
//
//        this.specialitiesMap.put("tank", tank);
//        this.specialitiesMap.put("killer", killer);
//        this.specialitiesMap.put("magician", magician);
//    }

    public static Hero initCarateristicsBySpeciality(Hero hero){
//        this.configSpecMap();
        if(hero.speciality == Speciality.TANK){
            return HeroCaracteritics.setCaracteristics(hero, 1000, 100, 20);
            //TODO • Puissance supplémentaires contre mages : 20
        }
        else if(hero.speciality == Speciality.KILLER){
            return HeroCaracteritics.setCaracteristics(hero, 800, 200, 5);
            //TODO • Puissance supplémentaires contre tanks : 30
        }
        else if(hero.speciality == Speciality.MAGICIAN){
            return HeroCaracteritics.setCaracteristics(hero, 700, 150, 10);
            //TODO • Puissance supplémentaires contre mages : 25
        }
        return hero;
    }

    public static Hero enhaceCaracteriticsByRarety(Hero hero){
        if(hero.rarety == Rarety.COMMON){
            hero = HeroCaracteritics.enhaceCaracteriticsByPerCent(hero, 0);
        }
        else if(hero.rarety == Rarety.RARE){
            hero = HeroCaracteritics.enhaceCaracteriticsByPerCent(hero, 0.1);
        }
        else if(hero.rarety == Rarety.LEGENDARY){
            hero = HeroCaracteritics.enhaceCaracteriticsByPerCent(hero, 0.2);
        }
        return hero;
    }

    private static Hero setCaracteristics(Hero hero, int newHp, int newPower, int newArmor){
        Hero newHero = new Hero(hero.name, hero.hp, hero.xp, hero.power, hero.armor, hero.speciality, hero.rarety, hero.level);
        newHero.hp = newHp;
        newHero.power = newPower;
        newHero.armor = newArmor;
        return newHero;
    }

    public static Hero enhaceCaracteriticsByPerCent(Hero hero, double perCent){
        Hero newHero = new Hero(hero.name, hero.hp, hero.xp, hero.power, hero.armor, hero.speciality, hero.rarety, hero.level);
        newHero.hp += newHero.hp * perCent;
        newHero.power += newHero.power * perCent;
        newHero.armor += newHero.armor * perCent;
        return newHero;
    }

    public static Hero retrieveHpFromHero(Hero hero, int hpToRetrieve){
        Hero newHero = new Hero(hero.name, hero.hp, hero.xp, hero.power, hero.armor, hero.speciality, hero.rarety, hero.level);
        newHero.hp -= hpToRetrieve;
        return newHero;
    }

    public static Hero increaseXpToHero(Hero hero, int xpToIncrease){
        Hero newHero = new Hero(hero.name, hero.hp, hero.xp, hero.power, hero.armor, hero.speciality, hero.rarety, hero.level);
        newHero.xp += xpToIncrease;
        return newHero;
    }

    public static Hero updateHeroLevel(Hero hero){
        Hero newHero = new Hero(hero.name, hero.hp, hero.xp, hero.power, hero.armor, hero.speciality, hero.rarety, hero.level);
        newHero.level = newHero.xp / 5;
        return newHero;
    }

}
