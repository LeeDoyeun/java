package human20220919;

//JVM 안에 있는 Scanner라는 객체(메서드)
import java.util.Scanner;

public class java03_memoryAndNumber {


	public static void main(String[] args) {
		// 20220919 history
	      // 1. 메모리와 system.in / out
	      // 2. 연산속도와 알고리즘(분할정복법)
	      // 3. 정확한 수
	      // 4. 삼항연산자
	      questionStep1();
	   }

	   public static void inputDataProcess() {
	      // Scanner : JVM밖에서 데이터를 입력받는 메서드
	      // Scanner()입력받기 <-> println()출력하기

	      // Scanner타입으로 input변수 선언!
	      // new Scanner(System.in); 인스턴스 Scanner실행하여 input변수에 할당(저장)
	      // System.in : System객체에 입력받아서 처리하는 in객체를 담아서 인자값으로 전달
	      Scanner input = new Scanner(System.in);
	      // System.out(출력) <-> System.in(입력)

	      System.out.println("당신의 이름은 무엇입니까?");
	      // input.nextLine(); Scanner 선언한 input변수의
	      // nextLine() 메서드를 실행하면
	      // 사용자가 입력한 String문자를
	      // =(대입연산자) 좌측에 inputData변수에 할당(저장)
	      String inputData = input.nextLine();
	      //int inputDataInt = input.nextInt();
	      //boolean inputDataBoolean = input.nextBoolean();

	      System.out.println("나의 이름은 " + inputData);
	   }

	   public static void exactNum() {
	      // 2진수로 표현하면 숫자를 정확하게 나타낼 수 없다!
	      // 항상 10진수는 [2진수 변환한 뒤에 계산 하고] 다시 10진수로 표현!
	      // 2진수 표기 후 나머지를 무한대로 출력할 경우
	      // 타입에 따라 표기할 수 있는 범위의 한도에 의해 소수점 특정자리까지만 표현
	      System.out.println(0.1 + 0.2);

	      // int타입으로 apple변수를 선언
	      // =(대입연산자) 우측에 있는 1을 좌측 apple변수에 할당(저장)
	      int apple = 1;
	      int totalPieces = apple * 10;
//	      double pieceUnit = 0.1;
	      int number = 7;
	      int temp = totalPieces - number;

	      // 소수점 표기를 정수로 우선 계산하고 다시 소수점 영역으로 변환
	      // 정수를 정확히 표현이 가능하다!
	      double result = temp / 10.0;

	      // double타입으로 result변수이름 선언
	      // =(대입연산자) 우측에 apple변수를 메모리에서 가져온 뒤
	      // number변수 데이터와 priceUnit변수 데이터를 곱한 값을
	      // 뺀 값을 result변수에 저장
//	      double result = apple - number*pieceUnit;

	      System.out.println("사과 한 개에서 ");
	      System.out.println("0.7 조각을 빼면, ");
	      System.out.println(result + " 조각이 남는다.");

	   }

	   public static void memoryCheck() {
	      // int num5(선언부) : int타입 num5변수명으로 메모리에 선언
	      // =(대입연산) 우측의 5라는 숫자를 num5변수에 할당
	      // (메모리 영역 안에 num5변수 영역에 5라는 숫자가 있음!)
	      int num5 = 5;

	      // 규칙1. 항상 대입연산자 우측 연산을 완료 후 좌측 변수에 할당(저장)
	      // 규칙2. 우측에서 항상 좌측에 있는 산술연산자부터 실행하기
	      // (num5*2; num5변수를 먼저 가져오고, 2숫자를 곱한다(*))

	      // = num5*2; 메모리 영역 안에 num5변수 영역의 숫자 5를 가져온다
	      // 가져온 숫자 5를 *2연산을 실행한다 (CPU에서 작업 실행)
	      // 연산 완료 후 =(대입연산자) 좌측에 있는 num5변수에 결과값을 할당(저장)
	      num5 = num5 * 2;
	      // System이라는 객체(JVM에 기본적으로 제공하는 객체)를 사용하여
	      // out.prinln() 메서드를 실행한다 (인자 num5를 넣고!)
	      // (Console창에 num5변수에 있는 값을 출력)
	      System.out.println(num5);
	   }
	   
