
public class Main {
    public static void main(String[] args) {
        System.out.println("Working");

        Stack S = new Stack();
        S.push('a');
        S.push('b');
        System.out.println(S.pop());
        S.push('c');
        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
    }
}