import java.util.*;
public class LetsC
{
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        int[][]a;
        int i,j;
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
        for(int[] r : a) {
            for (int c : r) {
                System.out.print(c + "    ");
            }
            System.out.println();
        }
}
}
