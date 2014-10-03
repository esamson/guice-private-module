package ph.samson.examples.guice.privatemodule.two;

import com.google.inject.Inject;
import ph.sample.examples.guice.privatemodule.CommonThing;

/**
 * Implementation 2. Relies on a CommonThing.
 */
class HaterImpl implements Hater {

    private final CommonThing thing;

    @Inject
    public HaterImpl(CommonThing thing) {
        this.thing = thing;
    }

    @Override
    public String hates() {
        return thing.getIdentity();
    }
}
