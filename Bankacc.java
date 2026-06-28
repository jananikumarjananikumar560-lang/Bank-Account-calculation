package miniProject;
import java.util.*;
class BA{
	private int ac;
	private String ahn;
	private double bal;
	public void setac(int ac) {
		this.ac=ac;
	}
	public void setahn(String ahn) {
		this.ahn=ahn;
	}
	public void setbal(double bal) {
		this.bal=bal;
	}
	public int getac() {
		return ac;
	}
	public String getahn() {
		return ahn;
	}
	public double getbal() {
		return bal;
	}
	void deposit(double amt) {
		if(amt>0) {
			bal += amt;
			System.out.println(" Deposit Amount : "+amt);
		}else {
			System.out.println("Invalid Deposit Amount");
		}
		System.out.println(".......................");
	}
	void withdraw(double amt) {
		if(amt<=0) {
			System.out.println("Invalid Withdrawal Amount");
		}else if(amt>bal) {
			System.out.print("Insufficient Balance");
		}else {
			System.out.println("Remaining Bal : "+(bal -= amt));
		}
	}
	void displayAccdet() {
		System.out.println("...................");
		System.out.println("Account Number : "+ac);
		System.out.println("Account Holder Name : "+ahn);
		System.out.println("Current Balance : "+bal);
	}
}
public class Bankacc {

	public static void main(String[] args) {
		BA b = new BA();
		b.setac(4520);
		b.setahn("JANANI");
		b.setbal(15000);
		b.displayAccdet();
		b.deposit(500);
		b.withdraw(1200);
	}

}
