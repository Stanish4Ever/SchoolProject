import java.io.*;
public class Repeated_words
{
    public static void main(String args[])throws IOException
    {
        int l,i,j,k=0,f=0,k1=0;       
        String s,s1="",s2="";
        BufferedReader as=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("\t\t REPEATED WORDS \n\n Enter The String:");
        s=as.readLine(); 
        s=s+" ";
        l=s.length();
        System.out.println("\nREPEATED WORDS:");
        for(i=0;i<l;i++)
        {
           if(s.charAt(i)==' ')
           {
               s1=s.substring(k,i);
               k1=0;
               f=0;             
               for(j=0;j<l;j++)
               {
                   if(s.charAt(j)==' ')
                   {
                       s2=s.substring(k1,j);
                       if(s1.equalsIgnoreCase(s2)==true){
                       f++;
                       if(f>1){
                           s=s.substring(0,k1)+s.substring(j+1);
                           l=s.length();
                        }
                    }
                     k1=j+1;
                    }
                }
               if(f>1)
               System.out.println(s1+" is repeated "+f+" times.");
               k=i+1;
              }
        }
    } 
    }
