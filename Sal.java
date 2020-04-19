import java.util.*;
public class Sal
{
    public static void main(String args[])
    {
        double n1;
        int n=0;
        int t=0;
        Scanner as=new Scanner(System.in);
        System.out.print("Enter ur Salary:");
        n=as.nextInt();
        if(n<=100000)
        t=0;
        else if(n<=150000)
        t=(10/100)*(n-100000);
        else if(n<=250000)
        t=5000+((20/100)*(n-150000));
        else 
        t=25000+((30/100)*(n-250000));
        n1=n+t;
        System.out.print("Ur Tax!:"+t+"\nTotal amount:"+n1);
    }

}
