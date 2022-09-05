package pattern_factory_method.game;

import pattern_factory_method.game.factory.DarkForcesFactory;
import pattern_factory_method.game.factory.HighGameDarkForcesFactory;

import java.util.Arrays;

public class Game {
    public static void main(String[] args) {
        Forest forest = Forest.getInstance();
        DarkForcesFactory gameLevel = new HighGameDarkForcesFactory();
        forest.setDarkForces(Arrays.asList(gameLevel.createMonster()));

        System.out.println(forest.getDarkForces());
    }
}
