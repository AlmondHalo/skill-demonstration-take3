import static org.junit.Assert.*;
import org.junit.*;

public class AddArrayTester {
    AddArray obj = new AddArray();

    @Test
    public void AddArrayTest() {
        obj.addArray(1);
        assertEquals(2, obj.array.get(0));
    }
 }