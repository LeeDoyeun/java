package animal20221102;

import java.util.ArrayList;

import animal20221102.util.UserInput;
import animal20221102.dao.AnimalDao;
import animal20221102.dto.AnimalDto;
import animal20221102.model.Model;
import animal20221102.service.AnimalService;
import animal20221102.view.*;


public class AnimalProject {

	public static void main(String[] args) {
		AnimalService service = new AnimalService();
		boolean isFlag = true;
		IConsoleView view = null;
		Model model = null;
		while (isFlag) {
			model = new Model();
			view = new SelectMenuViewImpl();
			view.execute(model);
			int input = (int) model.getAttribute("input");
			switch (input) {
			case 1:
				model = new Model();
				service.init();
				break;
			case 2:
				model = new Model();
				model.setAttribute("dtos", service.select());
				view = new Menu2ViewImpl();
				view.execute(model);
				break;
			case 3:
				model = new Model();
				view = new Menu3InputViewImpl();
				view.execute(model);	
				double weight = (double)model.getAttribute("weight");
				ArrayList<AnimalDto> dtos = service.select(weight);
				model.setAttribute("dtos", dtos);
				view = new Menu3OutputViewImpl();
				view.execute(model);
				break;
			case 4:
				model = new Model();
				view = new Menu4ViewImpl();
				view.execute(model);
				service.insert((AnimalDto)model.getAttribute("dto"));
				break;
			case 5:
				model = new Model();
				view = new Menu5ViewImpl();
				view.execute(model);
				service.update((String)model.getAttribute("name"), 
						(int)model.getAttribute("age"));

				break;
			case 6:
				model = new Model();
				view = new Menu6ViewImpl();
				view.execute(model);
				int age = (int)model.getAttribute("age");
				service.delete(age);
				break;
			default:
				model = new Model();
				view = new Menu7ViewImpl();
				view.execute(model);
				isFlag = false;
			}
		}
	}

}
