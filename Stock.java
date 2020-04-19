import java.util.*;
public class Stock
{
    String item;
    int qty,rate,amt;
    Stock(String it, int q,int r)
    {
        item=it;
        qty=q;
        rate=r;
        amt=qty*rate;
    }
    void display()
    {
        System.out.println("\t STOCKS \n");
        System.out.println("Original Item Name:"+item);
        System.out.println("Quantity Purchased: " +qty +" Rate/unit: "+rate);
        System.out.println("Amount :" +amt);
    }
    }
