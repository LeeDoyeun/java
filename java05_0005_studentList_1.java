package human20220923;

import java.util.Arrays;
import java.util.Collections;

public class java05_0005_studentList_1 {
	
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
	      
//	      for(int i = 0; i<listStudentName.length; i++) {
//	         System.out.println(listStudentName[i]);
//	      }
	      
	      //1. 자기 이름이 몇 번째 배열[i]인지 출력하시오
	      String name = "홍길동";
	      putName(name, listStudentName);
	}
	      

	public static void putName(String A, String[] listStudentName) {
		boolean check = false;
		for(int i = 0; i<listStudentName.length; i++) {
	    	 if(listStudentName[i].equals(A)) {
	    	 System.out.println(A+"은/는 "+ i +"번째 학생입니다");
	    	 System.out.println(A+"의 번호는 "+(i+1)+"번 입니다");
	    	 check = true;
	    	 break;
	      } 
		}
		
		if(!check)System.out.println("명단에 이름이 없습니다.");
		
		
	   
	}

}


