package human202221019;

public class prac03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1 = new Account("정용진", 100000);
		//잔금 얼만지
		ac1.printAccountInfo();
		//저축 3만원
		TradeInfo tf1 = ac1.deposit(30000);
		TradeInfo.printTradeInfo(tf1);
//		System.out.println("입금액 : " + depositResult);
		
		System.out.println(ac1.toString());
		TradeInfo tf2 = ac1.withdraw(50000);  //성공케이스
		if(tf2.resultCode == TradeInfo.SUCCESS) {
			System.out.println("출금성공");
		}
		TradeInfo.printTradeInfo(tf2);
		
		TradeInfo tf3 = ac1.withdraw(250000); //실패 케이스
		if(tf3.resultCode == TradeInfo.FAIL) {
			System.out.println("출금실패");
		}
		TradeInfo.printTradeInfo(tf3);
		
		
//		System.out.println("출금액 : " + withdrawResult);
		
		ac1.printAccountInfo();
//		System.out.println("출금액 : " + ac1.withdraw(250000));
//		ac1.printAccountInfo();
		
//		Account ac2 = new Account("휴먼", 30000);
//		ac2.printAccountInfo();
//		
//		Account.printAccountInfo(ac1);
//		Account.printAccountInfo(ac2);
		
		
		//틈새설명
//		ac1.deposit(30000); //Return 있는 메소드 -> 리턴 활용O, 활용X
//		System.out.println(ac1.getOwner()); //println(괄호사이에있는값출력) , getOwner Return O / Return X 문제
		//잔금 얼만지
		//잔금 얼만지
	}
}

class TradeInfo{
	public static final int SUCCESS = 1;  //성공
	public static final int FAIL = -99;   //실패
	public static final int FAIL_ACCOUNTINFO_NULL = -101;  //계좌정보오류
	public static final int FAIL_BALANCE_NOT_ENOUGH = -102; //잔액 불충분
		
	int resultCode; //결과 코드   1:성공  -1:실패  -3:입금실패  -5:출금실패
	long balance;
	long depositAmount;
	long withdrawAmount;
	
	public static void printTradeInfo(TradeInfo ti) {
		System.out.println("잔액:"+ti.balance + " 입금액:" + ti.depositAmount + " 출금액:" +ti.withdrawAmount);
	}
}


class Account { //계좌
	//필드
	private String owner; //계좌 소유주
	private long balance; //계좌 잔고
	
	//생성자
	public Account() {
		this.owner = null;
		this.balance = 0;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(String owner) {
		this.owner = owner;
		this.balance = 0;
	}
	
	public Account(long balance) {
		this.owner = null;
		this.balance = balance;
	}
	
	
	//메소드
	//기능들...
	public TradeInfo deposit(long amount) { //인자금액을 저축
		//저축
		this.balance += amount; //들어온 amount금액 저축
		
		TradeInfo result = new TradeInfo();
		result.balance = this.balance;
		result.withdrawAmount = 0;
		result.depositAmount = amount;
		result.resultCode = TradeInfo.SUCCESS;
		
		//리턴 -> 입금액:10만 잔액:110만 
		//1. 입금액
		return result;
		//2. 잔액
//		return balance;
	}
	
	public TradeInfo withdraw(long amount) { //인자금액을 인출
		//인출
		//얼마를 뽑겠다 amount
		//인출과정에서 잔액보다 높은 금액을 인출하려는 경우는 막기.
		//
		TradeInfo result = new TradeInfo();
		
		if(balance < amount) {  //if(balance - amount < 0)
			//잘못된 경우
			System.out.println("잔액보다 큰 금액은 인출할 수 없습니다.");
			result.balance = this.balance;
			result.withdrawAmount = 0;
			result.depositAmount = 0;
			result.resultCode = TradeInfo.FAIL;
			return result;
		} 
		
		this.balance -= amount; //90만=100만-10만
		
		result.balance = this.balance;
		result.withdrawAmount = amount;
		result.depositAmount = 0;
		result.resultCode = TradeInfo.SUCCESS;

		//		long result  = balance; //100만
		//		return result;  //100만
		//System.out.println("출금액:" + amount); //출금을 할때마다 기본적으로 출금액이 얼마인지 보여준다.
		//리턴
		//1. 출금액
		return result;
		//2. 잔액
//		return balance;
	}
	
	public static void printAccountInfo(Account ac) {
		System.out.println("소유주:"+ac.getOwner() + " 잔액:" +ac.getBalance());
	}
	
	
	public void printAccountInfo() {
		System.out.println("소유주:"+owner + " 잔액:" + balance);
	}
	public String toString() {
		return "소유주:"+owner + " 잔액:" + balance;
	}
	
	//getter setter
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setBalance(long bal) {
		this.balance = bal;
	}
	
	public long getBalance() {
		return this.balance;
	}
}
