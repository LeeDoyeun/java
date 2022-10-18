package human20221018;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account account = new Account();
		System.out.println("예금주 성함을 입력하십시오.");
		String temp1 = scan.nextLine();
		account.setOwner(temp1);
		System.out.println("통장의 잔액을 입력하십시오.");
		long temp2 = scan.nextLong();
		account.setBalance(temp2);
		System.out.println("1번 저축 2번 인출");
		temp2 = scan.nextLong();
		if(temp2 == 1) {
		System.out.println("입금할 금액을 입력하십시오.");
		temp2 = scan.nextLong();
		account.deposit(temp2);
		System.out.println("통장의 잔액은 "+account.getBalance()+"원입니다.");
		} else if(temp2 == 2) {
		System.out.println("인출할 금액을 입력하십시오.");
		temp2 = scan.nextLong();
		account.withdraw(temp2);
		System.out.println("통장의 잔액은 "+account.getBalance()+"원입니다.");
		}
	}
}
class Account{
	private String owner;
	private long balance;
	Account(){
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {
		balance += amount;
		return balance;
	}
	public long withdraw(long amount) {
		if(amount<=balance) {
		balance -= amount;
		} else {
			System.out.println("인출 상한 금액을 초과했으므로 불가합니다.");
			System.out.println("잔액 범위 내에서 인출 가능합니다.");
		}
		return balance;
	}
}
