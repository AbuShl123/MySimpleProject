package pattern_factory_method.game.factory;

import pattern_factory_method.game.darkForces.BabaYaga;
import pattern_factory_method.game.darkForces.DarkForces;
import pattern_factory_method.game.darkForces.ForestMonster;
import pattern_factory_method.game.darkForces.OldTree;

public interface DarkForcesFactory {
    DarkForces[] createMonster();

    default DarkForces createSingleMonster(String monster){
        if (monster.equalsIgnoreCase("forest monster")) {
            return new ForestMonster();
        } else if (monster.equalsIgnoreCase("baba yaga")) {
            return new BabaYaga();
        } else if (monster.equalsIgnoreCase("old tree")) {
            return new OldTree();
        } else {
            throw new RuntimeException(monster + " monster is unknown");
        }
    }
}
