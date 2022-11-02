package animal20221102.service;

import java.util.ArrayList;

import animal20221102.dao.AnimalDao;
import animal20221102.dto.AnimalDto;

//1. dao작업
//2. business 작업 핵심작업

public class AnimalService {
	private AnimalDao dao = new AnimalDao();
	
	public void init() {
		dao.init();
	}
	public void insert(AnimalDto dto) {
		dao.insert(dto);
	}
	public void update(String name, int age) {
		dao.update(name, age);
	}
	public void delete(int age) {
		dao.delete(age);
	}
	public ArrayList<AnimalDto> select(){
		return dao.select();
	}
	public ArrayList<AnimalDto> select(double height){
		return dao.select(height);
	}


}
