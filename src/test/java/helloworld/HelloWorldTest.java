package helloworld;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() {
        assertEquals("Hello World", "Hello World");
    }

    @Test
    public void testMavenResponder(){
        assertEquals(HelloWorld.mavenResponder(), "Hi, nice to meet you");
    }
}
