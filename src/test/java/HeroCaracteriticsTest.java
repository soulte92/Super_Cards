import static org.junit.jupiter.api.Assertions.*;

class HeroCaracteriticsTest {

    @org.junit.jupiter.api.Test
    void initCarateristicsBySpeciality() {
        Hero hero = new Hero("toto", Speciality.TANK, Rarety.COMMON);
        Hero newHero = HeroCaracteritics.initCarateristicsBySpeciality(hero);
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
        Hero hero = new Hero("toto", Speciality.MAGICIAN, Rarety.COMMON);
        Hero newHero = HeroCaracteritics.initCarateristicsBySpeciality(hero);
        assertEquals(newHero.hp, 700);
        assertEquals(newHero.power, 150);
        assertEquals(newHero.armor, 10);

        newHero.rarety = Rarety.RARE;
        newHero = HeroCaracteritics.initCarateristicsBySpeciality(newHero);
        newHero = HeroCaracteritics.enhaceCaracteriticsByRarety(newHero);
        assertEquals(newHero.hp, 770);
        assertEquals(newHero.power, 165);
        assertEquals(newHero.armor, 11);

        newHero.rarety = Rarety.LEGENDARY;
        newHero = HeroCaracteritics.initCarateristicsBySpeciality(newHero);
        newHero = HeroCaracteritics.enhaceCaracteriticsByRarety(newHero);
        assertEquals(newHero.hp, 840);
        assertEquals(newHero.power, 180);
        assertEquals(newHero.armor, 12);

        // TODO Test Error cases
    }
}