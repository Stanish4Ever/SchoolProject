import java.util.*;
public class BinSe
{
    public static void main(String[] args)
    {
        Scanner as=new Scanner(System.in);
        int a[]=new int[10];
        int i,ub=9,lb=0,p,f=0;
        System.out.println("\t-BINARY SEARCH-\nFill the Array with Interger Numbers in Ascending Order:");
        for(i=0;i<10;i++)
        a[i]=as.nextInt();
        System.out.println("Enter the Number to be searched:");
        int s=as.nextInt();
        while(lb<=ub)
        {
            p=(ub+lb)/2;
            if(a[p]<s)
            lb=p+1;
            if(a[p]>s)
            ub=p-1;
            if(a[p]==s)
            {
                f=1;
                break;
            }
           }
        if(f==1)
        System.out.println("Search Successful..The Number was found!");
        else
        System.out.println("Search Unsuccessful..The Number was not found!");
    }
                

}
