package human20221028;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class javaArrayList04 {

	public static void main(String[] args) {
		// ArrayList 배열로 된 연속된 데이터를 다루는 자료구조
		//collection
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//insert 방법 add 사용
		arrayList.add(14);
		arrayList.add(15);
		arrayList.add(22);
		arrayList.add(10);
		arrayList.add(10);
		
		//select 방법 get
		System.out.println("select 첫번째 방법 for문");
		for(int i = 0; i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		//add(입력위치, 데이터)
		arrayList.add(0,1);//0부터 시작한다.
		arrayList.add(2,19);
		
		System.out.println("select 두번째 방법 for문");
		for(Integer i : arrayList) {
			System.out.println(i);
		}
		//remove 사용
		arrayList.remove(1);//기본자료형 int가 오면 해당 인덱스를 삭제
		arrayList.remove((Integer)1);//객체가 오면 해당 데이터를 삭제
		arrayList.remove((Integer)10);//10이란 데이터를 가진 인덱스가 2개 있지만 하나의 인덱스만 지워짐.
		
		System.out.println("select 세번째 방법 Iterator");
		Iterator<Integer> iter = arrayList.iterator();
		while(iter.hasNext()) {//다음 데이터가 있는지 확인
			System.out.println(iter.next());//다음데이터를 리턴해주고 다음데이터로 인덱스를 옮김
		}
		
		//indexof를 이용해서 들어있는 데이터의 인덱스 찾기
		System.out.println("indexOf를 이용하여 들어있는 데이터의 인덱스 찾기");
		int index = arrayList.indexOf((Integer)15);
		System.out.println(index);
		index = arrayList.indexOf(19);
		System.out.println(index);
		index = arrayList.indexOf(20);//배열에 없는 데이터를 입력해 보았다.
		System.out.println(index);//-1이 나왔다.
		
		int data = 22;
		if(arrayList.contains(data)) {//배열 안에 데이터의 유무 확인
			System.out.println("arrayList에 "+data+"가 들어있다.");
		}else {
			System.out.println("arrayList에 "+data+"가 없다.");
		}
		
		//update  수정 set(인덱스, 변경할 데이터)
		arrayList.set(1, 150);
		while(iter.hasNext()) {//다음 데이터가 있는지 확인
			System.out.println(iter.next());//다음데이터를 리턴해주고 다음데이터로 인덱스를 옮김
		}

	

	}

}
