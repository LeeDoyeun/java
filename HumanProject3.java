package human20221031;

import java.util.ArrayList;

import human20221028.UserInput;
import human20221031.dao.HumanListDao;
import human20221031.dto.HumanDto;
import human20221031.model.Model;
import human20221031.service.HumanService;
import human20221031.view.ViewMethod;

public class HumanProject3 {

	public static void main(String[] args) {
		// 1.dto 만들기 - 데이터베이스에서 가져온 데이터를 담는 클래스
		// 2.dao 만들기 - 데이터베이스 crud 작업을 담당하는 클래스
		// 3.UserInput - 사용자 입력을 도와주는 클래스
		// 4.main 메서드에서 관리형 프로그램 만들기
		// 5.service 추가하기 dao작업 + business로직(핵심로직)
		//비즈니스 로직
		//자료의 조작과 계산의 수행을 말한다.
		// 6.Model만들기 - 컨트롤과 많은 뷰를 동일한 모양으로 연결하기 위해서
		// 7.view 만들기 - Model를 매개변수로 받는 view 메서드로 만들기 ViewMehod 클래스
		HumanService service = new HumanService();
		boolean isFlag = true;
		Model model = null;
		while (isFlag) {
			model = new Model();
			ViewMethod.selectMenu(model);
			int input = (int) model.getAttribute("input");
			switch (input) {
			case 1:
				model = new Model();
				service.init();
				ViewMethod.menu1(model);
				break;
			case 2:
				model = new Model();
				model.setAttribute("dtos", service.select());
				ViewMethod.menu2(model);
				break;
			case 3:
				model = new Model();
				
				ViewMethod.menu3Input(model);
				
				double height = (double)model.getAttribute("height");
				ArrayList<HumanDto> dtos = service.select(height);
				
				model.setAttribute("dtos", dtos);
				ViewMethod.menu3Output(model);
				break;
			case 4:
				model = new Model();
				ViewMethod.menu4(model);

				service.insert((HumanDto)model.getAttribute("dto"));
				break;
			case 5:
				model = new Model();
				ViewMethod.menu5(model);
				service.update((String)model.getAttribute("name"), 
						(int)model.getAttribute("age"));

				break;
			case 6:
				model = new Model();
				ViewMethod.menu6(model);
				int age = (int)model.getAttribute("age");
				service.delete(age);
				break;
			default:
				model = new Model();
				ViewMethod.menu7(model);
				isFlag = false;
			}
		}
	}

}
