package tree20221104.view;

import tree20221104.model.TreeModel;
import tree20221104.util.UserInput;

public class Menu3InputViewImpl implements IConsoleView{

	@Override
	public void execute(TreeModel model) {
		System.out.println("입력한 price값보다 비싼 나무를 출력할 예정입니다.");
		model.setAttribute("price", UserInput.inputInt("price(나무 가격)를 입력하세요"));
		
	}

}
