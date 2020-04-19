
import java.util.*;
public class ArmRecur
  {
    int n;    
    void Input()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("\t-ARMSTRONG NUMBER CHECKER-\n");
        System.out.println("Enter A Number:");
        n=as.nextInt();
    }
    int arm(int x)
    {
        if(x==0)
        return 0;
        else
        {
        return(((x%10)*(x%10)*(x%10))+arm(x/10));
    }
    }
    void Display()
    {
        if(arm(n)==n)
        System.out.println("It's an Armstrong No..!"+arm(n));
        else
        System.out.println("It's not an Armstrong No..!"+n);
    }
    public static void main(String[] args)
    {
        ArmRecur a=new ArmRecur();
        a.Input();
        a.Display();
    }
}