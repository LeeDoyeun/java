package human20220921;

public class java04_0006_randomExample {

	public static void main(String[] args) {
		//랜덤 숫자 1~10까지 중에 3개의 숫자를 뽑습니다.
		//그 숫자 중에 가장 큰 수를 출력하시오
		int num = 0;
		int random1 = 0;
		int random2 = 0;
		int random3 = 0;
		int randomwin = 0;
		for(int i=0;i<3;i++) {
			num = (int)(Math.random()*10)+1;
			if(random1==0) {
				random1 = num;
			} else if(random2==0) {
				random2 = num;
			} else if(random3==0) {
				random3 = num;
			}
		}
		
		//random1 = (int)(Math.random()*10)+1;
		//random2 = (int)(Math.random()*10)+1;
		//random3 = (int)(Math.random()*10)+1;
		//for문이 아니라 random1,2,3에 각각 random메서드를 이용해 출력하는 방법이 더 효율적일 것이다.
		if(random1>random2 && random1>random3) {
			randomwin = random1;
		} else if (random2>random1 && random2>random3) {
			randomwin = random2;
		} else if (random3>random1 && random3>random2) {
			randomwin = random3;
		}
		System.out.println("랜덤숫자는"+random1+","+random2+","+random3+" 입니다.");
		if(randomwin != 0 ) {
			System.out.println("가장 큰 숫자는 "+randomwin+" 입니다.");	
		}
		if (randomwin == 0){
			System.out.println("중복 숫자가 있습니다. 다시 돌려주세요.");
		}

	}

}
