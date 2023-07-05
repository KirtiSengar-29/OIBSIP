public class interfaceOfAtm {
    private double balance;
    private int PIN;
    private double Deposit;
    private double withdraw;
    public interfaceOfAtm(double balance , int pin){
        this.balance =balance;
        this.PIN=pin;
    }
    public void setBalance(double pastDeposit){
        this.balance = balance+this.Deposit+pastDeposit;
    }
    public double getBalance(){
        return balance+this.Deposit;
    }
    public void setPIN(int pin){
        // have  to take only 4- digit number as PIN
        String s = Integer.toString(pin);
        if(s.length()==4) {
            this.PIN = pin;
        }
    }
    public int getPIN(){
        return PIN;
    }
    public void setDeposit(double deposit){
        this.Deposit = deposit;
    }
    public double getDeposit(){
        return Deposit;
    }
    public void setWithdraw(double amount){
        this.balance=this.balance-amount;
    }
}
