package human20221017;

public class Audio implements RemoteControl {
	int volume;
	String brand;
	String color;
	
	public Audio(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.volume = 0;
	}
	
	public String toString() {
		return String.format("%s 브랜드 %s 오디오 현재 볼륨 : %d", brand,color,volume);
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("오디오 볼륨 : "+this.volume);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVolume() {
		return volume;
	}
	
}
