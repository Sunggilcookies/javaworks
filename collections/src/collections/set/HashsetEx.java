package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEx {
	
	public static void main(String[] args) {
		//Set 형으로 객체 생성
		Set<String> set = new HashSet<>();
		
		//crud
		//객체 추가
		set.add("Java");
		set.add("Jdbc");
		set.add("Servlet/Jsp");
		set.add("Java"); //중복 저장 안됨
		//객체 수 - size
		System.out.println("총 객체수: " + set.size());
		
		//전체 요소 출력
		Iterator<String> ir = set.iterator(); //iterator()은 get()과 유사
		while(ir.hasNext()) { //자료가 있느 동안 계속 반복
			String element = ir.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
		//향상 for문
		for(String element : set)
			System.out.println(element);
		
		//전체 삭제
		set.clear();
		if(set.isEmpty()) {
			
			System.out.println("비어있음");
		}
	}
	
}

