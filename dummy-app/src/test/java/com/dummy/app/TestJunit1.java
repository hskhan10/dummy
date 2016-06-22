import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import com.dummy.app.MessageUtil;

public class TestJunit1 {

   String message = "Robert";
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      System.out.println("Inside the unit test!");
      assertEquals(message, messageUtil.printMessage());
      System.out.println("Exiting the unit test!");
   }
}
