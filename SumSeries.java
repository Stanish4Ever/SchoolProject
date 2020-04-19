import java.util.*;
public class SumSeries
{
    int x;
    int n;
    double sum;
    SumSeries()
    {
        x=0;
        n=0;
        sum=0.0;
    }
    void readline()
    {
        Scanner as= new Scanner(System.in);
        System.out.print("\t -SUM OF SERIES-\n");
        System.out.print("Enter the Number of Terms(n):");
        n=as.nextInt();
        System.out.print("Enter The Value for X:");
        x=as.nextInt();
    }
    int getPower(int m, int p)
    {
       if(p==0)
       return 1;
       return(m*getPower(m,(p-1)));
    }
    void sum()
    {
        int i,k;
        double a,b;
        for(i=1,k=2;i<=n;i++,k+=2)
        {
            a=getPower(x,k);
            b=getPower(i,i);
            sum+=a/b;
        }
       System.out.println("The Sum of the Series:"+sum);
    }
    public static void main(String[] args)
    {
        SumSeries as1=new SumSeries();
        as1.readline();
        as1.sum();
    }
    
    
}

  