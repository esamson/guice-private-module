package ph.sample.examples.guice.privatemodule;

import com.google.inject.AbstractModule;
import ph.samson.examples.guice.privatemodule.one.LoverModule;
import ph.samson.examples.guice.privatemodule.two.HaterModule;

/**
 * Uses private modules for their bindings.
 */
public class CommonModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new LoverModule());
        install(new HaterModule());
    }
}
