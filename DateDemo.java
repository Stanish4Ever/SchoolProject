import java.util.*;
import java.text.*;

public class DateDemo {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E dd.MM.yyyy 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(new Date( )));
   }
}