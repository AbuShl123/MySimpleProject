package pattern_strategy.scheme_design;

public class StrategySubtraction implements IStrategy{
    @Override
    public void execute(int a, int b) {
        System.out.println(a-b);
    }
}