	   public static void questionStep1() {
	      System.out.println("--------------------");
	      System.out.println("안녕하세요. 떡볶이 집입니다");
	      System.out.println("메뉴를 선택하세요");
	      System.out.println("1. 매운 떡볶이 : 가격 개당 2000원");
	      System.out.println("2. 마늘 떡볶이 : 가격 개당 4000원");
	      System.out.println("3. 엽기 떡볶이 : 가격 개당 4500원");
	      
	      //Scanner타입으로 scanMenu변수이름 선언
	      //new 객체생성(도구생성)
	      //Scanner라는 도구를 새로 생성한다 (인자는 System.in을 쓰겠다)
	      //System.in 컴퓨터 키보드와 같은 입력을 받을 수 있는 도구를 사용하는 객체
	      //생성된 도구(객체)는 scanMenu메모리 영역에 저장
	      Scanner scanMenu = new Scanner(System.in);
	      //int타입으로 MenuChoice변수이름 선언!
	      //=(대입연산자) 우측에 scanMenu변수에 있는 Scanner도구를 메모리에서
	      //가져와서 nextInt()메서드를 실행!
	      //실행하면 키보드의 입력값(int타입으로)을 받아서
	      //menuChoice 변수에 할당(저장)
	      int MenuChoice = scanMenu.nextInt();
	      //개수 입력
	      System.out.println("개수를 입력하세요");
	      int MenuCount = scanMenu.nextInt();
	      //결과 출력
	      System.out.println("추가할 메뉴가 있습니까?");
	      System.out.println("1.예      2.아니오");
	      int answer = scanMenu.nextInt();
	      int MenuChoice2 = 0;
	      int MenuChoice3 = 0;
	      int MenuCount2 = 0;
	      int MenuCount3 = 0;
	      if(answer == 1) {
	    	  System.out.println("메뉴를 선택하세요");
	    	  MenuChoice2 = scanMenu.nextInt();
	    	  System.out.println("개수를 입력하세요");
		      MenuCount2 = scanMenu.nextInt();
		      System.out.println("추가할 메뉴가 있습니까?");
		      System.out.println("1.예      2.아니오");
		      answer = scanMenu.nextInt();
	      }
	      if(answer == 1) {
	    	  System.out.println("메뉴를 선택하세요");
	    	  MenuChoice3 = scanMenu.nextInt();
	    	  System.out.println("개수를 입력하세요");
		      MenuCount3 = scanMenu.nextInt();
	      }
	      //고객이 앉는 테이블 번호 입력 받음
	      System.out.println("서빙 받을 테이블 숫자를 입력하세요");
	      int tableNum = scanMenu.nextInt();
	      System.out.println("주문자의 이름을 입력하세요");
	      Scanner input = new Scanner(System.in);
	      String name = input .nextLine();
	      System.out.println("주문자의 이름은" + name +"입니다");
	      
	      String menuString = "";
	      int price = 0;
	      if(MenuChoice == 1) {
	         menuString = "매운 떡볶이";
	         price = 2000;
	      }else if(MenuChoice == 2) {
	         menuString = "마늘 떡볶이";
	         price = 4000;
	      }else if(MenuChoice == 3) {
	         menuString = "엽기 떡볶이";
	         price = 4500;
	      }
	      String menuString2 = "";
	      int price2 = 0;
	      if(MenuChoice2 == 1) {
	         menuString2 = "매운 떡볶이";
	         price2 = 2000;
	      }else if(MenuChoice2 == 2) {
	         menuString2 = "마늘 떡볶이";
	         price2 = 4000;
	      }else if(MenuChoice2 == 3) {
	         menuString2 = "엽기 떡볶이";
	         price2 = 4500;
	      }
	      String menuString3 = "";
	      int price3 = 0;
	      if(MenuChoice3 == 1) {
	         menuString3 = "매운 떡볶이";
	         price3 = 2000;
	      }else if(MenuChoice3 == 2) {
	         menuString3 = "마늘 떡볶이";
	         price3 = 4000;
	      }else if(MenuChoice3 == 3) {
	         menuString3 = "엽기 떡볶이";
	         price3 = 4500;
	      }
	      
	      
	      System.out.println("┌--------결제영수증--------┐");
	      System.out.println("│-------"+tableNum+"테이블----------│");
	      System.out.println("│--"+menuString+ MenuCount +"인분 입니다.--│ ");
	      if(answer ==1) {System.out.println("│--"+menuString2+ MenuCount2 +"인분 입니다.--│ ");
	      }
	      if(answer ==1) {System.out.println("│--"+menuString3+ MenuCount3 +"인분 입니다.--│ ");
	      }
	      System.out.println("└-총 정산 금액은 "+ (price*MenuCount+price2*MenuCount2+price3*MenuCount3)+"원입니다-┘");
	      
	      System.out.println("┌----주방용영수증-----┐");
	      System.out.println("│고객님의 성함은"+name+"이고,│");
	      System.out.println("│"+menuString+MenuCount+"인분 입니다.│");
	      if(answer ==1) {System.out.println("│"+menuString2+ MenuCount2 +"인분 입니다.│ ");
	      }
	      if(answer ==1) {System.out.println("└"+menuString3+ MenuCount3 +"인분 입니다.┘ ");
	      }
	      
	      //if, for, else, Scanner, println
	      //당신은 떡볶이 집 운영자 입니다.
	      //오더를 자동화 하기 위해 키오스크 시스템을 만들려고 합니다.
	      //다음과 같은 떡볶이 메뉴를 출력하고, 
	      //고객명과 입력받은 떡볶이를 주방장과 결제시스템에게 
	      //데이터를 전달하는 시스템을 구축하시오.
	      //메뉴)
	      //1. 매운 떡볶이 : 2000원
	      //2. 마늘 떡볶이 : 4000원
	      //3. 엽기 떡볶이 : 4500원
	      
	      
	   }

	}