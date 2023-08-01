package rosa.felipe.utils;

public class JavaHelloWorldTest {

    public void testGetHelloWorld() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        String result = javaHelloWorld.getHelloWorld();
        String expected = "Hello world!";
        assert(result.equals(expected));
    }

}