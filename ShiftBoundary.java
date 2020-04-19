import java.util.*;
public class ShiftBoundary
{
    public static void main(String args[])
    {
        int r,c,i,j,x;
        Scanner as = new Scanner (System.in);
        System.out.println("\t\t ANTICLOCKWISE BOUNDARY SHIFT\n\n");
        System.out.print("Enter the Required details of the matrix :- \nRow:");
        r=as.nextInt();
        System.out.print("Column:");
        c=as.nextInt();
        int c1=0, c2=c-1, r1=0, r2=r-1;
        int a[][]=new int[r][c];
        System.out.println("Enter the Numbers in the Matrix:");
        for(i=0;i<r;i++)
        {
            System.out.println("ROW:"+(i+1));
            for(j=0;j<c;j++)
            a[i][j]=as.nextInt();
        }
        System.out.println("\n The Original Matrix:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }             
                    for( i=c1;i<=c2-1;i++)
                    {
                         x=a[r1][i+1];
                         a[r1][i+1]=a[r1][i];
                         a[r1][i]=x;
                    } 
                    for( j=r1;j<=r2-1;j++)
                    {
                        x=a[j][c2];
                        a[j][c2]=a[j+1][c2];
                        a[j+1][c2]=x;
                    } 
                    for( i=c2;i>c1;i--)
                    {
                        x=a[r2][i];
                        a[r2][i]=a[r2][i-1];
                        a[r2][i-1]=x;
                    } 
                    for( j=r2;j>r1+1;j--)
                    {
                        x=a[j][c1];
                        a[j][c1]=a[j-1][c1];
                        a[j-1][c1]=x;
                    }
        System.out.println("\nThe Anti-Clockwise Boundary Shifted Matrix:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }            
    }
}
