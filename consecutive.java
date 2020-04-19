import java.util.*;
public class consecutive
{
    public static void main(String args[])
    {
        int i,j,k,n,x,s;
        Scanner as = new Scanner(System.in);
        System.out.println("\t \t CONSECUTIVE ADDITION \n\n");
        System.out.print("Enter a number:");
        n=as.nextInt();
        System.out.println("\nTHE RESULT:\n");
        for(i=1;i<=(n/2 +1);i++)
        {
            s=x=0;
           k=(n/2 +1);
            for(j=i;j<=k;j++)
            {
             if(s<=n && x==0)
             s+=j;
             if(s==n && x==0)
             {
                 k=j-1;
                 j=i-1;
                 x=1;
                 continue;
             }
             if(x==1)             
             System.out.print(j+"+");            
            
            }
            if(x==1)
            System.out.println(j+"="+n);
            
            }
        }
    }
