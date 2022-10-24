public class Battle {

    // TODO Les niveaux

    public static void attack(Hero heroFighter, Hero heroDefender){
        // heroFighter don't attack if heroDefender is dead
        if(heroDefender.isDead()) return;

        // Decrease heroDefencer hp
        int hpToRetrieve = heroFighter.power - heroDefender.armor;
        heroDefender = HeroCaracteritics.retrieveHpFromHero(heroDefender,hpToRetrieve);

        // Increase heroFighter level and caracteristics
        if(heroDefender.isDead()){
            // Increase level
            int xpToIncrease = 1;
            heroFighter = HeroCaracteritics.increaseXpToHero(heroFighter, 1);

            // Increase caracteristics
            double percent = 0.1;
            heroFighter = HeroCaracteritics.enhaceCaracteriticsByPerCent(heroFighter, percent);
        }

    }

}
