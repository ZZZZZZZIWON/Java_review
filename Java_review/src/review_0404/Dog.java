package review_0404;

public class Dog {
	private String name;
	private String breed;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
	}
	
}
