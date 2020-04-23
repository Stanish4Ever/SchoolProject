/** Armstrong number is a number that is equal to the sum of cubes of its digits. 
 * For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers. */
import java.util.*;
public class ArmRecur //Armstrong number check through Recursion
  {
    int n;    
    void Input()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("\t-ARMSTRONG NUMBER CHECKER-\n");
        System.out.println("Enter A Number:");
        n=as.nextInt();
    }
    int arm(int x) //Recursive function
    {
        if(x==0)
        return 0;
        else        
        return(((x%10)*(x%10)*(x%10))+arm(x/10));        
    }
    void Display()
    {
        if(arm(n)==n)
        System.out.println(arm(n)+" is an Armstrong No..!");
        else
        System.out.println(n+ " is not an Armstrong No..!");
    }
    public static void main(String[] args)
    {
        ArmRecur a=new ArmRecur();
        a.Input();
        a.Display();
    }
}