import java.util.Scanner;
import java.lang.Math;

class Bank{
	int accountNo;
	double balance;
	Bank(int accountNo){
		this.accountNo = accountNo;
		this.balance = 0;
	}
	void deposit(double depAmount){
		this.balance += depAmount;
	}
	void withdraw(double withAmount){
		this.balance -= withAmount;
	}
}


class SavingsAccount extends Bank{
	double interest;
	SavingsAccount(int accountNo){
		super(accountNo);
	}
/*	void deposit(double depAmount){
		super.balance += depAmount;
	}
	void withdraw(double withAmount){
		super.balance -= withAmount;
	}*/
	double interest(double rate, int time){
		interest = balance * Math.pow((1 + rate / 100), time);
		balance += interest;
		return interest;
	}
}

class CurrentAccount extends Bank{
	static double withdrawLimit = 1000;
	CurrentAccount(int accountNo){
		super(accountNo);
	}
/*	void deposit(double depAmount){
		super.balance += depAmount;
	}*/
	public void withdraw(double withAmount){
		super.balance -= withAmount;
		if(balance < withdrawLimit){
			System.out.println("Withdraw Limit Reached - Deducting Service Charge");
			balance -= 100;
		}
	double interest(){
		System.out.println("Interest is not applicable in current account");
		return 0.0;
	}
}


class Run{
	public static void main(String[] args){
		System.out.println("Akshat Basra 1BM23CS020");
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Open Savings Account\n2. Open Current Account\n\nEnter Choice:");
		int choice = sc.nextInt()
		if(choice == 1)
			SavingsAccount acc = new SavingsAccount(101);
		else
			CurrentAccount acc = new CurrentAccount(201);
		System.out.println("1. Deposit\n2. Withdraw\n3. Show Balance\n4. Compute Interest\n5. Exit\n");
		while(1){
			choice = sc.nextInt();
			switch(choice){
				case 1: System.out.print("Enter deposit amount: ");
					amount = nextDouble();
					acc.deposit(amount);
					break;
				case 2: System.out.print("Enter withdraw amount: ");
					amount = nextDouble();
					acc.withdraw(amount);
					break;
				case 3: System.out.println("The balance is " + acc.balance);
					break;
				case 4: System.out.println("The interest is " + acc.interest());
					break;
				default:exit(0);
			}
		}
	}
}













