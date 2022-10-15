package pattern_strategy.scheme_design;

public class Context { // <- context object's class
    /*
    The original object, called context, holds a reference to a strategy object. The context delegates executing
    the behavior to the linked strategy object. In order to change the way the context performs its work, other
    objects may replace the currently linked strategy object with another one.

     */
    private IStrategy strategy; // <- reference to a strategy object
    // division, addition, multiplication, subtraction -- are strategies


    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int a, int b) { // <- behaviour which each strategy object realises differently
        strategy.execute(a, b);
    }
}
