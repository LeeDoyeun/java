package human20221005;

import java.util.ArrayList;
import java.util.Scanner;

public class java06_0005_init {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toDoList memo_1 =
				new toDoList("10월5일","밥먹기","12시50분","1시 30분");
		toDoList memo_2 =
				new toDoList("10월6일","학원가기","07시 30분","08시 10분");
		toDoList memo_3 =
				new toDoList("10월7일","집가기","17시45분","18시 15분");
		toDoList memo_4 =
				new toDoList("10월8일","등산","07시50분");
		toDoList memo_5 =
				new toDoList("10월9일","장보기","20시10분","21시 00분");
		
		ArrayList<toDoList> memo = new ArrayList<>();
		memo.add(memo_1);
		memo.add(memo_2);
		memo.add(memo_3);
		memo.add(memo_4);
		memo.add(memo_5);
		
		System.out.println("=============");
		for(toDoList i : memo) {
			System.out.println(i.date);
			System.out.println(i.toDo);
			System.out.println(i.startTime);
			System.out.println(i.endTime);
			System.out.println("=============");
		}
		
		
		
		String temp_date;
		String temp_toDo;
		ArrayList <toDoList> addList = new ArrayList<toDoList>();
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("ToDoList를 작성하시겠습니까?");
			System.out.println("1. 예        2.아니요");
			int answer = scan.nextInt();
			scan.nextLine();
			if(answer == 1) {
			System.out.println("날짜를 입력하시오");
			temp_date = scan.nextLine();
			System.out.println("할일을 입력하시오");
			temp_toDo = scan.nextLine();
			if(!temp_date.equals(null) &&
					!temp_toDo.equals(null)) {
				toDoList temp = new toDoList(
						temp_date, temp_toDo);
				addList.add(temp);
						
			}
			}else {
				break;
			}
		}

		for(toDoList i : addList) {
			System.out.println(i.getList());
		}
		
	}

}
