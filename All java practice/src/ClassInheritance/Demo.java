package ClassInheritance;

public class Demo {

	public static void main(String[] args) {
		Dog kiki = new Dog("kiki");
		
		kiki.setName("kiki");
		System.out.println(kiki.getName());
		kiki.bark();
		kiki.eat();
		kiki.run();
		
		Cat ketty = new Cat();
		ketty.setName("ketty");
		System.out.println(kiki.getName());
		ketty.moew();
		ketty.eat();
		ketty.run();

	}

}
