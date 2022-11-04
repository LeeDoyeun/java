package tree20221104.view;


import tree20221104.model.TreeModel;
import tree20221104.util.UserInput;

public class Menu6ViewImpl implements IConsoleView{

	@Override
	public void execute(TreeModel model) {
		System.out.println("입력한 경험치보다 작은 데이터 삭제");
		int exp = UserInput.inputInt("경험치 :");
		model.setAttribute("exp", exp);
	}

}
