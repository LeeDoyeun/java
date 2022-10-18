package human20221018;

public interface RemoteControl {
	//변수선언 -> 상수
	int MAX_VOLUME = 10; //최대볼륨
	int MIN_VOLUME = 0; //최소볼륨
	
	//메서드 선언 -> 추상 메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);//볼륨조절
	
}
