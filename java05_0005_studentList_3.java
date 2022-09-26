package human20220926;

public class java05_0005_studentList_3 {

	public static void main(String[] args) {
//	      //3.랜덤으로 자리를 0~24개를 배치한 학생이름을 출력하시오
//	      //1)0~24까지 숫자를 랜덤으로(중복없이 배열에 저장하기)
	      int[] saveNumList = new int[25];
	      for(int i = 0; i<saveNumList.length; i++) {
	    	  saveNumList[i] = random_count0_24();
	    	  for(int k = 0; k<i; k++) {
	    		  if(saveNumList[i]==saveNumList[k]){
	    			  i--;
	    			  break;
	    		  	}
	    	  	  }
	      }
		 String[] listStudentName = new String[25]; 
	      
	      listStudentName[0] = "권지혜";
	      listStudentName[1] = "김건희";
	      listStudentName[2] = "김민기";
	      listStudentName[3] = "김정환";
	      listStudentName[4] = "김지희";
	      listStudentName[5] = "김현중";
	      listStudentName[6] = "박경환";
	      listStudentName[7] = "박송헌";
	      listStudentName[8] = "박유진";
	      listStudentName[9] = "박주성";
	      listStudentName[10] = "성진현";
	      listStudentName[11] = "심규태";
	      listStudentName[12] = "양희수";
	      listStudentName[13] = "이도연";
	      listStudentName[14] = "이우창";
	      listStudentName[15] = "이재형";
	      listStudentName[16] = "이준배";
	      listStudentName[17] = "이지훈";
	      listStudentName[18] = "이진수";
	      listStudentName[19] = "장민욱";
	      listStudentName[20] = "정윤호";
	      listStudentName[21] = "정하륜";
	      listStudentName[22] = "조은빈";
	      listStudentName[23] = "최수현";
	      listStudentName[24] = "허영주";
	      
	      for(int i=0; i<saveNumList.length; i++) {
	          System.out.println(saveNumList[i]);
	       }

	      
	      System.out.println("-------------");
	      //2) 교실 자리 배치를 console창에 출력하시오
	      //1/ 2/ 3/ 4/ 5
	      //6/ 7/ 8/ 9/ 10
	      //11/ 12 /13 /14 /15
	      //16/ 17/ 18/ 19
	      //20/ 21/ 22/ 23
	      //24/ 25
	      
	      //변수j는 1줄 당 몇 명씩 자리를 배치하는가를 위한 변수
	      int j = 1;
	      for(int i=0; i<saveNumList.length; i++) {
	         //활용 개념 : %(나머지), for, if
	         //기타 : break 등등
	         //0~14(즉, 15명까지는 한 줄에 5명씩)
	         if(i<15) {
	            //한 줄 당 5명이면 한 줄 띄기
	            if(j%5 == 0 ) {
	            	//1) saveNumList[i] i값이 index이므로
	            	//index를 통해 안에 있는 random 숫자 하나를 뽑음
	            	//2) 뽑은 랜덤 숫자는 int이므로
	            	//이 숫자를 사용하여 listStudentName 배열의 i값으로 사용하여
	            	//학생 이름을 출력
	               System.out.print(saveNumList[i]+"/");
	               System.out.println();
	            // 그외에는 1명씩 자리 차지하기
	            }else {
	               System.out.print(saveNumList[i]+"/");
	            }
	            if(i == 14) {
	               j = 0;
	            }
	         //15~24까지
	         }else {
	            if (j % 4 == 0) {
	               System.out.printf(saveNumList[i]+"/");
	               System.out.println();
	            } else {
	               System.out.printf(saveNumList[i]+"/");
	            }
	         }
	         j++;
	      }
	      
	      //배열에 랜덤으로 학생이름 넣기
	      //positionArray : 자리 위치
	      //studentNumArray : 학생이름목록 (1~25)
	      
	      String testName = "";
	      //랜덤으로 출력된 숫자(0~24)를 저장하기 위한 변수
	      int randomCount = 0;
	      
	      //positionArray.size(); : arraylist의 칸 크기를 출력하는 메서드
	      //초기식 : int i = 0;
	      //조건식 : i<positionArray.size(); : i의 값이
	      //positonArray의 길이보다 작을 때까지 반복문 실행
	      //증감식 : 반복문 1번 돌 때 마다 i의 값이 1씩 증가
	  
	}
	   private static int random_count0_24() {
		      return (int) (Math.random() * 25);
		   }


}
