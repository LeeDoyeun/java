package human20221102.view;

import human20221102.util.UserInput;
import human20221102.dto.HumanDto;
import human20221102.model.Model;

public class Menu4ViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("입력하고자 하는 Human 데이터 입력");
		HumanDto dto = new HumanDto();
		dto.setName(UserInput.inputString("이름"));
		dto.setAge(UserInput.inputInt("나이"));
		dto.setHeight(UserInput.inputDouble("키"));
		dto.setBirthday(UserInput.inputLocalDateTime("생일"));
		
		model.setAttribute("dto", dto);
	}

}
