package oopsjava.d4;


 class Bank {
	  String holderName;
	  long accNo;
	  double balance;
	  String bankname;
	  
	  //constructor
	  Bank(String holderName, long accNo, double balance , String bankname){
		  this.holderName=holderName;
		  this.accNo=accNo;
		  this.balance=balance;
		  this.bankname=bankname;
		  
	  }
	  
	  //method to be override
	  void displayDetails() {
		  System.out.println("bank details");
		  System.out.println("holder Name:"+holderName);
		  System.out.println("Account no:"+accNo);
		  System.out.println("Balance:"+balance);
		  System.out.println("bank name:"+bankname);
		  
	  }
	  
	}
	class SBI extends Bank{
		String branch;
		
		SBI(String holderName, long accNo, double balance , String bankname){
			super(holderName,accNo,balance, bankname);
			this.branch=branch;
		}
		
		//override
		@Override
		void displayDetails() {
			System.out.println("bank details");
			  System.out.println("holder Name:"+holderName);
			  System.out.println("Account no:"+accNo);
			  System.out.println("Balance:"+balance);
			  System.out.println("bank name:"+bankname);
			  
			
		}
	}

	public class main{
		public static void main(String args[]) {
			Bank b1= new Bank("rohit", 123676579, 15000.00, "HDFC");
			b1.displayDetails();
			
			SBI s1 =new SBI("Suraj ", 123452346, 20000.00, "SBI");
			s1.displayDetails();
		}
	}

