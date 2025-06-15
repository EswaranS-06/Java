package selection_statements;

public class else_if {

        public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // if block will execute only if the condition is ture 
        // condition is false means it just skip that block

        if ((a>b)&&(a>c)) {
            System.out.println(a);
        }

        else if ((a<b)&&(c<b)) {
            System.out.println(b);
        }

        else {
            System.out.println(c);
        }
    }
    
}
