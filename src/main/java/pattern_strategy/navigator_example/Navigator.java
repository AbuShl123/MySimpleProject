package pattern_strategy.navigator_example;

import pattern_strategy.navigator_example.point.Point;

public class Navigator {

    RouteStrategy router;

    public Navigator (RouteStrategy router) {
        this.router = router;
    }

    public void buildRoute(Point a, Point b) {
        router.buildRoute(a, b);
    }

}
