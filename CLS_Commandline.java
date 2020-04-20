import java.io.*;

public class CLS_Commandline
{
     
    public static void main(String args[])throws IOException, InterruptedException{
       int l;
       System.out.print("Enter An Awesome Number!:");
       BufferedReader as=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.valueOf(as.readLine());
       l=String.valueOf(n).length();
       System.out.println("The Length of the Number:"+l);     

      
       
       System.out.print("Enter 1:");
       n=Integer.valueOf(as.readLine());
       if(n==1)
       new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
       System.out.print("Enter Second Awesome Number!:");
      
        n=Integer.valueOf(as.readLine());
       if(n==1)
       System.out.println("The Length of the Number:"+l);
  else
       System.out.print('\u000C');
String s="Examination";
System.out.println(s.startsWith(s.substring(5))+"   "+(s.charAt(2)==s.charAt(6)));
}
}

   