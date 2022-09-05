package pattern_factory_method.developer;

import pattern_factory_method.developer.developers.CppDeveloper;
import pattern_factory_method.developer.developers.Developer;
import pattern_factory_method.developer.developers.JavaDeveloper;
import pattern_factory_method.developer.factory.CppDeveloperFactory;
import pattern_factory_method.developer.factory.DeveloperFactory;
import pattern_factory_method.developer.factory.JavaDeveloperFactory;

public class Program {
    public static void main(String[] args) {
        CppDeveloper cppDeveloper = new CppDeveloper();
        cppDeveloper.writeCode();

        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.writeCode();

        System.out.println("==========================");

        Developer dev1 = new CppDeveloper();
        dev1.writeCode();

        Developer dev2 = new JavaDeveloper();
        dev2.writeCode();

        System.out.println("=========================");

        DeveloperFactory developerFactory = new CppDeveloperFactory();
        Developer developer1 = developerFactory.createDeveloper();
        developer1.writeCode();

        System.out.println("=========================");

        DeveloperFactory developerFactory1 = createDeveloper("java");
        Developer obj = developerFactory1.createDeveloper();
        obj.writeCode();

        Developer obj2 = createDeveloper("C++").createDeveloper();
        obj2.writeCode();
    }

    public static DeveloperFactory createDeveloper(String specialty) {
        if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
