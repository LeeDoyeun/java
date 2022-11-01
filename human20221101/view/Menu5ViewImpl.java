package human20221101.view;

import human20221028.UserInput;
import human20221031.model.Model;

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
