import java.util.*;
public class Modified
{
    String s1,s2;
    Modified()
    {
        s1="";
        s2="";
    }
    void Input()
    {
        Scanner as=new Scanner(System.in);
        System.out.print("Enter the Sentence:");
        s1=as.nextLine();
    }
    void Process()
    {
        s1=s1+" ";
        int l,l2,i,k=0;
        l=s1.length();
        char c;
        String s="";
        for(i=0;i<l;i++)
        {
            c=s1.charAt(i);
            if(c==' ')
            {
                s=s1.substring(k,i);
                l2=s.length();
                
                if(l2%2==0)
                s2+=s.substring(((l2/2)-1),((l2/2)+1))+" ";
                else
                s2+=s.charAt(l2/2)+" ";
                k=i+1;
            }
        }
    }
        void Display()
        {
            System.out.println("The New Modiefied Sentence:"+s2);
        }
    
    public static void main(String[] args)
    {
        System.out.println("\tMid-Letter Extractor\n");
        Modified as1=new Modified();
        as1.Input();
        as1.Process();
        as1.Display();
    }
}