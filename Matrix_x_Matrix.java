import java.util.*;
public class Matrix_x_Matrix{

    public static void main(String[] args) {
        Scanner as=new Scanner(System.in); 
        int r1, c1,i,j;
        int r2, c2;
        int[][] a;
        int[][] b;
         System.out.println("\tThe Matrix multiplication Program\n");
        System.out.println("Enter the Size of the First Array:");
        r1=as.nextInt();
        c1=as.nextInt();
        a=new int[r1][c1];
        System.out.println("Enter the Size of the Second Array:");
        r2=as.nextInt();
        c2=as.nextInt();
        b=new int[r2][c2];
        System.out.println("Enter the Numbers in the First Array:");
        for(i=0;i<r1;i++)
        {
             System.out.println("Row:"+(i+1));
             for(j=0;j<c1;j++)
             a[i][j]=as.nextInt();
        }
        System.out.println("Enter the Numbers in the Second Array:");
        for(i=0;i<r2;i++)
        {
             System.out.println("Row:"+(i+1));
             for(j=0;j<c2;j++)
             b[i][j]=as.nextInt();
        }
        if(c1==r2)
        {
        int[][] S = new int[r1][c2];
        for(i = 0; i < r1; i++)
            for ( j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    S[i][j] += a[i][k] * b[k][j];
        System.out.println("Multiplication of two matrices is: ");
        for(int[] r : S) {
            for (int c : r) {
                System.out.print(c + "    ");
            }
            System.out.println();
        }
       }
       else
       System.out.println("Matrix Multiplication Not Possible!");
}
}