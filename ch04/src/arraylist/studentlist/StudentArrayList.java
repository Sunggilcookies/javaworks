package arraylist.studentlist;

public class StudentArrayList {
	public static void main(String[] args) {
		//학생객체 생성
		Student s1 = new Student(1001, "유성길");		
		
		s1.addsubject("국어", 90);
		s1.addsubject("수학", 80);
		s1.addsubject("과학", 70);
		
		s1.showInfo();
	}
}
