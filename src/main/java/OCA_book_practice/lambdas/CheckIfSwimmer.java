package OCA_book_practice.lambdas;

public class CheckIfSwimmer implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.isCanSwim();
    }
}
