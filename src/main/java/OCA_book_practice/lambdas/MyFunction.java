package OCA_book_practice.lambdas;

import java.util.function.Predicate;

public interface MyFunction<T> {

    default boolean isIt(T t, Predicate<String> g) {
        return true;
    }

}
