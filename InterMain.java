package human20221018;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television("삼성", 50);
		Audio ad = new Audio("아이리버","흰색");
		SmartTelevision stv = new SmartTelevision ("노브랜드",65,4);
		GoodTelevision gtv = new GoodTelevision("구글",40,6);
		SmartAudio sad = new SmartAudio("마샬","검은색");
		House myHouse = new House();
		myHouse.addHomeApp(tv);
		myHouse.addHomeApp(ad);
		myHouse.addHomeApp(stv);
		myHouse.addHomeApp(gtv);
		myHouse.addHomeApp(sad);
		
		myHouse.showHomeAppList();
		System.out.println("=================");
		myHouse.showHomeSmartAppList();
		
	}
	public static void turnOffItem(RemoteControl rc) {
		rc.turnOff();
	}
	

}
