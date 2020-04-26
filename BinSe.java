/** Binary Search
 * Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array. 
 * If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. 
 * Otherwise narrow it to the upper half. 
 * Repeatedly check until the value is found or the interval is empty. */

import java.util.*;
public class BinSe
{
    public static void main(String[] args)
    {
        System.out.println("\t-BINARY SEARCH-\n");
        Scanner as=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= as.nextInt();
        int a[]=new int[n];
        int i,ub=n-1,lb=0,p,f=0;
        System.out.println("Fill the Array with Interger Numbers in Ascending Order:");
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
