package tree20221104.view;

import java.time.LocalDateTime;

import tree20221104.dto.TreeDto;
import tree20221104.model.TreeModel;
import tree20221104.util.UserInput;

public class Menu4ViewImpl implements IConsoleView{

	@Override
	public void execute(TreeModel model) {
		System.out.println("입력하고자 하는 Tree 데이터 입력");
		TreeDto dto = new TreeDto();
		dto.setName(UserInput.inputString("나무 이름"));
		dto.setPrice(UserInput.inputInt("나무 가격"));
		dto.setExp(UserInput.inputInt("경험치"));
		dto.setNowPlanted(UserInput.inputInt("현재 심은 나무 수"));
		dto.setMaxPlanted(UserInput.inputInt("최대 심을 수 있는 나무 수"));
		dto.setGrowingHour(UserInput.inputInt("키우는 데 걸리는 시간"));
		dto.setGrownDate(LocalDateTime.now().plusHours(dto.getGrowingHour()));
		model.setAttribute("dto", dto);
	}

}
