import java.util.*;
public class RevStr
{
    String str,revs="";
    void getstring()
    {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the Word:");
        str= as.nextLine();
    }
    void reverse(int l)
    {
        if(l>=0)
        {
            char c=str.charAt(l);
            revs+=c;
            reverse((l-1));
        }
    }
    void check()
    {
        reverse((str.length()-1));
        if(str.equalsIgnoreCase(revs)==true)        
            System.out.println("The Word "+str+" is a palindrome word");
            else 
            System.out.println("The word " + str+ " is not a palindrome word!");
    }
    public static void main(String[] args)
    {
        System.out.println("\tA PALINDROME PROGRAM\n");
        RevStr as1=new RevStr();
        as1.getstring();
        as1.check();
    }
}
