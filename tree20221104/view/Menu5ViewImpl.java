package tree20221104.view;


import tree20221104.model.TreeModel;
import tree20221104.util.UserInput;

public class Menu5ViewImpl implements IConsoleView{

	@Override
	public void execute(TreeModel model) {
		System.out.println("특정 name으로 nowPlanted 변경");
		String name = UserInput.inputString("나무 이름 : ");
		int nowPlanted = UserInput.inputInt("변경할 현재 심어진 나무의 수 : ");
		
		model.setAttribute("name", name);
		model.setAttribute("nowPlanted", nowPlanted);
		
	}

}
