import java.util.*;
public class PigLatin
{
public static void main(String args[])
{
    String s,s1,s2="";
    char c;
    int i,l,x=0;
    Scanner as = new Scanner (System.in);
    System.out.print("\t PigLatin Form \n\n Enter a Word:");
    s=as.nextLine();
    l=s.length();
    s1=s.toUpperCase();
    for(i=0;i<l;i++)
    {
        c=s1.charAt(i);
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
        s2+=s.substring(i)+s.substring(0,i)+"ay";
        x=1;
        break;
        }        
    }
    if(x==1)
    System.out.println("The Piglatin word of "+s+" is " + s2);
    else
    System.out.println("The Piglatin word of "+s+" cannot be formed! ");
}
}
