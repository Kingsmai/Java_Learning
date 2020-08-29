package tut.demo04.d2abstract2;

public class DemoMain {

	public static void main(String[] args) {
//		Animal animal = new Animal(); // 错误写法
//		Dog dog = new Dog(); // 错误写法
		
		DogPoodle poodle = new DogPoodle(); // 这是普通类，可以直接new对象
		DogHuskey huskey = new DogHuskey(); // 同上
		
		poodle.eat();
		poodle.sleep();
		System.out.println("============");
		huskey.eat();
		huskey.sleep();
	}
}
