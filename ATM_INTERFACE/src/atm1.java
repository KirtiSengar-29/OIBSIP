import java.util.Scanner;

public class atm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String cancel = sc.nextLine();
         boolean cancel = true;
            System.out.println(" enter your card ");
            System.out.println("please  do not remove your card your \n transaction is being processed");
            System.out.println("please enter your PIN for further process");
            interfaceOfAtm atm = new interfaceOfAtm(0, 0000);
            int pin = sc.nextInt();
            atm.setPIN(pin);
            //default deposit amount
            atm.setBalance(8000.0);
            int intput = 0;
        while(cancel==true) {
            if (atm.getPIN() == pin) {
                System.out.println("enter the number");
                System.out.println("1. Check Balance ");
                System.out.println("2. Withdraw Cash ");
                System.out.println("3. Deposit Cash  ");
                System.out.println("4. exit  ");
                intput = sc.nextInt();
            }
            if (intput > 0 && intput < 4) {
                if (intput == 1) {
                    System.out.println(atm.getBalance());
                } else if (intput == 2) {
                    // for withdrawing the cash
                    System.out.println("enter the amount you want to withdrawal");
                    double amount = sc.nextDouble();
                    if (amount <= atm.getBalance()) {
                        atm.setWithdraw(amount);
                    } else {
                        System.out.println("your enter amount exceeded the  available balance");
                    }
                } else if (intput == 3) {
                    // for Deposition of cash
                    System.out.println("enter the amount you  want Deposit");
                    double deposit = sc.nextDouble();
                    atm.setDeposit(deposit);
                }
            } else if (intput == 4) {
                System.out.println("thanks for the process");
                cancel=false;
                break;
            } else {
                System.out.println("invalid enter");
            }
            System.out.println("enter 5 to cancel to stop your transaction");
            System.out.println("or press any button for further transaction ");
            int n = sc.nextInt();
            if(n==5) {
                cancel = false;
                break;
            }
        }
    }
}
