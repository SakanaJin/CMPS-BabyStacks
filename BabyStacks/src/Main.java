
public class Main {
    public static void main(String[] args) {
        String a = "bob";
        String b = "aet nomel";
        String c = "snoino dna revil etah I";
        String d = "SELUR LOBOC";

        int i;
        char chr;
        Stack stack = new Stack();

        for(i = 0; i<a.length();i++){
            stack.push(a.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

        System.out.println();

        for(i = 0; i<b.length();i++){
            stack.push(b.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

        System.out.println();

        for(i = 0; i<c.length();i++){
            stack.push(c.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

        System.out.println();

        for(i = 0; i<d.length();i++){
            stack.push(d.charAt(i));
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}