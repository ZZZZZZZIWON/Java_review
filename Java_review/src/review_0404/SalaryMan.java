package review_0404;

public class SalaryMan {
	int salary = 1000000;
	
	int getAnnualGross() {
		this.salary = salary;
		return salary * 12 + salary * 5;
	}
	
	int getAnnualGross(int salaryUp) {
		this.salary = salaryUp;
		return salary * 12 + salary * 5;		
	}
	
	public static void main(String[] args) {
		SalaryMan salaryman = new SalaryMan();
		System.out.println("ù ���� : " + salaryman.salary);
		System.out.println("ù ���� : " + salaryman.getAnnualGross());
		int salaryUp = 2000000;
		System.out.println("���� ���� : " + salaryUp);
		System.out.println("���� ���� : " + salaryman.getAnnualGross(salaryUp));
		
	}
}
