

public class TEST1
{
    int g=10;
    void func(int x, int y)
    {
        x=x-y;
        y=x*10;
        System.out.println(x+","+y);
    }
    void art()
    {
        int g = 7;
        func(this.g,g);
        System.out.println(g+","+this.g);
        func(g, this.g);
        System.out.println(g+","+this.g);
    }
    public static void main(String args[])
    {
        TEST1 as = new TEST1();
        as.art();
    }
}
