public class TEST2
{
    public static void main()
    {
        String name="a ProFiLE";
        String S="";
        for(int x=0; x < name.length();x++)
        {
            char ch=name.charAt(x);
            if(Character.isLowerCase(name.charAt(x)))
            S+=Character.toUpperCase(name.charAt(x));
            else
            if(Character.isUpperCase(name.charAt(x)))
            if(x%2!=0)
            S+=Character.toLowerCase(name.charAt(x-1));
            else
            {
            S+=ch--;
            System.out.println("\t\t"+ ch );
        }
        }
        System.out.println(S);
        }
    }

