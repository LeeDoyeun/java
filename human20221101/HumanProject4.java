package human20221101;

import java.util.ArrayList;

import human20221028.UserInput;
import human20221031.dao.HumanListDao;
import human20221031.dto.HumanDto;
import human20221031.model.Model;
import human20221031.service.HumanService;
import human20221101.view.*;


public class HumanProject4 {

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
		// 8.interface를 이용한 view만들기
		// IConsoleView view = null;
		// view = new SelectMenuViewImpl();
		// view.execute(model);
		// 오버라이딩과 오버로드의 차이
		// 오버라이딩 : 부모 메서드 자식클래스에서 재정의
		// 오버로드 : 메서드의 이름이 같아도 매개변수를 다르게 설정하여 다른 값을 도출할 수 있는 함수로 만듦.
		HumanService service = new HumanService();
		boolean isFlag = true;
		IConsoleView view = null;
		Model model = null;
		while (isFlag) {
			model = new Model();
			view = new SelectMenuViewImpl();
			view.execute(model);
//			ViewMethod.selectMenu(model);
			int input = (int) model.getAttribute("input");
			switch (input) {
			case 1:
				model = new Model();
				service.init();
//				ViewMethod.menu1(model);
				break;
			case 2:
				model = new Model();
				model.setAttribute("dtos", service.select());
				view = new Menu2ViewImpl();
				view.execute(model);
//				ViewMethod.menu2(model);
				break;
			case 3:
				model = new Model();
				view = new Menu3InputViewImpl();
				view.execute(model);
//				ViewMethod.menu3Input(model);
				
				double height = (double)model.getAttribute("height");
				ArrayList<HumanDto> dtos = service.select(height);
				
				model.setAttribute("dtos", dtos);
				view = new Menu3OutputViewImpl();
				view.execute(model);
//				ViewMethod.menu3Output(model);
				break;
			case 4:
				model = new Model();
				view = new Menu4ViewImpl();
				view.execute(model);
//				ViewMethod.menu4(model);

				service.insert((HumanDto)model.getAttribute("dto"));
				break;
			case 5:
				model = new Model();
				view = new Menu5ViewImpl();
				view.execute(model);
//				ViewMethod.menu5(model);
				service.update((String)model.getAttribute("name"), 
						(int)model.getAttribute("age"));

				break;
			case 6:
				model = new Model();
				view = new Menu6ViewImpl();
				view.execute(model);
//				ViewMethod.menu6(model);
				int age = (int)model.getAttribute("age");
				service.delete(age);
				break;
			default:
				model = new Model();
				view = new Menu7ViewImpl();
				view.execute(model);
//				ViewMethod.menu7(model);
				isFlag = false;
			}
		}
	}

}
