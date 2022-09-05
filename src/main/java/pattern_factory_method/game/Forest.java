package pattern_factory_method.game;

import pattern_factory_method.game.darkForces.DarkForces;

import java.util.List;

public class Forest {
    private List<DarkForces> darkForces;

    private static Forest forest;

    private Forest() {}

    public static Forest getInstance(){
        if (forest == null) {
            return new Forest();
        }
        return forest;
    }

    public void setDarkForces(List<DarkForces> darkForces) {
        this.darkForces = darkForces;
    }

    public List<DarkForces> getDarkForces() {
        return darkForces;
    }
}
