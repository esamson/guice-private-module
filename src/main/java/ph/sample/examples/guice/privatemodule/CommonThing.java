package ph.sample.examples.guice.privatemodule;

/**
 * Some common thing that clients need different instances of.
 */
public class CommonThing {
    
    private final String identity;

    private CommonThing(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }

    public static CommonThing getInstance(String identity) {
        return new CommonThing(identity);
    }
}
