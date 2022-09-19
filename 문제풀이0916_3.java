package human20220919;

public class 문제풀이0916_3 {

	public static void main(String[] args) {
		double result = examEvenAndOddCustom(30);
		System.out.println(result);

	}

	
	public static double examEvenAndOddCustom(int num) {
		//long nanoTime : long이라는 타입으로 nanoTime 변수이름 선언
		//=(대입연산자) 우측의 System이라는 객체의 nanoTime() 메서드를 사용하여
		//현재 시각을 정확히 받아서 좌측 nanoTime이라는 변수에 할당(저장)
		long nanoTime = System.nanoTime();
		//여러분이 만든 메서드(알고리즘)가 컴퓨터는 몇 초만에 처리를 하는가?
		//nanoTime(); = 현재 시간을 명확히 알려줌
		//시작점과 끝나는 시점의 시간을 서로 빼면 알고리즘 동작시간
		//nanoTime() java5버전 이후 가장 정확하게 시각을 알려주는 메서드
		double count = 0;
		double count2multiple =  0;
		double count3multiple =  0;
		double count4multiple =  0;
		double count5multiple =  0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				count++;
				count2multiple++;
				System.out.println(i + "의 값은 2의 배수입니다!");
				if (i % 4 == 0) {
					count++;
					count4multiple++;
					System.out.println(i + "의 값은 4의 배수입니다!");
				}
			}
			if (i % 3 == 0) {
				count++;
				count3multiple++;
				System.out.println(i + "의 값은 3의 배수입니다!");
			}
			if (i % 5 == 0) {
				count++;
				count5multiple++;
				System.out.println(i + "의 값은 5의 배수입니다!");
			}
		}
	     
	      
	      System.out.println("2의 배수의 개수는 "+count2multiple);
	      System.out.println("3의 배수의 개수는 "+count3multiple);
	      System.out.println("4의 배수의 개수는 "+count4multiple);
	      System.out.println("5의 배수의 개수는 "+count5multiple);
	      
	      //1.요구사항이 무엇인가? (정답에 필요한 데이터가 무엇이냐?)
	      //(2번째로 많은 배수는 무엇이냐? = 2번째로 많은 배수의 갯수 + 배수 전부 확인)
	      //2.확실하게 출력할 수 있는 것이 무엇이냐?
	      
	      //2번째로 많은 배수의 갯수를 가진/ 개수를 저장하는 변수
	      //저장된 변수의 개수를 모두 ==으로 비교해서 2번째로 많은 배수를 모두 찾기
	      double resultRank2 = 0;
	      
	      //정복분할법 (4개의 배수 중 2개씩 나눠서 우위 확인)
	      double resultGroup1Rank1 = 0;
	      double resultGroup1Rank2 = 0;
	      double resultGroup2Rank1 = 0;
	      double resultGroup2Rank2 = 0;
	      
	      //1그룹의 1등과 2등
	      if(count2multiple >= count3multiple) {
	         resultGroup1Rank1 = count2multiple;
	         resultGroup1Rank2 = count3multiple;
	      }else {
	         resultGroup1Rank1 = count3multiple;
	         resultGroup1Rank2 = count2multiple;
	      }
	      //2그룹의 1등과 2등
	      if(count4multiple >= count5multiple) {
	         resultGroup2Rank1 = count4multiple;
	         resultGroup2Rank2 = count5multiple;
	      }else {
	         resultGroup2Rank1 = count5multiple;
	         resultGroup2Rank2 = count4multiple;
	      }
	      //1그룹의 1등과 2그룹의 1등 비교
	      if(resultGroup1Rank1 >= resultGroup2Rank1) {
	         //EX)1그룹의 2등이 2그룹의 1등보다 배수의 개수가 많을 경우?
	         if(resultGroup2Rank1 >= resultGroup1Rank2 ) {
	            resultRank2 = resultGroup2Rank1;
	         } else {
	            resultRank2 = resultGroup1Rank2;
	         }
	      }else {
	         if(resultGroup1Rank1 >= resultGroup2Rank2 ) {
	            resultRank2 = resultGroup1Rank1;
	         } else {
	            resultRank2 = resultGroup2Rank2;
	         }
	      }
	      
	      String resultMessage = "2등은 ";
	      
	      //2등은 누구인가?
	      if(resultRank2 == count2multiple) {
	         resultMessage = resultMessage + "2의 배수 ";
	      }
	      if(resultRank2 == count3multiple) {
	         resultMessage = resultMessage + "3의 배수 ";
	      }
	      if(resultRank2 == count4multiple) {
	         resultMessage = resultMessage + "4의 배수 ";
	      }
	      if(resultRank2 == count5multiple) {
	         resultMessage = resultMessage + "5의 배수 ";
	      }
	      
	      System.out.println(resultMessage + "입니다. " 
	                  + resultRank2 + " 개의 배수가 있습니다");
	      
	      long endNanoTime = System.nanoTime();
	      System.out.println("연산속도는 "+ (endNanoTime - nanoTime)/1000000000.0);

	      
 //1) 2,3,4,5의 배수의 개수 중 비교해서 많은 배수의 수를 갖고 있는 변수 만들기
	      
	      //2의 배수의 값이 많다 라는 결과
	      int multiple2win = 2;
	      int multiple3win = 3;
	      int multiple4win = 4;
	      int multiple5win = 5;
	     
	      int resultSecond = 0;
	      
	      double a = count2multiple;
	      double b = count3multiple;
	      double c = count4multiple;
	      double d = count5multiple;
	      
	      //배수 갯수 비교 구문"
	      //b>a>c or d
	      if(b>a && a>c && a>d) {
	    	  resultSecond = multiple2win;	  
	      }//c>a>b or d 
	      else if (c>a && a>b && a>d) {
	    	  resultSecond = multiple2win;
	      }//d>a>b  
	      else if (d>a && a>b && a>c) {
	    	  resultSecond = multiple2win;
	      }
	      if(a>b && b>c && b>d) {
	    	  resultSecond = multiple3win;	  
	      } else if (c>b && b>a && b>d) {
	    	  resultSecond = multiple3win;
	      } else if (d>b && b>a && b>c) {
	    	  resultSecond = multiple3win;
	      }
	      if(a>c && c>b && c>d) {
	    	  resultSecond = multiple4win;	  
	      } else if (b>c && c>a && c>d) {
	    	  resultSecond = multiple4win;
	      } else if (d>c && c>a && c>b) {
	    	  resultSecond = multiple4win;
	      }
	      if(a>d && d>b && d>c) {
	    	  resultSecond = multiple5win;	  
	      } else if (b>d && d>a && d>c) {
	    	  resultSecond = multiple5win;
	      } else if (c>d && d>a && d>b) {
	    	  resultSecond = multiple5win;
	      }
	    	  
	      
	      //배수 갯수 비교 후 결과 출력
	      if(resultSecond == multiple2win) {
	         System.out.println("2 번째로 많은 배수의 갯수를 "
	               + "가진 배수는 2의 배수 입니다");
	      }
	      if(resultSecond == multiple3win) {
	         System.out.println("2 번째로 많은 배수의 갯수를 "
	               + "가진 배수는 3의 배수 입니다");
	      }
	      if(resultSecond == multiple4win) {
	         System.out.println("2 번째로 많은 배수의 갯수를 "
	               + "가진 배수는 4의 배수 입니다");
	      }
	      if(resultSecond == multiple5win) {
	         System.out.println("2 번째로 많은 배수의 갯수를 "
	               + "가진 배수는 5의 배수 입니다");
	      }
	      



		System.out.println("2~5의 배수 갯수의 합은" + count + "입니다.");

		return count;
	}

}
