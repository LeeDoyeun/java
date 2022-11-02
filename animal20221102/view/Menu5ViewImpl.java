package animal20221102.view;

import animal20221102.util.UserInput;
import animal20221102.model.Model;

public class Menu5ViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("특정 name으로 age 변경");
		String name = UserInput.inputString("이름 : ");
		int age = UserInput.inputInt("나이 : ");
		
		model.setAttribute("name", name);
		model.setAttribute("age",age);
		
	}

}
