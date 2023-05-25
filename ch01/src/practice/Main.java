package practice;

//패키지뺴고 백준에 올릴것.
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);
	    //시험점수 입력
	    int A = sc.nextInt();
        if(100>=A && A>=90){
            System.out.println("A");
        }else if(A>=80){
             System.out.println("B");
        }else if(A>=70){
             System.out.println("C");
        }else if(A>=60){
             System.out.println("D");
        }else{
             System.out.println("E");
        }
    }
    
 
}
