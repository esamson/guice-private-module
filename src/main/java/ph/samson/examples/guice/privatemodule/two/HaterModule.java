package ph.samson.examples.guice.privatemodule.two;

import com.google.inject.PrivateModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import ph.sample.examples.guice.privatemodule.CommonThing;

public class HaterModule extends PrivateModule {

    @Override
    protected void configure() {
        bind(Hater.class).to(HaterImpl.class);
        expose(Hater.class);
    }

    @Provides
    @Singleton
    public CommonThing hatedThing() {
        return CommonThing.getInstance("two");
    }
}
