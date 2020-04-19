import java.util.*;
public class Numbers
{
    long num;
    Numbers()
    {
        num=0;
    }
    void Input()
    {
        Scanner as =new Scanner (System.in);
        System.out.println("\tThe Frequency of Digits Program\n");
        System.out.println("Enter the Number:" );
        num=as.nextLong();
    }
    void digitFrequency()
    {
    long num1=num,k=0;
    int i,j,c=0;
     
    System.out.println("\t\tThe Number Given:"+num);
    System.out.println("\t\t Your Desired Output\n");
    for(i=0;i<=9;i++)
    {
        num1=num;
        while(num1!=0)
        {
            k=num1%10;
            if(k==i)
            c++;
            num1/=10;
        }
        System.out.println("The Frequency of "+i+" is "+c);
        c=0;
    }
    } 
    public static void main(String args[])
       {
           Numbers n=new Numbers();
           n.Input();
           n.digitFrequency();
       }

}
