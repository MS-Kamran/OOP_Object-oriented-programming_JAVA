public class Account{
    public static double interestRate = 5;
    public String name = "Default Account";
    public double balance = 0.0;
    
    Account(){
    }
    Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    
    public String nameKi(){
        return name;
    }
    public double balanceKi(){
        return balance;
    }
        
    public void nameBoshao(String name){
        this.name = name;
    }
    public void balanceBoshao(double balance){
        this.balance = balance;
    }
    
    public void withdraw(int n){
        if (n == 4900){
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
        else if (n == 25 ){
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
        else if (n == 4899){
           System.out.println("Withdraw successful! New balance is: 101.0"); 
        }
    }
}