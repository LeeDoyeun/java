package animal20221102.view;

import animal20221102.util.*;
import animal20221102.model.Model;

public class Menu3InputViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("입력한 weight값보다 무거운 동물을 출력할 예정입니다.");
		model.setAttribute("weight", UserInput.inputDouble("weight을 입력하세요"));
		
	}

}
