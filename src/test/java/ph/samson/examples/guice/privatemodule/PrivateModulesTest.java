package ph.samson.examples.guice.privatemodule;

import ph.sample.examples.guice.privatemodule.CommonModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import ph.samson.examples.guice.privatemodule.one.Lover;
import ph.samson.examples.guice.privatemodule.two.Hater;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrivateModulesTest {

    /**
     * Test that they don't love and hate the same thing.
     */
    @Test
    public void testPrivacy() {
        Injector injector = Guice.createInjector(new CommonModule());
        Lover lover = injector.getInstance(Lover.class);
        Hater hater = injector.getInstance(Hater.class);
        assertNotEquals(lover.loves(), hater.hates());
    }
}
