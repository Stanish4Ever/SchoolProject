import java.util.*;
public class Stack
{ int stk[]=new int[200];
    int capacity,top;
    Stack()
    {
        for(int i=0;i<200;i++)
        stk[i]=0;
    }
    Stack(int cap)
    {
        capacity=cap;
        top=-1;
    }
    void pushItem(int val)
    {
        if(top==capacity)
        System.out.println("Stack Overflow!");
        else
        {
            ++top;
            stk[top]=val;
            
        }
    }
    
    int popItem()
    {
        if(top == -1)
        {
        System.out.println("Stack Underflow!");
        return -9999;
    }
       else
        {
            int x=stk[top];
            top--;
            return x;
        }
        }
        void print_stack()
        {
            if(top== -1)
            System.out.println("Stack Underflow!");
            else
            {
                System.out.println("The Elements in the Stack:");
                for(int i=top;i>=0;i--)
                System.out.println(stk[i]);
            }
                
            }
            
        
        
    }

