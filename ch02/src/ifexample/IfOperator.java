package ifexample;

public class IfOperator {
	public static void main(String[] args) {
		// 두 수의 사칙 연산 프로그램 -if 문
		int num1 = 10;
		int num2 = 8;
		int result = 0;
		String operator = "-";
		
		if (operator == "+") {
			result = num1 + num2;
		}else if (operator == "-") {
			result = num1 - num2;
		}else if (operator == "*") {
			result = num1 * num2;
		}else if (operator == "/") {
			result = num1 / num2;
		}else {
			 System.out.println("올바른 연산값을 입력하세요");
		}
		System.out.println(result);
	}
}
