package human20221028;

import human20221027.dto.HumanDto;

public class javaUserInput06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanDto dto = new HumanDto();
		
		String name = UserInput.inputString("이름");
		dto.setName(name);
		dto.setAge(UserInput.inputInt("나이"));
		dto.setHeight(UserInput.inputDouble("키"));
		dto.myPrint();
		dto.setBirthday(UserInput.inputLocalDateTime("생일"));
		dto.myPrint();

	}

}
