import java.util.*;
public class TeleCall
{
    long phone;
    String name;
    int n;
    double amt;
    TeleCall(long p,String nm,int num)
    {
        name=nm;
        phone=p;
        amt=0;
        n=num;
    }
    void Compute()
    {
        if(n>=1 && n<=100)
        amt=500;
        if(n>=101 && n<=201)
        amt=500+((n-100)*1);
        if(n>=201 && n<=300)
        amt=500+100+((n-200)*1.20);
        if(n>300)
        amt=500+100+(100*1.20)+((n-300)*1.50);
    }
    void Display()
    {   System.out.println("\n-----------------------------------------------"); 
        System.out.println("\n\t\tYOUR BILL:");
        System.out.println("\n\tCustomer Name:"+name+"\n\tPhone Number:"+phone+"\n\tBill(Rs):"+amt);
        System.out.println("\n-----------------------------------------------"); 
    }
    public static void main(String[] args)
    {
        Scanner as=new Scanner(System.in);
        System.out.println("\tTelecomunication Bill Generator\n");
        System.out.print("Enter your Name:");
        String N=as.nextLine();
        System.out.print("Enter your Phone Number:");
        long PhNO=as.nextLong();
        System.out.print("Enter The Number of Times you Made A Calls:");
        int Call=as.nextInt();
        TeleCall as1=new TeleCall(PhNO,N,Call);
        as1.Compute();
        as1.Display();
    }
}   
        