import java.util.*;

public class Check
{
String str;
int w;
void InputString()
{
    Scanner as = new Scanner(System.in);
    System.out.print("\t\t INPUT \n\nEnter the Sentence:");
    str=as.nextLine();
    str=" "+str;
    w=0;
}
void counter(int n)
{
    if(n<str.length())
    {
        char c=str.charAt(n);
        if((c=='A' || c=='E' || c=='I' || c=='O' || c=='U')&& str.charAt(n-1)==' ')
        w++;
        counter(++n);        
    }
    else
    return;
}
void Disp()
{
    counter(0);
   System.out.println("\n\t \t THE OUTPUT:");   
    System.out.println("\nThe Sentence:"+str+" has total "+w+" word(s) starting with Capital Vowels.");
}
public static void main(String args[])
{
    Check word=new Check();
    word.InputString();
    word.Disp();

}
}
