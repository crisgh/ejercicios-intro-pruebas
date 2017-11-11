import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{
   // this test fails!
   @Test public void lastOccurrenceInFirstElement() 
   {
      int arr[] = {2, 3, 5};
      int y = 2;
      assertEquals("Last occurence in first element", 0, FindLast.findLast(arr, y));
   }
   @Test public void lastOccurrenceInLastElement() 
   {
      int arr[] = {3, 3, 2};
      int y = 2;
      assertEquals("Last occurence in last element", 2, FindLast.findLast(arr, y));
   }
   @Test public void lastOccurrenceInMiddle() 
   {
      int arr[] = {3, 2, 3};
      int y = 2;
      assertEquals("Last occurence in midle element", 1, FindLast.findLast(arr, y));
   }
}
