package rosa.felipe.utils;

import org.junit.jupiter.api.Test;

public class JavaHelloWorldFakeIT {

    // fake it test
    @Test
    void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        String expected = "Hello world!";
        assert(result.equals(expected));
    }
}
