package pattern_strategy.navigator_example;

import pattern_strategy.navigator_example.point.Point;
import pattern_strategy.navigator_example.router_factory.PublicTransportStrategyFactory;
import pattern_strategy.navigator_example.router_factory.RoadStrategyFactory;
import pattern_strategy.navigator_example.router_factory.RouteStrategyFactory;
import pattern_strategy.navigator_example.router_factory.WalkingStrategyFactory;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String navType = new Scanner(System.in).next();
        RouteStrategyFactory routerFactory = getFactory(navType);
        Navigator navigator = new Navigator(routerFactory.createRouter());

        Point a = new Point(45,23);
        Point b = new Point(55, 10);
        navigator.buildRoute(a, b);
    }

    public static RouteStrategyFactory getFactory(String type) {
        if (type.equalsIgnoreCase("walker")) {
            return new WalkingStrategyFactory();
        } else if (type.equalsIgnoreCase("road")) {
            return new RoadStrategyFactory();
        } else if (type.equalsIgnoreCase("public transport")) {
            return new PublicTransportStrategyFactory();
        } else {
            throw new IllegalArgumentException(type + " type is not valid");
        }
    }
}
