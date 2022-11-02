package human20221102.view;

import human20221102.util.UserInput;
import human20221102.model.Model;

public class Menu6ViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("입력한 나이보다 작은 데이터 삭제");
		int age = UserInput.inputInt("나이 :");
		model.setAttribute("age", age);
	}

}
