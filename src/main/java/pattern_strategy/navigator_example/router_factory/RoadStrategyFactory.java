package pattern_strategy.navigator_example.router_factory;

import pattern_strategy.navigator_example.RoadStrategy;
import pattern_strategy.navigator_example.RouteStrategy;
import pattern_strategy.navigator_example.WalkingStrategy;

public class RoadStrategyFactory implements RouteStrategyFactory{
    @Override
    public RouteStrategy createRouter() {
        return new RoadStrategy();
    }
}
