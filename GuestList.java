import java.util.*;

public class GuestList
{
    String[]names;
    int n;
    GuestList()
    {
        n=0;
    }
    void input()
    {
        Scanner as=new Scanner(System.in);
        System.out.println("Enter the Length of 1D array:");
        n=as.nextInt();
        names=new String[n];
        for(int i=0;i<n;i++)
        {
        System.out.println("Enter the Word:"+(i+1));
        names[i]=as.nextLine();
    }
    }
    void Display()
    {System.out.println("Array:"); 
        for(int i=0;i<n;i++)
        System.out.println(names[i]); 
    }
    public static void main()
    {
        GuestList a=new GuestList();
        a.input();
        a.Display();
    }
} 
