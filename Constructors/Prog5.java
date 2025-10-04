import java.util.Scanner;
public class Prog5 {
    String DepositorName;
    long AccountNumber;
    String AccountType;
    double Balance;

    Prog5(){
        DepositorName = " ";
        AccountNumber = 0;
        AccountType = " ";
        Balance = 0.0;
    }

    Prog5(String name, long accNum, String accType, double bal){
        this.DepositorName = name;
        this.AccountNumber = accNum;
        this.AccountType = accType;
        this.Balance = bal;
    }

    void deposit(double amount){
        Balance += amount;
        System.out.println("Amount Deposited: "+ amount);
        System.out.println("New Balance: "+ Balance);
    }

    void withdraw(double amount){
        if(amount <= Balance){
            System.out.println("Amount withdrawn: " + amount);
            Balance -= amount;
            System.out.println("New Balance: " + Balance);
        }
    }

    void display(){
        System.out.println("Depositor Name: " + DepositorName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Type: " + AccountType);
        System.out.println("Balance: " + Balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter Depositor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        long accNum = scanner.nextLong();
        System.out.print("Enter Account Type: ");
        String accType = scanner.next();
        System.out.print("Enter Initial Balance: ");
        double bal = scanner.nextDouble();
        Prog5 input = new Prog5(name, accNum, accType, bal);

        while(true){
        System.out.println("Enter choice: 1. Deposit 2. Withdraw 3. Display");
        int choice = scanner.nextInt();

        
        switch(choice){
            case 1:
                System.out.println("Enter amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                input.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                input.withdraw(withdrawAmount);
                break;
            case 3:
                input.display();
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Do you want to continue? (yes/no)");
        String cont = scanner.next();

        if(!cont.equalsIgnoreCase("yes")){
            break;
        }
    }

        scanner.close();

    }
}
