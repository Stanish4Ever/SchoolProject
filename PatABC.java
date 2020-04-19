public class PatABC
{
    public static void main()
    {
        String s="ABCDE";
        int i;
        for(i=5;i>0;i--)        
        System.out.println(s.substring(0,i)+s.substring(0,(5-i)));
    }
}

