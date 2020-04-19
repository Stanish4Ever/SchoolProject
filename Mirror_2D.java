import java.util.*;
public class Mirror_2D
{
    public static void main(String args[])
    {
        Scanner as = new Scanner(System.in);
        int[][]a;
        int i,j,b,x=0;
         System.out.println("\tThe Mirror Array Printing Program\n");
        System.out.println("Enter the Size of The Square Matrix:");
        int n=as.nextInt();
        a=new int[n][n];
        System.out.println("Enter the Numbers in the Array:");
        for(i=0;i<n;i++)
        {
             System.out.println("Row:"+(i+1));
             for(j=0;j<n;j++)
             a[i][j]=as.nextInt();
        }
        System.out.println("\nThe Original Array:\n");
        for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             System.out.print(a[i][j]+"  ");
             System.out.println();
        }
        for(i=0,b=n-1;i<(n/2);i++,x++,b--)
        {
            for(j=0;j<n;j++)
            {
                int swap=a[j][x];
                a[j][x]=a[j][b];
                a[j][b]=swap;
            }
        }
         System.out.println("\nThe Mirror Image of the Array:\n");
        for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             System.out.print(a[i][j]+"  ");
             System.out.println();
        }
    }
}
