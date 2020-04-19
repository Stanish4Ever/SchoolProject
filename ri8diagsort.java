 import java.util.*;
public class ri8diagsort
{
    public static void main(String args[])
    {
        Scanner as = new Scanner(System.in);
        int[][]a;
        int i,j,k,y;
         System.out.println("\tThe Ri8 Array Printing Program\n");
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
        for (i = 0,y=n-1; i < (n-1); i++)
        {
            for (j = 0,y=n-1; j < (n - i-1); j++,y--) 
            {                
                if (a[j][y] > a[j+1][y-1])
                {
                    k= a[j][y];
                    a[j][y]= a[j+1][y-1];
                    a[j+1][y-1]= k;
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

