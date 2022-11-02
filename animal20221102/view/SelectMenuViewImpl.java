package animal20221102.view;

import animal20221102.util.UserInput;
import animal20221102.model.Model;

public class SelectMenuViewImpl implements IConsoleView {

	@Override
	public void execute(Model model) {
		System.out.println("Animal관리 프로그램");
		System.out.println("1.test값 입력 2.select 3.select(weight)");
		System.out.println("4.insert(dto) 5.update(name,age)");
		System.out.println("6.delete(age) 7.exit");
		int input = UserInput.inputInt("선택");
		model.setAttribute("input", input);
		
	}

}
