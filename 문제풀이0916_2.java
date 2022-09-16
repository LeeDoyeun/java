package human20220916;

public class 문제풀이0916_2 {
	public static void main(String[] args) {
		// 매개변수 n을 받아서 i로 나눈 나머지가 1인
		// 가장 큰 자연수 i를 리턴하도록 구현하시오
		// (단, 컴퓨터 입장에서 최소한의 연산으로 구현해 보세요)
		int result = examRemainderOneCustom(50);
		System.out.println(result);
	}

	public static int examRemainderOneCustom(int num) {
		int result = 0;
		for(int i = num-1; i<num; i--) {
			if(num%i==1) {
				result =i;
				break;
			}
		}
		System.out.println(num + "을 나누는 가장 큰 수는 " + result);
		return result;

	}
}
