import java.io.*;
public class Lexicographical_Order
{
    public static void main(String args[])throws IOException
    {
        String s,s2;
        int l,i=0,j,k=0,p=0,c=0;
         System.out.println("\tThe Lexicographical Order Program\n");
        System.out.println("Enter The String:");        
        BufferedReader as=new BufferedReader(new InputStreamReader(System.in));
        s=as.readLine();
        s=s+' ';
        l=s.length();
        String s1[]=new String[l];
        for(;i<l;i++)
        {
            if(s.charAt(i)== ' ')
            {
                s1[c]=s.substring(p,i);
                p=i+1;                
                c++;
            }
        }
        for(i=0;i<c;i++)
        {
            k=i;
            for(j=i+1;j<c;j++)
            if(s1[k].compareTo(s1[j])>0)
            k=j;        
            s2=s1[k];
            s1[k]=s1[i];
            s1[i]=s2;
        }
        System.out.println("Lexicographical Order:");
        for(i=0;i<c;i++)
        System.out.print(s1[i]+" ");
    }           
}
