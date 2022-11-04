package tree20221104.view;

import java.util.ArrayList;

import tree20221104.dto.TreeDto;
import tree20221104.model.TreeModel;


public class Menu3OutputViewImpl implements IConsoleView{

	@Override
	public void execute(TreeModel model) {
		System.out.println("=======일부 데이터 출력=======");
		ArrayList<TreeDto> dtos = (ArrayList<TreeDto>)model.getAttribute("dtos");
		for(TreeDto dto : dtos) {
			System.out.println("나무 이름 : " + dto.getName());
			System.out.println("나무 가격 : " + dto.getPrice());
			System.out.println("경험치  : " + dto.getExp());
			System.out.println("현재 심어진 나무 수 : " + dto.getNowPlanted());
			System.out.println("최대 심을 수 있는 나무 수 : " + dto.getMaxPlanted());
			System.out.println("다 자랄 날짜 : " + dto.getGrownDate());
			System.out.println("==============================================");
		}
		System.out.println("select 작업이 종료되었습니다.");
		
	}

}
