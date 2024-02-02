import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test 
	public void testPrepend() {
        LinkedList input1 = new LinkedList();
        input1.prepend(2);
        input1.prepend(1);
        assertEquals("1 2", input1.toString());
	}


  @Test
  public void testAppend() {
        LinkedList input1 = new LinkedList();
        input1.append(1);
        input1.append(2);
        assertEquals("1 2", input1.toString());
  }

  @Test
  public void testFirst() {
        LinkedList input1 = new LinkedList();
        assertEquals(null, input1.first());
  }
}
