package pattern_strategy.navigator_example.router_factory;

import pattern_strategy.navigator_example.RouteStrategy;
import pattern_strategy.navigator_example.WalkingStrategy;

public class WalkingStrategyFactory implements RouteStrategyFactory {
    @Override
    public RouteStrategy createRouter() {
        return new WalkingStrategy();
    }
}
