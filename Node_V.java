import java.io.*;
public class Node_V
{
    String data;
    Node_V ob;
    Node_V()
    {
        data="";ob=null;
    }
    void create()throws IOException
    {
        int n;
        BufferedReader as=new BufferedReader(new InputStreamReader(System.in));        
        System.out.print("\t -NODES BEGINNING WITH VOWEL COUNTER- \n\nEnter the Number of nodes to be created:");
        n=Integer.valueOf(as.readLine());
        String x;
        System.out.print("Enter The first data:");
        x=as.readLine();
        this.data=x;
        Node_V temp;
        Node_V ptr=this;
        ptr.ob=null;
        for(int i=1;i<n;i++)
        {
            temp=new Node_V();
            if(i!=(n-1))
            System.out.print("Enter the data:");
            else
            System.out.print("Enter the Last data:");
            temp.data=as.readLine();
            temp.ob=null;
            ptr.ob=temp;
            temp=null;
            ptr=ptr.ob;
        }
        temp=ob;
          System.out.print("The Data in the Linked List:\n |"+this.data+"|->");
          if(n!=1)
          {
       while(temp.ob!=null)
        {
        System.out.print("|"+temp.data+"|->");
        temp=temp.ob;
       }
       System.out.println("|"+temp.data+"|"); 
    }
        System.out.println("Number of NODES that begins with vowels:");
        System.out.println(count_vowel(this));
    }
    int count_vowel(Node_V start)
    {
        Node_V temp=new Node_V(); temp=start;int c=0;char ch;
        while(temp!=null)
        {
            ch=Character.toLowerCase((temp.data).charAt(0));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
            temp=temp.ob;
        }return c;
    }
}         