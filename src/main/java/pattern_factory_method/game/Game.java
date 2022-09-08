package pattern_factory_method.game;

import pattern_factory_method.game.darkForces.DarkForces;
import pattern_factory_method.game.darkForces.ForestMonster;
import pattern_factory_method.game.factory.DarkForcesFactory;
import pattern_factory_method.game.factory.HighGameDarkForcesFactory;

import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        Forest forest = Forest.getInstance();
        DarkForcesFactory gameLevel = new HighGameDarkForcesFactory();
        forest.setDarkForces(Arrays.asList(gameLevel.createMonsters()));

        System.out.println(forest.getDarkForces());

        List<DarkForces> darkForces = forest.getDarkForces();
        darkForces.get(1).attack();
    }
}
