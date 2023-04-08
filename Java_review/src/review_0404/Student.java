package review_0404;


public class Student {
	private String dept;
	private int id;
	
	public Student() {
		System.out.println("학생입니다.");
	};
	
	public Student(String dept, int id) {
		this.dept = dept;
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void printBook() {
		System.out.println("학과 : " + this.dept +"\n" + "학번 : " + this.id);
	} 
							
	public static void main(String[] args) {
	
//		Student student = new Student();
//		Student deptId = new Student("스마트소프트웨어학과", 12345);
//		deptId.printBook();
		
		Student student = new Student();
		 student.setDept("스마트소프트웨어학과");
		 student.setId(12345);
		
		 System.out.println("나의 학과는 " + student.getDept() + "이고,");
		 System.out.println("나의 학번은 " + student.getId() + "이다.");
		
	}
}
