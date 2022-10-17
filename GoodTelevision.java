package human20221017;
//Television 클래스
public class GoodTelevision extends Television implements Searchable{//리모트컨트롤, 서치
	int smartModuleCount;
	GoodTelevision(String brand, int inch, int smartModuleCount){
		super(brand,inch);
		this.smartModuleCount = smartModuleCount;
	}
	@Override
	public void search(String Keyword) {
		// TODO Auto-generated method stub
		System.out.println("굿티비 "+Keyword+" 키워드로 검색합니다.");
		
	}
	
}
