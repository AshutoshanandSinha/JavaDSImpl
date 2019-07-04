public class Bank_Account {

    private int accountNumber;
    private String customerName;
    private  double balance ;
    private String email;
    private String phoneNumber;


    private int getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String getCustomerName() {
        return customerName;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    private void Deposit(double amount){

          double bal = getBalance() + amount;
          setBalance(bal);
        System.out.println( amount +" Amount Deposited to Your Account "+ getAccountNumber()+ " Successfully.");
        System.out.println("Updated Balance in Your Account "+ getAccountNumber() + " is : " + getBalance());
        System.out.println("====================================================================");
    }


    private void Withdrawal (double amount){

        if (amount > getBalance()) {
            System.out.println("Insufficient Balance in your account!!!");
            System.out.println("Amount available in your account " + getAccountNumber() + " right now is : "+ getBalance());
            System.out.println("====================================================================");
        }

        else {
            double bal = getBalance() - amount ;
            setBalance(bal);
            System.out.println(amount + " Deducted from your account " + getAccountNumber() + " and updated balance in your account is "+ getBalance());
        }

    }

    public static void main (String[] args){

        Bank_Account B1 = new Bank_Account();

        B1.setCustomerName("Ashutosh");
        B1.setAccountNumber(242321);
        B1.setPhoneNumber("9408545877");
        B1.setEmail("ashutosh@abc.com");

       B1.Deposit(1000);
       B1.Withdrawal(1001);

       B1.balance = 5000;

        System.out.println(B1.balance);

    }
}
