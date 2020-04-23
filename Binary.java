/** Binary to Decimal Number converter using recursion
 * Binary equivalent of 69 is 1000101
 */
import java.util.*;
public class Binary
{
    long bin,dec;
    void read()
    {
        Scanner as=new Scanner(System.in);
        System.out.print("Enter the Binary Number:");
        bin=as.nextLong();
        if(check(bin)==false)
        {
            System.out.println("The Binary number is invalid, pls try again.");
            read();
        }
    }
    boolean check(long binC)
    {
        int l=String.valueOf(binC).length();
        for(int i=1;i<=l;i++,binC/=10)
        if(binC%10!=0 && binC%10!=1)
        return false;
        return true;
        
    }
    long convert(long ka,int l)
    {   
        if(ka>0)
        dec=((ka%10)*(int)Math.pow(2,l))+convert(((long)ka/10),(l+1));
        
        return dec;
    }
    void show()
    {       
        System.out.println("\nThe Binary number is:"+bin);
        System.out.println("The Equivalent decimal form is:"+convert(bin,0));
    }
    public static void main(String[] args)
    {
        Binary as1=new Binary();
        System.out.println("\t-Binary to Decimal Converter-\n");
        as1.read();
        as1.show();
    
}
}
