package human20221018;

import java.util.ArrayList;
import java.util.List;

public class House {
	//집이라는 개념이 가질 수 있는 속성
	//필드변수
	//소유주
	//가격
	//주소
	//가전제품기기 여러개 추가하거나 뺄 수 있으려면, 고정배열, ArrayList<>
	List<HomeApp> homeApps;//가전제품 목록
	List<GiniConnectable> smartApps;//AI머신 연결 가능한 제품들
	//지니 SmartHome AI 제어 머신 -> 지니에 연결을 시킬 수 있는 기능이 있는 제품들.
	
	//집을 최초로 만들때 필요한 정보를 초기화
	//생성자 -> 초기시작시 필요한 일들 + 필드변수들을 초기화
	public House() {
		homeApps = new ArrayList<HomeApp>();
		smartApps = new ArrayList<GiniConnectable>();
	}
	

	  public void showHomeAppList() {//집안에 가전제품 목록을 보여달라.
	      for(HomeApp ha: homeApps) {
	         System.out.println(ha.toString());
	         //toString 메소드는 Object 클래스 
	         //HomeApp 안에 있는 갹체들이 모두 toString 에 정보를 반환하는 형태로 구현을 했다면?
	      }
	      
	   }
	  public void showHomeSmartAppList() { //집안에 스마트제품 목록을 보여달라.
			for(GiniConnectable gc : smartApps) { 
				System.out.println(gc.toString());
				//toString 메소드는 Object 클래스 
				//HomeApp 안에 있는 객체들이 모두 toString에 정보를 반환하는 형태로 구현을 했다면?
			}
		}

	   public void connectSmartAppAll() {
	      for (GiniConnectable gc: smartApps) {
	         gc.connectGini();
	      }
	   }

	   public void addHomeApp(HomeApp homeApp) {
		      //필터
		      //집이 좁아서 더이상 추가가 불가능 하면? 추가 안한다
		      
		      this.homeApps.add(homeApp);
		      
		      //이 제품 중에, 지니에 연결할수 있는 제품들은 별도 기록
		      if(homeApp instanceof GiniConnectable) { //지니에 연결 가능한 제품인가?
		         this.smartApps.add((GiniConnectable)homeApp );   
		      }
		      
		   }
		   // 집이 수행할수 있다는 기능
		   // 메소드
		   // 청소한다.인테리어.가스연결. 가전제품을 들여온다.
		   // 옵션/기본 필요 메소드 -> 필드변수에 접근하는 통로 -> getter/setter

		}
