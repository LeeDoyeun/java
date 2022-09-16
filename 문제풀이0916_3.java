package human20220916;

public class 문제풀이0916_3 {

	public static void main(String[] args) {
		double result = examEvenAndOddCustom(30);
		System.out.println(result);

	}

	public static double examEvenAndOddCustom(int num) {
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
