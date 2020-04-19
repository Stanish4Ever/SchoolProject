    import java.util.*;
public class Queue
{
    int que[]=new int[100]; int capacity,front,rear;
    Queue()
    {
        for(int i=0;i<100;i++)
        que[i]=0;
    }
    Queue(int limit)
    {
        capacity = limit;
        front=0;
        rear=-1;        
    }
    void dataPush(int num)
    {
        if(rear == capacity)
        System.out.println("Queue is Full");
        else
        {
            rear++;
            que[rear]=num;            
        }
    }
    int dataPop()
    {
        if(rear==-1 || front>rear)
        {
        System.out.println("Queue is Empty.");
        return -9999;
        }
        else
        {
            int x=que[front];
            ++front;
            return x;
        }        
    }void QueueDisplay()
    {
        if(rear==-1 || front>rear)
        System.out.println("Queue Underflow!");
        else
        {
            System.out.println("The Queue:");
            for(int i=front;i<=rear;i++)
            System.out.print(que[i] + "\t");
        }
        }}