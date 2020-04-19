class MyException extends Exception 
{ 
    public MyException(String s) 
    {        
        super(s); 
    } 
}  
public class StreamLine
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            System.out.println(1);
            throw new MyException("Stanish"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Caught");               
            System.out.println(ex.getMessage()); 
        } 
    } 
} 