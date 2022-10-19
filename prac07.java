package human202221019;

import java.util.ArrayList;

public class prac07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop hitShop = new Shop("ms17", "종합사", "웰컴마트");
		hitShop.menuList.add(new Menu("모자", 5000));
		hitShop.menuList.add(new Menu("군화", 30000));
		hitShop.menuList.add(new Menu("M16", 350000));
		
		hitShop.pay();
		
	}
}

class Shop { //상점
	String id;   //상점 id
	String kind; //상점 종류
	String name; //상점 이름
	ArrayList<Menu> menuList; //보유한 판매 메뉴리스트
	
	//결제기기 A사 B사 -> 카드결제, 현금결제
	PayHelp payMachine;
	
	
	public Shop(String id, String kind, String name) {
		this.id = id;
		this.kind = kind;
		this.name = name;
		menuList = new ArrayList<Menu>();
		payMachine = new PayHelpB(); 
	}
	
	//prcess
	//for(;;)  
	//메뉴들의 가격이 얼만지 totalAmount
	//pay(totalAmount);
	
	public void pay() { //메소드는 최소의 기능
		//가격을 부분 -> 메뉴리스트에서 고객이 선택한(담아놓은) 상품들의 가격을 총합
		//결제수단
		payMachine.payCard(1000);
		
		payMachine.payCash(2000);
		
		payMachine.payMobile(3000, PayHelp.MOBILE_NAVER);
		
	}
}

class Menu{
	String name;  //이름
	int price;	  //가격
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

interface PayHelp{
	public int MOBILE_KAKAO = 10;
	public int MOBILE_NAVER = 20;
	public int MOBILE_ZERO = 30;
	public int MOBILE_TOSS = 40;
	
	public boolean payCard(int amount);
	public boolean payCash(int amount);
	
	//2번안
	public boolean payMobile(int amount, int option); //상점 
//	//1번안
//	public boolean payMobileKakao(int amount);
//	public boolean payMobileNaver(int amount);
//	public boolean payMobileZero(int amount);
//	public boolean payMobileToss(int amount);  //모바일로 결제해라. payMobileToss
	
	
}

//A사
class PayHelpA implements PayHelp{

	CardModule cardModule = new CardModule();
	CashModule cashModule = new CashModule();
	KakaoPayModule kpModule = new KakaoPayModule();
	NaverPayModule npModule = new NaverPayModule();
	ZeroPayModule zpModule = new ZeroPayModule();
	
	@Override
	public boolean payCard(int amount) {
		// TODO Auto-generated method stub
		boolean result = cardModule.pay(amount);
		//결제머신A사 카드모듈 
		//result 추가 체크
		return result;
	}

	@Override
	public boolean payCash(int amount) {
		// TODO Auto-generated method stub
		boolean result = cashModule.pay(amount);
		return result;
	}

	@Override
	public boolean payMobile(int amount, int option) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(option == PayHelp.MOBILE_KAKAO) {
			result = kpModule.pay(amount);
		} else if(option == PayHelp.MOBILE_NAVER) {
			result = npModule.pay(amount);
		} else if(option == PayHelp.MOBILE_ZERO) {
			result = zpModule.pay(amount);
		}
		return result;
	}
	
}

//B사
class PayHelpB implements PayHelp{

	CardModule cardModule = new CardModule();
	CashModule cashModule = new CashModule();
	KakaoPayModule kpModule = new KakaoPayModule();
	
	@Override
	public boolean payCard(int amount) {
		// TODO Auto-generated method stub
		boolean result = cardModule.pay(amount);
		//결제머신A사 카드모듈 
		//result 추가 체크
		return result;
	}

	@Override
	public boolean payCash(int amount) {
		// TODO Auto-generated method stub
		boolean result = cashModule.pay(amount);
		return result;
	}

	@Override
	public boolean payMobile(int amount, int option) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(option == PayHelp.MOBILE_KAKAO) {
			result = kpModule.pay(amount);
		} else if(option == PayHelp.MOBILE_NAVER) {
			//우리는 네이버 페이를 지원하지 않습니다.
			System.out.println("우리는 네이버 페이를 지원하지 않습니다.");
			result = false;
		} else if(option == PayHelp.MOBILE_ZERO) {
			//우리는 제로 페이를 지원하지 않습니다.
			System.out.println("우리는 제로 페이를 지원하지 않습니다.");
			result = false;
		}
		return result;
	}
}


//------------페이모듈 들......----------------
interface PayModule{
	public boolean pay(int amount); //결제
	public boolean refund(int amount); //환불
}

class CardModule implements PayModule{
	//카드결제 모듈
	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("카드로 " + amount + "원 결제.");
		
//		return false; //결제 실패
		return true; //결제 성공
	}

	@Override
	public boolean refund(int amount) {
		// TODO Auto-generated method stub
		System.out.println("카드로 " + amount + "원 환불.");
		return true;
	}
}

class CashModule implements PayModule{
	//현금결제 모듈
	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("현금 " + amount + "원 결제.");
		
//		return false; //결제 실패
		return true; //결제 성공
	}

	@Override
	public boolean refund(int amount) {
		// TODO Auto-generated method stub
		System.out.println("현금 " + amount + "원 환불.");
		return true;
	}
}

class KakaoPayModule implements PayModule{

	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("카카오페이로 " + amount + "원 결제.");
		
		return true; //결제 성공
	}

	@Override
	public boolean refund(int amount) {
		// TODO Auto-generated method stub
		System.out.println("카카오페이로 " + amount + "원 환불.");
		return true;
	}
	
}

class NaverPayModule implements PayModule{
	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("네이버페이로 " + amount + "원 결제.");
		
		return true; //결제 성공
	}

	@Override
	public boolean refund(int amount) {
		// TODO Auto-generated method stub
		System.out.println("네이버페이로 " + amount + "원 환불.");
		return true;
	}
}

class ZeroPayModule implements PayModule{
	@Override
	public boolean pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("제로페이로 " + amount + "원 결제.");
		
		return true; //결제 성공
	}

	@Override
	public boolean refund(int amount) {
		// TODO Auto-generated method stub
		System.out.println("제로페이로 " + amount + "원 환불.");
		return true;
	}
}
