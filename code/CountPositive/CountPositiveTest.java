import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test fails!
   @Test public void arrayContainsZeroes() 
   {
      int arr[] = {-4, 2, 0, 2};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }
   // this test OK!
   @Test public void arrayNoContainsZeroes() 
   {
      int arr[] = {-4 ,-2 ,2 ,1};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }
}
