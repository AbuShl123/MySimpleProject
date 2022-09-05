package pattern_factory_method.game.factory;

import pattern_factory_method.game.darkForces.BabaYaga;
import pattern_factory_method.game.darkForces.DarkForces;
import pattern_factory_method.game.darkForces.ForestMonster;
import pattern_factory_method.game.darkForces.OldTree;

import java.util.Random;

public class HighGameDarkForcesFactory implements DarkForcesFactory {
    @Override
    public DarkForces[] createMonster() {
        int amount = new Random().nextInt(5)+6;
        DarkForces[] darkForces = new DarkForces[amount];
        darkForces[0] = new BabaYaga();
        darkForces[1] = new ForestMonster();
        switch (amount) {
            case 10:
            case 9:
                darkForces[3] = new ForestMonster();
            case 8:
            case 7:
                darkForces[2] = new ForestMonster(); break;
        }
        for (int i = 0; i < amount; i++) {
            if (darkForces[i] == null) {
                darkForces[i] = new OldTree();
            }
        }
        return darkForces;
    }
}
