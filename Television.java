package human20221017;

public class Television implements RemoteControl{
	//클래스 필드 변수
	int volume;//볼륨
	int inch;
	String brand;
	
	Television(String brand, int inch){
		volume = 0;
		this.brand = brand;
		this.inch = inch;
	}
	
	void powerOn() {
		System.out.println("TV 전원을 켭니다.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다.");
		
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TV 볼륨조절 +,-
		//클래스(필드, 생성자, 메서드(getter/setter + a))
		//setter, getter
		//1. 외부에 공개되지 않은 변수에 대한 접근 제공
		//private volume <ㅡ> public setVolume
		//2. 값을 조절 (사전에 필터링)
		// setter : 외부에서 잘못된 값이 들어올까봐..
		// getter : return할 양식을 변경
		//이름을 짓는 양식
		//void + set+변수명
		//변수값 + get+변수명
		
		//내 TV는 볼륨이 0~30
		if(volume < RemoteControl.MIN_VOLUME) {//-10;
			this.volume = RemoteControl.MIN_VOLUME;
		} else if(volume > RemoteControl.MAX_VOLUME) {//3000
			this.volume = RemoteControl.MAX_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV 볼륨 : " + this.volume);
		
		//30으로 세팅
		
		//TV리모콘 볼륨 0~30
		//BTV 셋톱박스 리모콘 볼륨 0~50
		//다른 TV 0~100
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getVolume() {
		return volume;
	}
}
