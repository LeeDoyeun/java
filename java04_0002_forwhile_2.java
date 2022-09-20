package human20220920;

public class java04_0002_forwhile_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		keyPressExample();

	}

	// throws Exception 코드 중에 키보드 또는 마우스 입력값을
	// 받아서 실행하는 코드일 경우 JVM밖에서 일어나는 에러를
	// (상정)처리하기 위한선언
	public static void keyPressExample() throws Exception {
		int speed = 0;
		int keyCode = 0;

		while (true) {
			// keycode가 13이 아니고 (!=) >> true : 13이 아니면 사실이다
			// keycode가 10이 아니면 (!=) >> true : 10이 아니면 사실이다
			// 두 개 다 true(사실)일 때만 {}코드 영역 실행
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------");
				System.out.println("1. 증속 |2. 감속 | 3. 중지");
			}
			// System.in.read(); 메서드를 사용하여 사용자가 입력한 키보드 값 받기
			// 단, enter키를 눌렀으므로 13 10이라는 코드를 같이 받음
			// while문을 입력받은 값 1번, 13코드 1번, 10 코드 1번 총 3번의
			// while문을 실행한다
			// (System.in.read();에서 전달받은 코드가
			// 모두 다 전달되어 비워질 때까지!)
			keyCode = System.in.read();
			//keycode의 값이 49일 경우 {}코드 영역 실행
	         if(keyCode == 49) {
	            speed++;
	            System.out.println("현재 속도는 "+speed);
	         }else if(keyCode == 50) {
	            speed--;
	            System.out.println("현재 속도는 "+speed);
	         }else if(keyCode == 51) {
	            //메모리에 있는 run이라는 변수를 가져와서
	            //flase값을 =(대입연산자)로 할당(저장)
	            break;
	         }
		}
		System.out.println("프로그램 종료");
	}
}