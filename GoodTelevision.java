package human20221018;
//Television 클래스
public class GoodTelevision extends Television implements Searchable{//리모트컨트롤, 서치
	int smartModuleCount;
	GoodTelevision(String brand, int inch, int smartModuleCount){
		super(brand,inch);
		this.smartModuleCount = smartModuleCount;
	}
	public String toString() {
		return String.format("%s 브랜드 굿티비 현재 볼륨 : %d", brand,volume);
	}
	@Override
	public void search(String Keyword) {
		// TODO Auto-generated method stub
		System.out.println("굿티비 "+Keyword+" 키워드로 검색합니다.");
		
	}
	
}
