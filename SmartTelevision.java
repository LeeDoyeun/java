package human20221017;

public class SmartTelevision implements Smartable{

	int volume;
	int inch;
	String brand;
	int smartModuleCount;// 스마트 모듈 개수

	public SmartTelevision(String brand, int inch, int smartModuleCount) {
       this.brand=brand;
       this.inch=inch;
       this.smartModuleCount=smartModuleCount;
       this.volume=0;
	       
       
    }

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("스마트티비를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("스마트티비를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume < RemoteControl.MIN_VOLUME) {// -10;
			this.volume = RemoteControl.MIN_VOLUME;
		} else if (volume > RemoteControl.MAX_VOLUME) {// 3000
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("스마트TV 볼륨 : " + this.volume);
	}

	@Override
	public void search(String Keyword) {
		// TODO Auto-generated method stub
		System.out.println("스마트티비 " + Keyword + " 키워드로 검색합니다.");

	}

	@Override
	public void connectBluetooth() {
		// TODO Auto-generated method stub
		
	}
}