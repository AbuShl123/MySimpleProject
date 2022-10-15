package pattern_strategy.scheme_design;

public class StrategyDivision implements IStrategy{
    @Override
    public void execute(int a, int b) {
        System.out.println(a/b);
    }
}