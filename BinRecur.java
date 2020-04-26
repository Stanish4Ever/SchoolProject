/** Binary Search using Recursion technique!
 * Search a sorted array by repeatedly dividing the search interval in half.
 * Begin with an interval covering the whole array. 
 * If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. 
 * Otherwise narrow it to the upper half. 
 * Repeatedly check until the value is found or the interval is empty. */
import java.util.*;
public class BinRecur
{
    int s,n;
    int a[];
    void input()
    {
        Scanner as= new Scanner(System.in);
        System.out.println("\t\t ~INPUT~");
        System.out.print("Enter the Size of the Array:");
        n=as.nextInt();
        a=new int[n];
        System.out.println("Enter the Integers into the Array:");
        for(int i=0;i<n;i++)
        a[i]=as.nextInt();
        sorting();
        System.out.println("Array after Sorting:");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"  ");
        System.out.println("\nEnter the Element to be Searched:");
        s=as.nextInt();
    }
    void sorting() //BubbleSort
    {
    int temp;
    for (int i=0; i<n; i++)
      {        
        for (int j = 1; j <(n - i); j++) {

            if (a[j - 1] > a[j])
               {
                temp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = temp;
               }

        }
      }
    }
    void search(int l, int u)
    {
        if(l<=u)
        {
            int m=(l+u)/2;
           
            if(s>a[m])
            l=m+1;
            if(s<a[m])
            u=m-1;
            if(a[m]==s)
            {
            System.out.println("Processing Complete..Search Element Found at Index Position :"+m);
            return;
            }
            search(l,u);        
        }
        else
        {
        System.out.println("Processing Complete..Search Element not Found");
        return;
        }
    }
    void Display()
    {
        System.out.println("\n\n ~OUTPUT~");
        search(0,(n-1));
    }
    public static void main(String args[])
    {
        BinRecur find = new BinRecur();
        find.input();
        find.Display();
    }
    
}
