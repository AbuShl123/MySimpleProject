package pattern_factory_method.game.factory;

import pattern_factory_method.game.darkForces.DarkForces;
import pattern_factory_method.game.darkForces.OldTree;

import java.util.Random;

public class EasyGameDarkForcesFactory implements DarkForcesFactory {
    @Override
    public DarkForces[] createMonster() {
        int amount = new Random().nextInt(3)+3;
        DarkForces[] entities = new DarkForces[amount];
        for (int i = 0; i < amount; i++) {
            entities[i] = new OldTree();
        }

        return entities;
    }
}
