package tree20221104;

import java.util.ArrayList;

import tree20221104.dto.TreeDto;
import tree20221104.model.TreeModel;
import tree20221104.service.TreeService;
import tree20221104.view.*;




public class TreeProject {

	public static void main(String[] args) {
		TreeService service = new TreeService();
		boolean isFlag = true;
		IConsoleView view = null;
		TreeModel model = null;
		while (isFlag) {
			model = new TreeModel();
			view = new SelectMenuViewImpl();
			view.execute(model);
			int input = (int) model.getAttribute("input");
			switch (input) {
			case 1:
				model = new TreeModel();
				service.init();
				break;
			case 2:
				model = new TreeModel();
				model.setAttribute("dtos", service.select());
				view = new Menu2ViewImpl();
				view.execute(model);
				break;
			case 3:
				model = new TreeModel();
				view = new Menu3InputViewImpl();
				view.execute(model);	
				int price = (int)model.getAttribute("price");
				ArrayList<TreeDto> dtos = service.select(price);
				model.setAttribute("dtos", dtos);
				view = new Menu3OutputViewImpl();
				view.execute(model);
				break;
			case 4:
				model = new TreeModel();
				view = new Menu4ViewImpl();
				view.execute(model);
				service.insert((TreeDto)model.getAttribute("dto"));
				break;
			case 5:
				model = new TreeModel();
				view = new Menu5ViewImpl();
				view.execute(model);
				service.update((String)model.getAttribute("name"), 
						(int)model.getAttribute("nowPlanted"));

				break;
			case 6:
				model = new TreeModel();
				view = new Menu6ViewImpl();
				view.execute(model);
				int exp = (int)model.getAttribute("exp");
				service.delete(exp);
				break;
			default:
				model = new TreeModel();
				view = new Menu7ViewImpl();
				view.execute(model);
				isFlag = false;
			}
		}
	}

}
