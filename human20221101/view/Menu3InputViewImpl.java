package human20221101.view;

import human20221028.UserInput;
import human20221031.model.Model;

public class Menu3InputViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("입력한 height값보다 큰 학생을 출력할 예정입니다.");
		model.setAttribute("height", UserInput.inputDouble("height을 입력하세요"));
		
	}

}
