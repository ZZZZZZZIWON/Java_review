package review_0404;

public class ComplexNumber {
	public int realNum;
	public int imagNum;
	
	void printBook() {
	System.out.println(realNum +" + "+ imagNum + "i");
	}
	

	public static void main(String[] args) {
		ComplexNumber com = new ComplexNumber() {};
		com.realNum = 10;
		com.imagNum = 20;
		com.printBook();
	}
}
