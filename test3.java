public class test3
{
    int p=20;
public int func(test3 d, int y)
{
    if(d.p%y==0)
    return ++d.p;
    else 
    return y;
}
public void main()
{
    test3 w = new test3();
    int q=10; w.p=20;
    q=func(w,q);
    System.out.println(w.p+","+q);
    w.p=func(w,q);
    System.out.println(w.p+","+q);
    q=func(w,q);
    System.out.println(w.p+","+q);
}    
}
