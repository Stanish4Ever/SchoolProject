import java.util.*;
public class UltramateInput
{
    public void StartAgain(int n)
    {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter The Number:");
        n=as.nextInt();
        if(n!=0)
        StartAgain(n);         
        System.out.println(n);
        
    }
    public static void main(String[] args)
    {
         System.out.println("\tThe Unlimited Input Sum Program\n");
        UltramateInput Stanish=new UltramateInput();
        Stanish.StartAgain(0);
    }
}
