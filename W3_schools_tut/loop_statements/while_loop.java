package loop_statements;
/* 
 while (condition) {
  // code block to be executed
}
*/
public class while_loop {
    public static void main(String[] args) {
        
        int clockCycle = 13;
        int time12 = 1;
            while (clockCycle != time12) 
            {

                String str = (time12 < 12) ? " AM" : " PM";

                System.out.println("Time is "+time12+str);
                time12++;
            }
    }
    
}
