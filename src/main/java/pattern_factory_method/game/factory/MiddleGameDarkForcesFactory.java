package pattern_factory_method.game.factory;

import pattern_factory_method.game.darkForces.BabaYaga;
import pattern_factory_method.game.darkForces.DarkForces;
import pattern_factory_method.game.darkForces.OldTree;

import java.util.Random;

public class MiddleGameDarkForcesFactory implements DarkForcesFactory {
    @Override
    public DarkForces[] createMonster() {
        int amount = new Random().nextInt(3)+4;
        DarkForces[] darkForces = new DarkForces[amount];
        darkForces[0] = new BabaYaga();
        for (int i = 1; i < amount; i++) {
            darkForces[i] = new OldTree();
        }
        return darkForces;
    }
}
