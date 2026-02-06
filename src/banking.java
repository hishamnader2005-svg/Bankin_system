import java.util.Scanner;

public class banking {

    //variables
    private int balance;
    private String name;
    Scanner sc = new Scanner(System.in);


    public banking(){

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
        System.out.println("Welcome to the banking system");
        System.out.println("Options: ");
        System.out.println("1.Show balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }
    public void showbalance(){

        System.out.println("Your balance is : "+ getBalance());
    }
    public int deposit(){
        int balance = getBalance();
        int deposit;
        deposit=sc.nextInt();
        sc.nextLine();
        balance=deposit+balance;
        System.out.println("Your balance now is " + +balance);
        return balance;
    }
}
