import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroCaracteriticsTest {
//    Hero hero1;
//    Hero hero2;
//    @BeforeAll
//    void initTestVariables(){
//        Hero hero1 = new Hero("toto", Speciality.TANK, Rarety.COMMON);
//        Hero hero2 = new Hero("super-boy", 100, 30, 20, 5, Speciality.TANK, Rarety.COMMON, 6);
//
//    }

    @org.junit.jupiter.api.Test
    void initCarateristicsBySpeciality() {
        Hero hero1 = new Hero("toto", Speciality.TANK, Rarety.COMMON);
        Hero newHero = HeroCaracteritics.initCarateristicsBySpeciality(hero1);
         assertEquals(newHero.hp, 1000);
         assertEquals(newHero.power, 100);
         assertEquals(newHero.armor, 20);

        newHero.speciality = Speciality.KILLER;
        newHero = HeroCaracteritics.initCarateristicsBySpeciality(newHero);
         assertEquals(newHero.hp, 800);
         assertEquals(newHero.power, 200);
         assertEquals(newHero.armor, 5);

        newHero.speciality = Speciality.MAGICIAN;
        newHero = HeroCaracteritics.initCarateristicsBySpeciality(newHero);
         assertEquals(newHero.hp, 700);
         assertEquals(newHero.power, 150);
         assertEquals(newHero.armor, 10);

         // TODO Test Error cases
    }

    @org.junit.jupiter.api.Test
    void enhaceCaracteriticsByRarety() {
        Hero hero1 = new Hero("toto", Speciality.TANK, Rarety.COMMON);
        Hero newHero = HeroCaracteritics.initCarateristicsBySpeciality(hero1);
        assertEquals(newHero.hp, 1000);
        assertEquals(newHero.power, 100);
        assertEquals(newHero.armor, 20);

        newHero.rarety = Rarety.RARE;
        newHero = HeroCaracteritics.initCarateristicsBySpeciality(newHero);
        newHero = HeroCaracteritics.enhaceCaracteriticsByRarety(newHero);
        assertEquals(newHero.hp, 1100);
        assertEquals(newHero.power, 110);
        assertEquals(newHero.armor, 22);

        newHero.rarety = Rarety.LEGENDARY;
        newHero = HeroCaracteritics.initCarateristicsBySpeciality(newHero);
        newHero = HeroCaracteritics.enhaceCaracteriticsByRarety(newHero);
        assertEquals(newHero.hp, 1200);
        assertEquals(newHero.power, 120);
        assertEquals(newHero.armor, 24);

        // TODO Test Error cases
    }

    @Test
    void enhaceCaracteriticsByPerCent() {
        Hero hero2 = new Hero("super-boy", 100, 30, 20, 5, Speciality.TANK, Rarety.COMMON, 6);
        Hero newHero = HeroCaracteritics.enhaceCaracteriticsByPerCent(hero2, 0.5);

        assertEquals(newHero.hp, 150);
        assertEquals(newHero.power, 30);
        assertEquals(newHero.armor, 7);
    }

    @Test
    void retrieveHpFromHero() {
        Hero hero2 = new Hero("super-boy", 100, 30, 20, 5, Speciality.TANK, Rarety.COMMON, 6);
        Hero newHero = HeroCaracteritics.retrieveHpFromHero(hero2, 30);

        assertEquals(newHero.hp, 70);
    }

    @Test
    void increaseXpToHero() {
        Hero hero2 = new Hero("super-boy", 100, 30, 20, 5, Speciality.TANK, Rarety.COMMON, 6);
        // Before increase XP
        Hero newHero = HeroCaracteritics.copy(hero2);
        assertEquals(newHero.xp, 30);

        // After increase XP
        newHero = HeroCaracteritics.increaseXpToHero(hero2, 15);
        assertEquals(newHero.xp, 45);
    }

    @Test
    void updateHeroLevel() {
        Hero hero2 = new Hero("super-boy", 100, 30, 20, 5, Speciality.TANK, Rarety.COMMON, 6);
        // Before updating the level
        Hero newHero = HeroCaracteritics.copy(hero2);
        assertEquals(newHero.level, 6);

        // After updating the level
        newHero = HeroCaracteritics.increaseXpToHero(newHero, 15);
        newHero = HeroCaracteritics.updateHeroLevel(newHero);
        assertEquals(newHero.level, 9);
    }

    @Test
    void copy() {
        Hero hero2 = new Hero("super-boy", 100, 30, 20, 5, Speciality.TANK, Rarety.COMMON, 6);
        Hero newHero = HeroCaracteritics.copy(hero2);

        assertEquals(newHero.name, hero2.name);
        assertEquals(newHero.hp, hero2.hp);
        assertEquals(newHero.xp, hero2.xp);
        assertEquals(newHero.power, hero2.power);
        assertEquals(newHero.armor, hero2.armor);
        assertEquals(newHero.level, hero2.level);
        assertEquals(newHero.rarety, hero2.rarety);
        assertEquals(newHero.speciality, hero2.speciality);
    }
}