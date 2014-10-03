package ph.samson.examples.guice.privatemodule.one;

import com.google.inject.PrivateModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import ph.sample.examples.guice.privatemodule.CommonThing;

public class LoverModule extends PrivateModule {

    @Override
    protected void configure() {
        bind(Lover.class).to(LoverImpl.class);
        expose(Lover.class);
    }

    @Provides
    @Singleton
    public CommonThing lovedThing() {
        return CommonThing.getInstance("one");
    }
}
