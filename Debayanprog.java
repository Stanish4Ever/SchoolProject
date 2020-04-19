import java.io.*;
public class Debayanprog
{
    public static void main()throws IOException
    {
        BufferedReader as = new BufferedReader(new InputStreamReader(System.in));
        int n;
        for(;;)
        {
            System.out.print("Enter the Number of Strings you want to enter:");
            n=Integer.valueOf(as.readLine());
            if(n>=2 && n<=9)
            break;
            System.out.println("Wrong Input!!! Try Again..");
        }
        String s1[]=new String[n];
        int l=0;
        System.out.println("Enter the Names:");
        for(int i=0,k=1;i<n;i++,k++)
        {   System.out.print("Team "+(i+1)+":");        
            s1[i]=as.readLine();            
            if(l<s1[i].length())
            l=s1[i].length();
        }
        char s[][]=new char[l][n];
        int i,j;
        for(i=0;i<l;i++)
        {
            for(j=0;j<n;j++)
            {
                if(s1[j].length()>=(i+1))                                
                s[i][j]=s1[j].charAt(i);
                else
                s[i][j]=' ';
                
            }
        }
        System.out.println("The Output:");
        for(i=0;i<l;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(s[i][j]);
                for(int k=1;k<=8;k++)
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
