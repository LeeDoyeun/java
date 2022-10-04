package human20221004;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		group group1_2 = new group();
		System.out.println(group1_2.randomStudentName());
		System.out.println(group1_2.info());
		
      
      System.out.println(group1_2.normalMethod("이재형"));
//      System.out.println(group1_2.normalMethod(123));  //타입이 달라서 오류남
      
      System.out.println(group1_2.normalMethod("이재형"));
      System.out.println(group1_2.genericMethod(123123));
         //generic = 타입이 달라도 가능 

	}

}
