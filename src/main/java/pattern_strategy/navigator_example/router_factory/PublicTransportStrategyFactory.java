package pattern_strategy.navigator_example.router_factory;

import pattern_strategy.navigator_example.PublicTransportStrategy;
import pattern_strategy.navigator_example.RouteStrategy;

public class PublicTransportStrategyFactory implements RouteStrategyFactory{
    @Override
    public RouteStrategy createRouter() {
        return new PublicTransportStrategy();
    }
}
