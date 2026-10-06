public class Stack
{
int[] array;
int size;
int top;

    Stack(int size)
    {
        this.size = size; 
        array = new int[size];
        top = -1;
    }

    public  void push(int value)
    {
        if(top == size-1)
        {
            System.out.println("stack is full");
        }
        else
        {
            top += 1;
            array[top] = value;
            
        }
    }

    public void  pop()
    {
        if(top == -1)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top -= 1;
        }
    }

    public int peek()
    {
        if(top == -1)
        {
            return -999;
        }
        else
        {
            return array[top];
        }
    }
    public void print()
        {
        for(int i = 0 ; i <= top ;i++)
        {
            System.out.println(array[i]);
        }
        }
    
    
}
