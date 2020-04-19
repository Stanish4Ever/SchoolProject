import java.util.*;
public class upperdiagonal
{
    public static void main(String[]args)
    {
        Scanner ob = new Scanner(System.in);
        int[][]a;
        int i,j;
        System.out.print("Enter the Size of The Square Matrix:");
        int n=ob.nextInt();
        a=new int[n][n];
        System.out.println("Enter the Numbers in the Array:");
        for(i=0;i<n;i++)
        {
             System.out.println("Row:"+(i+1));
             for(j=0;j<n;j++)
             a[i][j]=ob.nextInt();
        }
        System.out.println("The Array:");
        for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             System.out.print(a[i][j]+"  ");
             System.out.println();
        }
         System.out.println("The Upper Diagonal:");
         for(i=0;i<n;i++)
         {
             for(j=0;j<n;j++)
             if((i+j)<n)
             System.out.print(a[i][j]+"  ");
             System.out.println();
         }
    }
}
