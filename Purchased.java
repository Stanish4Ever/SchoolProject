import java.util.*;
public class Purchased extends Stock
{
    int pqty,prate;
    
    Purchased(int pq,int pr, String it, int q, int r)
    {
        super(it,q,r);
        pqty=pq;
        prate=pr;
    }
    void update()
    {
        qty+=pqty;
        if((rate-prate)!=0)
        rate=prate;
        amt=qty*rate;
    }
    void display()
    {
        super.display();
          update();
        System.out.println("\n\t NEW UPDATE\n");
        System.out.println("Quantity Purchased: " +qty +" Rate/unit: "+rate);      
        System.out.println("Amount :" +amt);
    }
}
