public class caca
{
    int N=10;
    int Cal(int x,int y)
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
    public static void main()
    {
        
        caca a=new caca();
        a.information();
        System.out.println("Yo"+a.N);
    }
}
