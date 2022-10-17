package human20221017;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television("삼성", 50);
		tv.turnOn();
		tv.setVolume(8);
		tv.turnOff();
		tv.getInch();
		
		turnOffItem(tv);
		
		RemoteControl rc = new Television("LG", 55);
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		turnOffItem(rc);
		
		Audio ad = new Audio("아이리버","흰색");
		ad.turnOn();
		ad.turnOff();
		ad.setVolume(30);//30시도 -> 10
		System.out.println(ad.toString());
		
		RemoteControl rc2 = new Audio("소니","검은색");
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(-5);
		System.out.println(rc2.toString());
		
		turnOffItem(ad);
		turnOffItem(rc);
		
		SmartTelevision stv = new SmartTelevision ("노브랜드",65,4);
		   stv.turnOn();
		   stv.setVolume(3);
		   stv.turnOff();
		   stv.search("천안역맛집");
		   
		   RemoteControl rcStv =new SmartTelevision ("노브랜드",70,4);
		   rcStv.turnOn();
		   rcStv.setVolume(5);
		   rcStv.turnOff();
		   
		   
		   Searchable saStv= new SmartTelevision ("노브랜드",70,4);
		   saStv.search("천안역맛집");

		   SmartTelevision myStv = new SmartTelevision("노브랜드", 70,4);
		   RemoteControl rcMyStv = myStv;
		   rcMyStv.turnOn();
		   rcMyStv.setVolume(5);
		   rcMyStv.turnOff();
		   Searchable saMyStv = myStv;
		   saMyStv.search("천안역맛집");
		   
		   RemoteControl[ ] rcs = {tv,ad,stv};
		   
		   for(RemoteControl r : rcs) {
			   r.setVolume(RemoteControl.MAX_VOLUME);//최대 볼륨
		   }
		   
		   System.out.println("------------------------");
		   
		   GoodTelevision gtv = new GoodTelevision("구글",40,6);
		   gtv.turnOn();
		   gtv.setVolume(5);
		   gtv.turnOff();
		   gtv.search("겨울패딩");
		   
		   RemoteControl rcGtv = gtv;//인터페이스
		   Searchable saGtv = gtv;//인터페이스
		   Television tvv = gtv;//상속
		   
//		   Searchable[] sas = {tv,ad,stv};
		   
	}
	public static void turnOffItem(RemoteControl rc) {
		rc.turnOff();
	}

}
