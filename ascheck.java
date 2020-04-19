public class ascheck
{
    public static void main()
    {
       String str2="CmPtr";
        int i,j,x1,x2,l=str2.length();
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                x1=(int)str2.charAt(i);
                x2=(int)str2.charAt(j);System.out.println("   "+str2);
                if(x1>x2)
                str2=str2.substring(0,i)+str2.charAt(j)+str2.substring((i+1),j)+str2.charAt(i)+str2.substring(j);
                System.out.println("             "+str2);
            }
        }
        System.out.println(str2);
        
    }
}
