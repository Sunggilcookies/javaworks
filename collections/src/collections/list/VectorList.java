package collections.list;

import java.util.List;
import java.util.Vector;
public class VectorList {

	public static void main(String[] args) {
		//Vector - 멀티 스레드 환경에서 사용함
		List<String> vegeList = new Vector<>();
		
		//객체 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
	
		//특정 위치에추가
		vegeList.add(2,"고추");
		
		//"감자"를 상추로 변경 -indexof() -set()
		int gamindex = vegeList.indexOf("감자");
		if(gamindex != -1) {
			vegeList.set(gamindex,"상추");
		}
		//'마늘'을 삭제
		vegeList.remove("마늘");
		
		//전체 조회(size(), get() )
		for(int i=0; i<vegeList.size(); i++) {
			String vegetable= vegeList.get(i);
			System.out.println(vegetable);
		}
		
		
	}
	
}
