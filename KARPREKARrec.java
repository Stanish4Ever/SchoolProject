import java.util.*;
public class KARPREKARrec
{
    long n;
         void Input()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("\t-KARPREKAR NUMBER CHECKER-\n");
        System.out.println("Enter A Number:");
        n=as.nextLong();
    }
    long Checking(String x,int l,int a)
    {
        if(a==0)
        return 0;
        else
        return(Integer.valueOf(x.substring(0,l))+Checking(x.substring(l),l,(a-1)));
        
    }
   
     void Display()
    {
        String p=String.valueOf(n*n);
        if(String.valueOf(n*n).length()%2==1)
        p="0"+p;
        if(Checking(p,(p.length()/2),2)==n)
        System.out.println("It's an Karprekar No..!"+n);
        else
        System.out.println("Sorry.It's not a karprekar No..!"+n);
    }
    public static void main(String[] args)
    {
        KARPREKARrec a=new KARPREKARrec();
        a.Input();
        a.Display();
    }
}
    

