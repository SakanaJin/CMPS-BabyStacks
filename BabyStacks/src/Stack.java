public class Stack{
    private int top;
    private char[] stack = new char[50];
    Stack(){
        top = -1;
    }
    //Adds one char to the stack
    void push(char x){
        top++;
        stack[top] = x;
    }
    //removes one char from the stack and returns it
    char pop(){
        char y;
        y = stack[top];
        top--;
        return y;
    }
    //checks if the stack is empty or not
    boolean isEmpty(){
        return top == -1;
    }
}