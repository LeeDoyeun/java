package human20220923;

public class java05_arr {

	public static void main(String[] args) {
		// 숫자 1부터 100까지 저장하는 고정배열을 만드시오
		//int[] int타입으로 []배열 선언, 변수이름은 intList
		//=(대입연산자) 우측에 int[100] int타입으로 100개를 넣을 수 있는
		//도구를 새로(new) 만들어서 intList 변수에 할당(저장)
//		int[] intList = new int[200];
//		//for() 반복문
//		//int i = 0;
//		//조건절 : i의 값은 intList.length(길이를 측정하는 도구)
//		//길이보다 작을 때까지 for문을 돌리겠다
//		//i++ : 증감식(후위연산자)
////		for(int i = 0; i<intList.length; i++) {
////			//intList[i] : 배열의 i번째를 가져와서
////			//=(대입연산자)를 통해 i+1의 값을 저장
////			intList[i]=i+1;
////		}
//		for(int i = 0; i<intList.length; i++) {
//			//intList[i] : 배열의 i번째의 값을 출력한다
//			intList[i]=i+1;
//			System.out.println(intList[i]);
//		}
		
		int[] lottoNumList = new int[6];
		
		for(int i = 0; i<lottoNumList.length; i++) {
			lottoNumList[i] = (int)(Math.random()*45) + 1;
		    for(int k = 0; k < i; k++) {
		    	if(lottoNumList[i] == lottoNumList[k]) {
		    		System.out.println("같은 숫자를 뽑았습니다");
		    		i--;
		    		break;
		    	}
		    }
		}
		for(int i = 0; i<lottoNumList.length;i++) {
			System.out.println(lottoNumList[i]);
		
		}
	}


//	private static boolean lottoNumCheck(int A, int B) {
//		boolean result = false;
//		int[] lottoNumList = new int[6];	
//	    int x = (int)(Math.random()*lottoNumList.length);
//		int y = (int)(Math.random()*lottoNumList.length);
//		A = lottoNumList[x];
//		B = lottoNumList[y];	
//		if(x != y && A==B) {
//			result = true;
//		};
//		return result;				
//	}

}
