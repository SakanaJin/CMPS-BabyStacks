
public class Main {
    public static void main(String[] args) {
        String a = "bob";
        String b = "aet nomel";
        String c = "snoino dna revil etah I";
        String d = "SELUR LOBOC";
        String temp = "";

        int i;
        Stack stack = new Stack();

        for(i = 0; i<a.length();i++){
            stack.push(a.charAt(i));
        }

        while(!stack.isEmpty()){
            temp = temp + stack.pop();
        }
        a = temp;
        temp = "";

        for(i = 0; i<b.length();i++){
            stack.push(b.charAt(i));
        }

        while(!stack.isEmpty()){
            temp = temp + stack.pop();
        }
        b = temp;
        temp = "";

        for(i = 0; i<c.length();i++){
            stack.push(c.charAt(i));
        }

        while(!stack.isEmpty()){
            temp = temp + stack.pop();
        }
        c = temp;
        temp = "";

        for(i = 0; i<d.length();i++){
            stack.push(d.charAt(i));
        }

        while(!stack.isEmpty()){
            temp = temp + stack.pop();
        }
        d = temp;

        System.out.println(a + '\n' + b + '\n' + c + '\n' + d);
    }
}