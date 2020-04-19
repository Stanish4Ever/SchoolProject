
public class Node
{
   int item;
   Node object;
   void add_beginning(int num)
   {
      Node temp=new Node();
      temp.item=num;
      temp.object=null;
      if(object==null)
      object=temp;
      else{
          Node n=object;
         while(n.object!=null)                        
          n=n.object;
         n.object=temp;
        }
       
    }
    void delete()
    {
        Node n=object;
        Node p=null;
         
          while(n.object!=null)
          {
              p=n;
              n=n.object;          
          }
        p.object=null;
    }
   
    void show()
    {
        Node temp=new Node();
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