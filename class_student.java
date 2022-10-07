package human20221007;

public class class_student {
	
	   //학생정보를 담는 클래스
	   //클래스를 토대로 학생정보 객체를 만드는 인스턴스를 대량으로 만들 예정
	   //학생마다 저장해야 할 정보를 변수로 만들어야함 = 필드
	    
	   String name;
	   String id;
	   String pw;
	   
	   public class_student(){
		   
	   }
	   
	   //생성자 : 학생정보 인스턴스를 만들 때 처음에 들어가야 할 데이터
	   class_student (String name, String id, String pw){
	      this.name= name;
	      this.id= id;
	      this.pw =pw;
	      
	   }
	   public void getInfo() {
	      System.out.println(name+"\s"+id+"\s"+pw);
	   }
	   public void setPw(String input) {
		   this.pw = input;
	   }
	   public boolean equalsId(String input) {
		   if(input.equals(this.id)) {
			   return true;
		   }
		   return false;
	   }
	   public boolean equalsPw(String input) {
		   if(input.equals(this.pw)) {
			   return true;
		   }
		   return false;
	   }

	   }

