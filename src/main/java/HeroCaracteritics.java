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
        Hero newHero = hero.copy();
        if(hero.speciality == Speciality.TANK){
            newHero.setCaracteristics(1000, 100, 20);
            //TODO • Puissance supplémentaires contre mages : 20
        }
        else if(hero.speciality == Speciality.KILLER){
            newHero.setCaracteristics(800, 200, 5);
            //TODO • Puissance supplémentaires contre tanks : 30
        }
        else if(hero.speciality == Speciality.MAGICIAN){
            newHero.setCaracteristics(700, 150, 10);
            //TODO • Puissance supplémentaires contre mages : 25
        }
        return newHero;
    }

    public static Hero enhaceCaracteriticsByRarety(Hero hero){
        Hero newHero = hero.copy();
        if(hero.rarety == Rarety.COMMON){
            newHero.enhaceCaracteriticsByPerCent(0);
        }
        else if(hero.rarety == Rarety.RARE){
            newHero.enhaceCaracteriticsByPerCent(0.1);
        }
        else if(hero.rarety == Rarety.LEGENDARY){
            newHero.enhaceCaracteriticsByPerCent(0.2);
        }
        return newHero;
    }
}
