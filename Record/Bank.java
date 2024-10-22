public class Account {
    int accountNumber, balance;
    Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    void deposit(int depAmount){
        balance += depAmount;
    }
    void withdraw(int withdrawAmount){
        balance -= withdrawAmount;
    }

    public static void main(String[] args) {
        System.out.println("Akshat Basra 1BM23CS020");
        Account[] accounts = new Account[15];
        for (int i = 0; i < 15; i++) {
            accounts[i] = new Account(i+1);
            accounts[i].deposit(i*500);
            accounts[i].withdraw(i);
            System.out.print(accounts[i].accountNumber+" : ");
            System.out.println(accounts[i].balance);
        }
    }
}
