import java.util.*;
public class Binary
{
    long bin,dec;
    void read()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("\t-Binary to Decimal Converter-\n");
        System.out.print("Enter the Binary Number:");
        bin=as.nextLong();
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
        as1.read();
        as1.show();
    
}
}
