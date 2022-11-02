package animal20221102.view;

import java.util.ArrayList;

import animal20221102.dto.AnimalDto;
import animal20221102.model.Model;

public class Menu2ViewImpl implements IConsoleView{

	@Override
	public void execute(Model model) {
		System.out.println("전체 데이터 출력");
		ArrayList<AnimalDto> dtos = 
				(ArrayList<AnimalDto>) model.getAttribute("dtos");
		for(AnimalDto dto : dtos) {
			System.out.println(dto);
		};
		
		System.out.println("select 작업이 종료되었습니다.");
		
	}

}
