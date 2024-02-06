public class Stack{
    public int top;
    public char[] stack = new char[20];

    Stack(){
        top = -1;
    }

    void push(char x){
        top++;
        stack[top] = x;
    }

    char pop(){
        char y;
        y = stack[top];
        top--;
        return y;
    }
    boolean isEmpty(){
        return top == -1;
    }
}