import java.util.Scanner;
public class E9 {
    static int balance = 10000;
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Federal Bank ATM");
        
            System.out.println("Select your option ! ");
            System.out.println("1.Withdrawal \n2.Deposit \n3.Balance Enquiry \n4.Exit");
            int option = input.nextInt();
            switch (option) {
            case 1:
                System.out.println("How much money do you want to withdraw ? ");
                int amount = input.nextInt();
                if(amount > balance){
                    System.out.println("Insufficient balance");
                }else{
                    balance = balance - amount;
                    System.out.println("Please collect your cash");
                    System.out.println("Your new balance is " + balance);
                }
                main(args);
                break;
            case 2:
                System.out.println("How much money do you want to deposit ? ");
                int deposit = input.nextInt();
                balance = balance+deposit;
                System.out.println("Your current balance is " + balance);
                main(args);
                break;
            case 3:
                System.out.println("Your current balance is " + balance);
                main(args);
                break;
            case 4:
                System.out.println("Thank you for using our services.");
                break;
            default:
                System.out.println("Invalid option");
                break;
            }
        
    }
    

}
