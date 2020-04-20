public class caca
{
    int N=10;
    int Cal(int x,int y)//forgot the purpose lol!
    {
        if (y==1)
        return -(x--);
        else
        return ++x + Cal(x,--y);
    }
    void information()
    {
        int i=9120;
        while((i/=10)!=0)
        System.out.println(i);
    }
    public static void main(String args[])
    {
        
        caca a=new caca();
        a.information();
        System.out.println("Yo"+a.N);
    }
}
