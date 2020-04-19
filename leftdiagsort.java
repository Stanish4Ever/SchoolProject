import java.util.*;
public class leftdiagsort
{
    public static void main(String args[])
    {
        Scanner as = new Scanner(System.in);
        int[][]a;
        int i,j,k;
         System.out.println("\tThe Left Diag Array Printing Program\n");
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
        System.out.println("The Array:");
        for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             System.out.print(a[i][j]+"  ");
             System.out.println();
        }
        for (i = 0; i < (n-1); i++)
        {
            for (j = 0; j < (n - i-1); j++) 
            {                
                if (a[j][j] > a[j+1][j+1])
                {
                    k= a[j][j];
                    a[j][j]= a[j+1][j+1];
                    a[j+1][j+1]= k;
                }
            }
        }
        System.out.println("The Sorted Array:");
        for(i=0;i<n;i++)
        {
             for(j=0;j<n;j++)
             System.out.print(a[i][j]+"  ");
             System.out.println();
        }
    }
}