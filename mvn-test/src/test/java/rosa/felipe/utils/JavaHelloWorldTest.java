package rosa.felipe.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaHelloWorldTest {

    public void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        String expected = "Hello world!";
        assert(result.equals(expected));
    }

    @Test
    void testGetHelloWorld2() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        String expected = "Hello world!";
        assertEquals(expected, result);
    }
}