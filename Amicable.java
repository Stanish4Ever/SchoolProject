import java.util.*;
public class Amicable
{
    public int Indian(int x)
    {
        int i,c=0;
        for(i=1;i<=x/2;i++)
        if(x%i==0)
        c+=i;
        return(c);
    }
    public static void main(String args[])
    {
        int n,n1;
        Scanner as=new Scanner(System.in);
        Amicable as1=new Amicable();
         System.out.println("\tThe Amicable Numbers Checking Program\n");
        System.out.print("Enter the value of First Number : ");
        n=as.nextInt();
        System.out.print("Enter the value of Second Number : ");
        n1=as.nextInt();
        int l=String.valueOf(n).length();//STANISH STYLE TO FIND LENGTH~!
        int l1=String.valueOf(n1).length();
        System.out.println("\n\t\tOUTPUT");
        if(l==l1 && as1.Indian(n)==n1 && as1.Indian(n1)==n)
        System.out.println("\nThese Numbers "+n+" & "+n1+" are AMICABLE!");
        else
        System.out.println("\nThese Numbers "+n+" & "+n1+" are NOT AMICABLE!");
    }
}
