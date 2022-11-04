package tree20221104.service;

import java.util.ArrayList;

import tree20221104.dao.TreeDao;
import tree20221104.dto.TreeDto;


//1. dao작업
//2. business 작업 핵심작업

public class TreeService {
	private TreeDao dao = new TreeDao();
	
	public void init() {
		dao.init();
	}
	public void insert(TreeDto dto) {
		dao.insert(dto);
	}
	public void update(String name, int nowPlanted) {
		dao.update(name, nowPlanted);
	}
	public void delete(int exp) {
		dao.delete(exp);
	}
	public ArrayList<TreeDto> select(){
		return dao.select();
	}
	public ArrayList<TreeDto> select(int price){
		return dao.select(price);
	}


}
