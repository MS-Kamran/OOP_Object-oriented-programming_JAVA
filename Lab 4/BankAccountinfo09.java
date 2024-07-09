public class BankAccountinfo09{
    public static void main (String []args){
        BankAccount a1 = new BankAccount ("Jhon","Banasree","01",4000);
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getAccountID());
        System.out.println(a1.getAddress());
        System.out.println(a1.getBalance());
        System.out.println(a1.addInterest());
        
        System.out.println("\n");
        
        BankAccount a2 = new BankAccount ("Mike","Banani","02",8000);
        System.out.println(a2);
        System.out.println(a2.getName());
        System.out.println(a2.getAccountID());
        System.out.println(a2.getAddress());
        System.out.println(a2.getBalance());
        System.out.println(a2.addInterest());
        
        System.out.println("\n");
        
        BankAccount a3 = new BankAccount ("Crol","Gulshan","03",9000);
        System.out.println(a3);
        System.out.println(a3.getName());
        System.out.println(a3.getAccountID());
        System.out.println(a3.getAddress());
        System.out.println(a3.getBalance());
        System.out.println(a3.addInterest());
    }
}