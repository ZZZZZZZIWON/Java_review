package review_0404;


public class Student {
	private String dept;
	private int id;
	
	public Student() {
		System.out.println("�л��Դϴ�.");
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
		System.out.println("�а� : " + this.dept +"\n" + "�й� : " + this.id);
	} 
							
	public static void main(String[] args) {
	
//		Student student = new Student();
//		Student deptId = new Student("����Ʈ����Ʈ�����а�", 12345);
//		deptId.printBook();
		
		Student student = new Student();
		 student.setDept("����Ʈ����Ʈ�����а�");
		 student.setId(12345);
		
		 System.out.println("���� �а��� " + student.getDept() + "�̰�,");
		 System.out.println("���� �й��� " + student.getId() + "�̴�.");
		
	}
}
