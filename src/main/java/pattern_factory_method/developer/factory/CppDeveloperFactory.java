package pattern_factory_method.developer.factory;

import pattern_factory_method.developer.developers.CppDeveloper;
import pattern_factory_method.developer.developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
