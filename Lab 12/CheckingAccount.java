public class CheckingAccount extends Account{
    
    public double de;
    public double wi;
    public String name;
    public int taka;
    
    public CheckingAccount(String name, int taka){
        super(name);
        this.taka = taka;
    }
    
    public String deposit(double de){
        String s;
        if(de <= 0){
            s = "Please enter amount greater than Zero";
        }
        else {
            s = "Deposit Successful";
        }
        return s;
    }
    public String withdraw(double wi){
        String s;
        if(wi > taka){
            s = "You do not have enough funds";
        }
        else if(wi==0){
            s = "Please enter amount greater than Zero";
        }
        else {
            s = "Withdraw Successful";
        }
        return s;
    }
    
    public void printAccountInfo(){
        System.out.println("=======================================");
        System.out.println("Name :"+getName());
        System.out.println("Account Number :"+getAccountNumber());
        System.out.println("Balance :"+taka);
        if (taka<500){
            System.out.println("Your balance is less than the minimum amount");
        }
        System.out.println("=======================================");
    }   
}