import java.util.*;
public class Atul_Transport
{
    public static void main(final String args[]) {
        final Scanner as = new Scanner(System.in);
        char c;
        int kg;
        double m = 0;
        final double n;
        System.out.print("City Code:");
        c=as.next().charAt(0);
        c=Character.toUpperCase(c);
        System.out.print("Enter the weight (in KG):");
        kg=as.nextInt();
        switch(c)
        {
            case 'K':
            if(kg<100)
            m=45*kg;
            else
            m=75*(kg-100)+45*100;
            break;
            case 'M':
            if(kg<100)
            m=65*kg;
            else
            m=95*(kg-100)+65*100;
            break;
            case 'C':
            if(kg<100)
            m=75*kg;
            else
            m=115*(kg-100)+75*100;
            break;
            case 'D':
            if(kg<100)
            m=90*kg;
            else
            m=125*(kg-100)+90*100;
            break;
            default:
            System.out.println("WRONG CODE NAME!");
            
        }
        System.out.println("Your Charge(Rs):"+m+"\n Thx!");
        
}
}
