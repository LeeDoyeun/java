package human202221019;

import java.util.ArrayList;

public class prac06 {
	public static void main(String[] args) {
		//		app //변수
		//		app() //메소드
		//		App   //클래스 or 인터페이스
		SmartPhone myPhone = new SmartPhone("010-1234-5678", "갤럭시Z플립", "검은색", "정용진", "5G");
		myPhone.call("010-1111-2222");
		myPhone.search("주차장");

		ChattingApp app1 = new ChattingApp("카카오톡");
		ChattingApp app2 = new ChattingApp("라인");
		ChattingApp app3 = new ChattingApp("텔레그램");

		myPhone.appList.add(app1);  //앱 3개 설치
		myPhone.appList.add(app2);
		myPhone.appList.add(app3);

		Phone oldPhone = new Phone("010-1234-5678", "갤럭시Z플립", "검은색", "정용진");

		Callable ca = oldPhone;
		ca.call("119");
		
		//message2 외부에서 이미 어떤 앱을 통해서 메시지를 보낼지 결정이 되었을때
		
		myPhone.message("라인", "이건 안터진대");
		//찾는과정
		//app2 //라인
		myPhone.message2(app2, "빨리 퇴근해");
		myPhone.message2(app1, "빨리 퇴근해");
		myPhone.message2(app3, "빨리 퇴근해");



	}
}

interface Callable{ //전화 통화
	public String[] START_NUM = {"010", "011", "016", "018", "019"};
	public void call(String toPhoneNumber); //전화를 건다.
}

class Phone implements Callable{ //전화기
	String phoneNumber; //전화번호
	String model; //기종
	String color; //색상
	String owner; //소유자명
	public Phone(String pn, String model, String color, String owner) {
		this.phoneNumber = pn;
		this.model = model;
		this.color = color;
		this.owner = owner;
	}

	@Override
	public void call(String toPhoneNumber) {
		// TODO Auto-generated method stub
		System.out.println(toPhoneNumber + "전화 합니다.");
	}
}

interface Searchable{ //검색 인터페이스
	void search(String keyword); //검색한다.
}

class SmartPhone extends Phone implements Searchable{
	String callingPlan; //요금제 5G, LTE
	//스마트폰은 앱s을 가지고있을 수 있다.
	ArrayList<App> appList;

	public SmartPhone(String pn, String model, String color, String owner, String callingPlan) {
		super(pn, model, color, owner);
		this.callingPlan = callingPlan;
		appList = new ArrayList<App>();
	}

	//1번안 자체적으로 찾아서 전송
	public void message(String appName, String text) {
		//id   : 고유하게 식별하기위해.
		//appname : 바뀌거나 중복될수 있다.

		for(App app : appList) {
			if(app instanceof ChattingApp) {
				ChattingApp ca = (ChattingApp)app;
				if(ca.appName.equals(appName)) { //내가 실행해서 찾으려는 앱
					ca.sendMsg(text);
				}
			}
		}
		//		SendMessage sm = ;
		//		sm.sendMsg(text);
		//사람 주민번호 : 고유
		//사람 이름 : 동명이인
	}

	//2번안 전달 받아서 전송
	public void message2(SendMessage sm, String text) {
		sm.sendMsg(text);
	}

	//가지고 있는 채팅앱이 3개. message -> 실제 메시지전송 -> SendMessage 인터페이스를 구현한 sendMsg() 메소드를 가진 객체


	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		System.out.println(keyword + " 단어로 검색합니다.");
	}
}

abstract class App{ //앱 //자체 생성은 불가
	String appKind; //종류
	int appSize; //용량
}

class ChattingApp extends App implements SendMessage{
	String appId; //앱 아이디
	String appName; //앱 이름
	String appCompany; //앱 제조사

	public ChattingApp(String appName) {
		this.appName = appName;
	}

	@Override
	public void sendMsg(String text) {
		// TODO Auto-generated method stub
		System.out.println(text + " 메시지를 보냅니다.");
	}
}

interface SendMessage{ //메시지보내는기능 인터페이스
	public void sendMsg(String text); //메시지 보내기
}
