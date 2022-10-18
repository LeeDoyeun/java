package human20221018;

public class SmartAudio extends Audio implements GiniConnectable {
	public SmartAudio(String brand,String color) {
		super(brand, color);
	}
	public String toString() {
		return String.format("%s 브랜드 %s 오디오 현재 볼륨 : %d", brand,color,volume);
	}

	@Override
	public void connectGini() {
		// TODO Auto-generated method stub
		System.out.println("스마트오디오 지니 연결합니다.");
		
	}
}
