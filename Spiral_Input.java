import java.util.*;
public class Spiral_Input
{
 public static void main(String args[])
 {  
     
   Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements : ");
            int x = sc.nextInt();
            int a[][]=new int[x][x];
            int i,j,r=0,c=0,r1=x-1,c1=x-1,n=x*x;
    while(n>=1)
    {
           for(i=c;i<=c1;i++)
         a[r][i]=n--;                   
         for(j=r+1;j<=r1;j++)            
         a[j][c1]=n--;               
         for(i=c1-1;i>=c;i--)
         a[r1][i]=n--;           
        
         for(j=r1-1;j>=r+1;j--)
         a[j][c]=n--;        
         r++;
         c++;
         r1--;
         c1--;     
        }
    System.out.println("The Array :");
    for (i=0;i<x;i++)
    {
        for(j=0;j<x;j++)
        System.out.print(a[i][j]+" ");
        System.out.println();
    }
}
}
