import java.util.*;
public class Diagonals_2D
{
    public static void main(String[]args)
    {
        Scanner as = new Scanner(System.in);
        int[][]a;
        int i,j;
         System.out.println("\tThe Diagonals Printing Program\n");
        System.out.print("Enter the Size of The Square Matrix:");
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
        System.out.println("\nThe Diagonals of the Array:");
        for(i=0;i<=n;i++)
        {
            for(j=0;j<n;j++)
            if((i-j)==0 || (i+j)==(n-1))
            System.out.print(a[i][j]+"  ");
            else
            System.out.print("  ");
            System.out.println();
        }
    }
}
