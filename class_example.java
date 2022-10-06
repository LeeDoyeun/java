package human20221006;

public class class_example {
	
	//필드
	private String name;
	private static int group;
	private String snack;
	
	//생성자 : 클래스 이름과 동일하면 생성자
	class_example(String name){
		this.name = name;
		group = 0;
		this.snack = "두유";
	}
	
	//메서드
	public void output() {
		System.out.println(group + name + " : " + snack+ "을/를 가져왔다.");
	}
	
	public void setGroup(int group) {
		this.group = group;
	}
	
	public void setSnack(String snack) {
		this.snack = snack;
	}

}
