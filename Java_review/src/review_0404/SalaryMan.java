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
		System.out.println("첫 월급 : " + salaryman.salary);
		System.out.println("첫 연봉 : " + salaryman.getAnnualGross());
		int salaryUp = 2000000;
		System.out.println("현재 월급 : " + salaryUp);
		System.out.println("현재 연봉 : " + salaryman.getAnnualGross(salaryUp));
		
	}
}
