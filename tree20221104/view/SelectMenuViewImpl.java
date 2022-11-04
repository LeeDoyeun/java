package tree20221104.view;

import tree20221104.model.TreeModel;
import tree20221104.util.UserInput;

public class SelectMenuViewImpl implements IConsoleView {

	@Override
	public void execute(TreeModel model) {
		System.out.println("나무 관리 프로그램");
		System.out.println("1.test값 입력 2.select 3.select(price)");
		System.out.println("4.insert(dto) 5.update(name,nowPlanted)");
		System.out.println("6.delete(exp) 7.exit");
		int input = UserInput.inputInt("선택");
		model.setAttribute("input", input);
		
	}

}
