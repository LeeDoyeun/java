package human20220923;

import java.util.Arrays;
import java.util.Collections;

public class java05_0005_studentList_2 {
	
		

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
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
		      

		      //2. 가나다라 순으로 배열을 정렬하여 출력하시오
		      //String 문자열은 각 문자를 하나씩 더한 값
		      //ex)김+준+석 = 김준석
		      //각 문자를 char타입 ex)김
		      String name = "하가";
		      //String문자를 char타입으로 하나씩 저장
		      //char[]배열 타입으로 test변수 선언
		      //String문자인 name변수를 가져와서
		      //toCharArray() 메서드를 사용하여
		      //String문자열을 하나씩 분해한 뒤에 
		      //test변수에 저장
		      char[] test = name.toCharArray();
		      for(int i =0; i<test.length; i++) {
		         System.out.println(test[i]);
		      }
		      //char 문자열 마다 비교
		      if(test[0]>test[1]) {
		         System.out.println("큰 문자는 "+test[0]);
		      }else {
		         System.out.println("큰 문자는 "+test[1]);
		      }
		      //======>한 단어 안에 한글자 한글자씩을 비교 학생이름 배열에 쓰기엔 어려움이 있음
		      
		      //학생 이름을 비교
		      String testA = "가가가";
		      String testB = "가가나";
		      System.out.println("---------");
		      //A.compareTo(B) 메서드를 사용하여 A와 B를 비교한 뒤 크면 true
		      //작으면 false
		      //A>B 문자열로 비교하여 아스키코드(indexNumber)가 크면 A가 출력
		      if(testA.compareTo(testB)>0) {
		         System.out.println(testA);
		      }else {
		         System.out.println(testB);
		      }
		      //학생 목록을 자동 정렬
		      for(int i = 0; i<listStudentName.length; i++) {
		         System.out.println(listStudentName[i]);
		      }
		      //Arrays객체 있는 sort()메서드를 사용하면
		      //안에 있는 인자값(배열)이 자동 정렬
		      //sort(배열이름, 정렬방식);
		      Arrays.sort(listStudentName, Collections.reverseOrder());
		      System.out.println("---------");
		      for(int i = 0; i<listStudentName.length; i++) {
		         System.out.println(listStudentName[i]);
		      }
	  
		}

}

