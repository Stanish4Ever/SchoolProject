import java.util.*;
public class hIGHheELsLowPlaIns
{
    static void main(){
        Scanner as=new Scanner(System.in);
        System.out.println("Enter The String:");
        String s=as.nextLine();
        s=s+' ';
        int l=s.length();
        int i,k=0,max=0,min=l,l2;
        String s1,s2="",s3="";
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                s1=s.substring(k,i);
                l2=s1.length();
                if(l2>max)
                {
                s2=s1;
                max=l2;
            }
                if(l2<min)
                {s3=s1;
                    min=l2;
                }
                k=i+1;
            }
        }
        System.out.println("Longest Length Word in the String:"+s2+"\nShortest length word in the String:"+s3);
        
    }
}
              

