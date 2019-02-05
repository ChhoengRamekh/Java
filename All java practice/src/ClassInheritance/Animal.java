package ClassInheritance;

public class Animal {
	private String name;
	public String breed;
	public String color;
	public int age;
	
	public Animal() {
		
	}
	
	public Animal (String name) {
		this.name = name;
	}
	
	public Animal (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("I could eat everything");
	}
	
	public void run() {
		System.out.println("I could run fast than people");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
