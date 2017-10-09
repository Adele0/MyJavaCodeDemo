package cn.itsource.day11.review;

public class Test {

	public static void main(String[] args) {
		/* No.1
		Animal animal = new Dog();
		animal.eat();
		
		animal = new Pig();
		animal.eat();*/
		
		/*No.2
		Animal animal = new Dog();
		test(animal);
		animal = new Pig();
		test(animal);*/
		
		//No.3
		test(new Dog());
		test(new Pig());
	}
	
	public static void test(Animal animal){
		animal.eat();
	}
}
