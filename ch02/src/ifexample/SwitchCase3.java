package ifexample;

public class SwitchCase3 {
	public static void main(String[] args) {
		//두수의 사칙연산 프로그램
		int num1 =10;
		int num2 =8;
		String operator = "+";
		int result = 0;
		switch(operator) {
		
			case "+":
				result = num1 + num2;
				
				break;
			case "-":
				result = num1 - num2;
				
				break;
			case "*":
				result = num1 * num2;
				
				break;
			case "/":
				result = num1 / num2;
				
				break;
			default :
				System.out.println("연산기호를 넣어주세요");
		}System.out.println(result);
	}
}
