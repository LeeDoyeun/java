package animal20221102.view;

import animal20221102.util.UserInput;
import animal20221102.dto.AnimalDto;
import animal20221102.model.Model;

public class Menu4ViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("입력하고자 하는 Animal 데이터 입력");
		AnimalDto dto = new AnimalDto();
		dto.setName(UserInput.inputString("이름"));
		dto.setAge(UserInput.inputInt("나이"));
		dto.setWeight(UserInput.inputDouble("몸무게"));
		dto.setDatetime(UserInput.inputLocalDateTime("입양날짜"));
		
		model.setAttribute("dto", dto);
	}

}
