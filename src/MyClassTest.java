import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {
    @Test
    void testAdd() {
        assertEquals(5, MyClass.add(2, 3));
    }

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