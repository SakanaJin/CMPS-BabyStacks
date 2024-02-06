
public class Main {
    public static void main(String[] args) {
        String a = "bob";
        String b = "aet nomel";
        String c = "snoino dna revil etah I";
        String d = "SELUR LOBOC";
        StringBuilder temp = new StringBuilder();

        int i;
        Stack stack = new Stack();

        for(i = 0; i<a.length();i++){
            stack.push(a.charAt(i));
        }

        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }
        a = temp.toString();
        temp = new StringBuilder();

        for(i = 0; i<b.length();i++){
            stack.push(b.charAt(i));
        }

        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }
        b = temp.toString();
        temp = new StringBuilder();

        for(i = 0; i<c.length();i++){
            stack.push(c.charAt(i));
        }

        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }
        c = temp.toString();
        temp = new StringBuilder();

        for(i = 0; i<d.length();i++){
            stack.push(d.charAt(i));
        }

        while(!stack.isEmpty()){
            temp.append(stack.pop());
        }
        d = temp.toString();

        System.out.println(a + '\n' + b + '\n' + c + '\n' + d);
    }
}