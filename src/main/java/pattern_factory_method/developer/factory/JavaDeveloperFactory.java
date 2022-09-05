package pattern_factory_method.developer.factory;

import pattern_factory_method.developer.developers.Developer;
import pattern_factory_method.developer.developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
