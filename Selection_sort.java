import java.io.*;
public class Selection_sort
{
    public static void main(String[] args)throws IOException
    {
      int i,j,m;
      String t="";
      System.out.println("\t Selection Sort for String\n");
      BufferedReader as=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the Number of Array Elements you wanna ENTER:");
      int n=Integer.valueOf(as.readLine());
     String a[]=new String[n];
      System.out.println("Enter the Strings Consecutively:");
      for(i=0;i<n;i++)
      a[i]=as.readLine();
      for(i=0;i<(n-1);i++)
      {
          m=i;
          for(j=i+1;j<n;j++)
          if(a[m].compareTo(a[j])>0)
          m=j;
          t=a[m];
          a[m]=a[i];
          a[i]=t;
        }
         System.out.println("\nThe Newly Arranged array:");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
        System.out.println("\n------------------------------------------");
    }
}
