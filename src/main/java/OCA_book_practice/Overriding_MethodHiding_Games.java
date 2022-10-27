package OCA_book_practice;
// situation with method isBiden() hiding :
class Marsupial {
    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}

class Kangaroo extends Marsupial{
    public static boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo walks on two legs: " + isBiped());
    }
}

// the same situation but isBiden() is not static so overriding this time:
class Herbivorous {
    public boolean isFourLegged() {
        return false;
    }

    public void getHerbivorousDescription() {
        System.out.println("Herbivorous walk on four legs: " + isFourLegged());
    }
}

class Cow extends Herbivorous {
    @Override
    public boolean isFourLegged() {
        return true;
    }

    public void getCowDescription() {
        System.out.println("Herbivorous walk on four legs: " + isFourLegged());
    }
}

public class Overriding_MethodHiding_Games {
    public static void main(String[] args) {
        Kangaroo obj = new Kangaroo();
        obj.getMarsupialDescription();
        obj.getKangarooDescription();

        Cow cow = new Cow();
        cow.getHerbivorousDescription();
        cow.getCowDescription();
    }
}