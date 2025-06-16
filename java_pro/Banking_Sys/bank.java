package java_pro.Banking_Sys;
import java.util.*;
public class bank {
    private String name;
    private int ac_no;
    private double bal;
    bank(String name, int ac_no){
        this.name = name;
        this.ac_no = ac_no;
        this.bal = 0;
    }

    //Encapsulation functions
    private double get_bal(){
        return this.bal;
    }

    private void set_bal(double bal){
        this.bal = bal;
    }

    public void deposit(double dep){
        if (dep<=0){
            System.out.println("Deposite shouldn't be less than Zero");
        }
        else{
            set_bal(get_bal()+dep);
            System.out.println("Your Deposite id Successful");
            System.out.println("Your current balance is ["+this.bal+"]");
        }
    }

    public void withdraw(double draw){
        if (draw>this.bal){
            System.out.println("Insuffient Balance");
        }
        else{
            set_bal(get_bal()-draw);
            System.out.println("Your Withdraw is successful");
        }
    }

    public void bal_check(){
        System.out.println("Your Current Balance: "+get_bal());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank acc = new bank("Rex", 2726);
        System.out.println("1.Deposit\n2.Withdraw\n3.Balance Check\n0.Exit");
        loop: while (true){
            System.out.print("Enter your choise: ");
            int c = sc.nextInt();
            switch (c){
                case 1 : System.out.print("Enter your Deposite: ");
                         acc.deposit(sc.nextDouble());
                         break;
                case 2 : System.out.print("Enter your Withdraw: ");
                         acc.withdraw(sc.nextDouble());
                         break;
                case 3 : acc.bal_check();
                         break;
                case 0 : break  loop;
                default : System.out.println("Invalid Choise");
                
            }
        }
    }
}