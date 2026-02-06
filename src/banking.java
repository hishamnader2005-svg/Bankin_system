import java.util.Scanner;

public class banking {

    //variables
    private int balance;
    private String name;
    Scanner sc = new Scanner(System.in);


    public banking(){
    balance=1000;
        System.out.println("Enter your name :");
    name= sc.nextLine();
    int choice;

    while(true){
        displaymenu();
        choice= sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                showbalance();
                break;
            case 2:
                balance=deposit();
                break;
            case 3:
                balance = withdraw();
                break;
            case 4:
                System.out.println("Exiting goodbye");
                return;
            default:
                System.out.println("Invalid number try again");
        }
    }



    }
    //setters and getters start
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    //end of setters and getters

    public void displaymenu(){
        System.out.println("Welcome to the banking system " + name);
        System.out.println("Options: ");
        System.out.println("1.Show balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void showbalance(){

        System.out.println(name +" balance is : "+ getBalance());
    }
    public int deposit(){

        int deposit;

        System.out.println("How much do you want to deposit");
        deposit=sc.nextInt();
        sc.nextLine();
        balance=deposit+balance;
        System.out.println(name+ " balance now is " + balance);
        return balance;
    }

    public int withdraw(){
        int withdraw;

        System.out.println("How much you want to withdraw : ");

        withdraw=sc.nextInt();
        sc.nextLine();
        if (withdraw>balance){
            System.out.println(name + " dont have enough money");

        }
        else {
            balance = balance - withdraw;
        }
        System.out.println(name +" balance is now : "+ balance);
        return balance;

    }
}
