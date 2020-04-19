import java.awt.*;
public class Music {
  public static void main(String args[])throws InterruptedException {
    System.out.println("\t\t R U READY FOR SOME MUSIC!!!");
     Thread.sleep(1000);
     System.out.println("\u000c \t\t \t 3");
     Thread.sleep(700);
     System.out.println("\u000c\t\t \t 2");
     Thread.sleep(600);
     System.out.println("\u000c\t\t \t ! ");
     Thread.sleep(500);
      for(int i=1 ;i<=34;i++)
     {
         Thread.sleep(200);
     Toolkit.getDefaultToolkit().beep();   
     if(34%i==0)
     Thread.sleep(1000);
  }
   for(int i=1 ;i<=16;i++)
     {
     Thread.sleep(100);
     Toolkit.getDefaultToolkit().beep();   
     if(16%i==0)
     Thread.sleep(500);
  }
     for(int i=1 ;i<=10;i++)
     {
     Thread.sleep(100);
     Toolkit.getDefaultToolkit().beep();   
     
  }
  System.out.println("\u000c\t\t Fantastico Music!!");
}
}