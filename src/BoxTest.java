import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    void test() {
        Box box = new Box();
        assertTrue(box.isEmpty());
        box.put("Hello World");
        assertFalse(box.isEmpty());
        System.out.println(box.get());
        assertTrue(box.isEmpty());
    }
}