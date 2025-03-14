import java.util.Scanner;

public class Main
{
    String account_holder_name;
    int account_holder_id;
    int account_Number;
    int account_Id;
    double bankBalance;
    
    Main(String account_holder_name,int account_holder_id,int account_Number,int account_Id,double bankBalance){
        this.account_holder_name = account_holder_name;
        this.account_holder_id = account_holder_id;
        this.account_Number = account_Number;
        this.account_Id = account_Id;
        this.bankBalance = bankBalance;
    }
    
    void display_account_details(){
        System.out.println("account_holder_name: "+account_holder_name);
        System.out.println("account_holder_id: "+account_holder_id);
        System.out.println("account_Number: "+account_Number);
        System.out.println("account_Id: "+account_Id);
        System.out.println("bankBalance: $"+bankBalance);
    }
    
    void credit(int credit){
        if(credit !=0){
          bankBalance = bankBalance + credit;
          System.out.println("after amount credited, updated bank balance: $"+bankBalance);   
        }
    }
    
    void debit(int debit){
        if(bankBalance != 0){
            bankBalance = bankBalance - debit;
            System.out.println("after amount debited, bank balance: $"+bankBalance);
        }
    }
    
	public static void main(String[] args) {
	    //first account holder details
		Main obj1 = new Main("Gopika",1014,22104043,43,5000);
		obj1.display_account_details();
		System.out.println();
		obj1.credit(2000);
		System.out.println();
		obj1.debit(1000);
		System.out.println();
		obj1.display_account_details();
		System.out.println();
		//second account holder details
		Main obj2 = new Main("Suba",1013,22104048,48,2000);
		obj2.display_account_details();
		System.out.println();
		obj2.credit(3000);
		System.out.println();
		obj2.debit(1000);
		System.out.println();
		obj2.display_account_details();
		System.out.println();
		//getting the account number from the user to view the details
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number that need to be viewed:");
		int acc_num = sc.nextInt();
	    if (acc_num == obj1.account_Number) {
            obj1.display_account_details();
        } else if (acc_num == obj2.account_Number) {
            obj2.display_account_details();
        } else {
            System.out.println("Account number not found!");
        }
		sc.close();
	}
}
