package classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.SpringLayout.Constraints;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//String 클래스의 여러가지 정보
		Class class1 = Class.forName("java.lang.String");
		System.out.println(class1.getName());
		
		System.out.println("생성자 정보");
		Constructor<?>[] cons = class1.getConstructors();
		for(Constructor<?> con : cons) {
			System.out.println(con);
		}
		Field[] fields = class1.getDeclaredFields();
		for(Field field :fields) 
			System.out.println(field);
		
		Method[] methods = class1.getDeclaredMethods();
		for(Method method :methods) 
			System.out.println(method);
		
	}
}
