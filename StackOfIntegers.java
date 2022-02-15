import javax.management.ValueExp;
/*** Class to create a stack with a default size of 16 if not declared.
*/

public class StackOfIntegers 
{
    
    private int[] elements;
    private int size;

    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }

    public StackOfIntegers(){
        this.elements = new int[16];
        }

    public StackOfIntegers(int capacity){
        this.elements = new int[capacity];
    }

    public boolean empty(){
        if (size == 0)
        {
            return true;
        }
        return false;
    }
    
    public int peek(){
        return this.elements[size];
    }

    public void push(int value){
        size += 1;
        elements[size] = value;

    }

    public int pop(){
        int temp;
        temp = elements[size]; 
        elements[size] = 0;
        size -= 1;
        return temp;
    }

    public int getSize(){
        return size;
    }
}
