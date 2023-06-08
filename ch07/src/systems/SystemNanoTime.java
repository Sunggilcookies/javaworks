package systems;

public class SystemNanoTime {
	public static void main(String[] args) {
		double start, end;
		start = System.nanoTime();
		
		long sum = 0;
		long i;
		for (i=1; i<100000000; i++) {
			sum +=1;
		}
		end = System.nanoTime();
		System.out.println(sum);
		System.out.printf("계산에 소모된 시간은 %f초입니다이잉",(end-start));
	}
	
}
