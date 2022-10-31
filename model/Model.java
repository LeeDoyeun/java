package human20221031.model;
//1.MVC패턴을 만들 때 많은 메서드들이 사용되는데 동일한 모양으로
//메서드를 호출하여 데이터를 주고 받기 위해서
//매개변수 map을 이용한 Model 클래스를 작성한다.

import java.util.HashMap;

//a(int) a(ArrayLIst) a(name. height)
//a(Model)

//Model map+추가기능들

public class Model {
	private HashMap<String,Object> hashmap = 
			new HashMap<String,Object>();
	
	public void setAttribute(String key,Object value) {
		hashmap.put(key, value);
	}
	public Object getAttribute(String key) {
		return hashmap.get(key);
	}
	public void removeAttribute(String key) {
		hashmap.remove(key);
	}

}
