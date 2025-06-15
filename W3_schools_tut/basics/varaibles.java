package basics;
public class varaibles {
    public static void main(String[] args) {
        //type variableName = value;
        String str = "Hello World";

        int i = 27;

        double f = 34.90;

        boolean isAdmin = true;

        /* in java we have three stages in the varaible 
         * 1. delcaring a varaiable (if its final is including assigning)
         * 2. then assigning values to that delcared varaible 
         *      and also we can change it when ever we needed (final varaiables are constant we can't change it )
         * 3. call that varaiable wherever we need in
         */
        
         double n = i + f;
        
         System.out.println("\n"+ n +"\n"+ i +"\n"+ f +"\n"+ str +"\n"+ isAdmin);

    }
    
}
