public class BankAccount{
    private String name;
    private String address; 
    private String accountID;
    private double balance;
    
    BankAccount(){
    }
    
    BankAccount(String name, String address, String accountID, double balance){
        this.name = name;
        this.address = address;
        this.accountID = accountID;
        this.balance = balance;
    }
    
    public void setName(String n){
        this.name = name;
    }
    public void setAddress(String a){
        this.address = address;
    }
    public void setAccountID(String i){
        this.accountID = accountID;
    }
    public void setBalance(double c){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }
    public String getAccountID(){
        return accountID;
    }   
    public String getAddress(){
        return address;
    }    
    public double getBalance(){
        return balance;
    }
    
    public double addInterest(){
        double ban = (this.balance*7/100)+this.balance;
        return ban;
    }
}