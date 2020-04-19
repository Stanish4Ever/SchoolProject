public class Node2
{
    int item;Node2 object;
   void add_beginning( int num)
   {
      Node2 temp=new Node2();
      temp.item=num;
      temp.object=null;     
      if(object==null)
      object=temp;
      else{
          Node2 n=object;         
          while(n.object!=null)
          n=n.object;          
        n.object=temp;
        }       
}
 void newwhere(int x)
    {
        Node2 n=object;
        Node2 p=null;Node2 y=new Node2();        
         int i=1;
          while(n.object!=null)
          {
          p=n;
          n=n.object;
          if(i>=(x))
              { 
                  y.item=p.item;
                  p.item=n.item;
                  n.item=y.item;
                }
          ++i;
        }p.object=null;
    }
    void show()
    {
        Node2 temp=new Node2();
        temp=object;
         System.out.println("The Data in the Linked List:");
       while(temp.object!=null)
        {
        System.out.print("|"+temp.item+"|->");
        temp=temp.object;
       }
       System.out.println("|"+temp.item+"|");       
    }
}