package pattern_strategy.navigator_example;

import pattern_strategy.navigator_example.point.Point;

public interface RouteStrategy {

    void buildRoute(Point a, Point b);

}
