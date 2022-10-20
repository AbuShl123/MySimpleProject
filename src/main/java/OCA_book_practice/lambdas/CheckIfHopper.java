package OCA_book_practice.lambdas;

public class CheckIfHopper implements CheckTrait{
    @Override
    public boolean test(Animal a) {
        return a.isCanHop();
    }
}
