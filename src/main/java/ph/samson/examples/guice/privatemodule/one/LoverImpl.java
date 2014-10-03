package ph.samson.examples.guice.privatemodule.one;

import com.google.inject.Inject;
import ph.sample.examples.guice.privatemodule.CommonThing;

/**
 * Implementation 1. Relies on a CommonThing.
 */
class LoverImpl implements Lover {

    private final CommonThing thing;

    @Inject
    public LoverImpl(CommonThing thing) {
        this.thing = thing;
    }

    @Override
    public String loves() {
        return thing.getIdentity();
    }
}
