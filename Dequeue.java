
public class Dequeue
{
    int arr[]= new int[50];
    int l,front,rear;
    Dequeue(int L)
    {
        l=L;
        front=rear=0;
        
    }
    void addrear(int n)
    {
        if(rear==l)
        System.out.println("OVERFLOW FROM REAR");
        else
        {
            if(rear==-1)
            rear=0;
            arr[rear]=n;
            rear++;
        }
    }
    void addfront(int n)
    {
        if(rear!=-1 && front > 0 && front <= rear)
        {
            front--;
            arr[front]=n;
        }
        else
        System.out.println("OVERFLOW FROM FRONT");
    }
    int popfront()
    {
        if(rear==-1 || front>rear|| arr[front]==0)
        {
            System.out.println("UNDERFLOW FROM FRONT");
            return(-9999);
        }
        else
        {
            int temp=arr[front];
            front++;
            return temp;
        }
    }
    int poprear()
    {
        if (rear==-1 || front==-1 || front>rear)
        {
            
            System.out.println("UNDERFLOW FROM REAR");
            return(-9999);
        }
        else
        {
            rear--;
            int temp=arr[rear];
            
            return temp;
            
        }
    }
    void display()
    {
        if(rear==-1 || front>=rear)
        System.out.println("UNDERFLOW DEQUEUE");
        else
        {
            System.out.println("THE ELEMENTS in the DEQUEUE are:-");
            for(int i=front ;i<rear;i++)
            System.out.println(arr[i]+"\t");
        }
    }
   
}
    