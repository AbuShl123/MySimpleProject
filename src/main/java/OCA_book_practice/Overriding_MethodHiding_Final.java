package OCA_book_practice;

public class Overriding_MethodHiding_Final {

}

class Bird {
    public final boolean hasFeathers() {
        return true;
    }
}

class Penguin extends Bird {
//    @Override
//    public boolean hasFeathers() { // DOES NOT COMPILE
//        return false;
//    }
}
