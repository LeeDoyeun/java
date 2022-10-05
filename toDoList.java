package human20221005;

public class toDoList {
	String date;
	String toDo;
	String startTime;
	String endTime;
	
	toDoList(String date){
		this.date = date;
		this.toDo = "할일 모름";
		this.startTime = "시작시간 모름";
		this.endTime = "끝나는 시간 모름";
	}
	toDoList(String date,String toDo){
		this.date = date;
		this.toDo = toDo;
		this.startTime = "시작시간 모름";
		this.endTime = "끝나는 시간 모름";
	}
	
	toDoList(String date,String toDo, String startTime){
		this.date = date;
		this.toDo = toDo;
		this.startTime = startTime;
		this.endTime = "끝나는 시간 모름";
	}
	

	toDoList(String date,String toDo, String startTime, String endTime){
		this.date = date;
		this.toDo = toDo;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	   //날짜를 확인하는 메서드
	   public boolean checkDay(String input_date) {
	      if(input_date == this.date) {
	         return true;
	      }
	      return false;
	   }
	   
	   //할일 출력 메서드
	   public String getToDo() {
	      return this.toDo;
	   }
	   
	   //날짜 출력 메서드
	   public String getDate() {
		   return this.date;
	   }
	   
	   public String getList() {
		   return getDate() + getToDo()  ;
	   }





}
