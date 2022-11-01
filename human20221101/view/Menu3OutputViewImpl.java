package human20221101.view;

import java.util.ArrayList;

import human20221031.dto.HumanDto;
import human20221031.model.Model;

public class Menu3OutputViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		ArrayList<HumanDto> dtos = (ArrayList<HumanDto>)model.getAttribute("dtos");
		for(HumanDto dto : dtos) {
			System.out.println(dto);
		}
		System.out.println("select 작업이 종료되었습니다.");
	}

}
