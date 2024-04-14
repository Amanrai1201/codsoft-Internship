import java.util.*;
public class Task2 {
    public static void main(String[] args) {
      atminterface obj = new atminterface();  
    }
}

class account{
    static float balance;
    int pin = 4546;
}

class  atminterface extends account{ 
    Scanner sc = new Scanner(System.in);
        atminterface(){
        System.out.println("Welcome to Our ATM");
        check_pin();
    }

    // check pin

    public void check_pin(){
        System.out.println("Enter your pin");
        int Entered_pin = sc.nextInt();

        if (Entered_pin == pin) {
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            check_pin();
        }
    }
    void withdraw_money(){
        System.out.println("Enter the amount to withdraw");
        float  with_amount = sc.nextFloat();
        if((with_amount%100) != 0){
            System.out.println("invalid amount. please enter the amount in multiple of 100");
        }
        if (with_amount> balance) {
            System.out.println("insufficient balance");
        }
        else{
            balance = balance - with_amount;
            System.out.println("process executes successfully");
        }
    }
    void deposit_money(){
        System.out.println("Enter the amount to deposit in multiple of 100.");
        float depo_amount = sc.nextFloat();

        if((depo_amount%100) != 0){
            System.out.println("invalid amount. please enter the amount in multiple of 100");
        }
        else{
            balance = balance + depo_amount;
            System.out.println("Money deposited successfully.");
        }
    }
     void check_balance(){
        System.out.println("Balance availabel " + balance);
    }
    void change_pin(){
        System.out.println("Enter new pin of 4 digits");
        int new_pin = sc.nextInt();
        pin = new_pin;
        System.out.println("Pin changed successfully. New pin is :" + new_pin);
    }

    void menu(){
        System.out.println("Enter your choice :");
        System.out.println("1 : check balance");
        System.out.println("2 : withdraw money");
        System.out.println("3 : deposit money");
        System.out.println("4 : change pin");
        System.out.println("5  : Exit");

        int choice = sc.nextInt();

        if (choice == 1) {
                check_balance();
                menu();
        }
        if (choice == 2) {
            withdraw_money();
            menu();
        }
        if (choice == 3) {
            deposit_money();
            menu();
        }
        if (choice == 4) {
            change_pin();
            menu();
        }
        if (choice == 5) {
            return;
        }
    }
}