package tut.demo04.d2abstract;

public class Son extends Father {

	public Son() {
		// TODO Auto-generated constructor stub
		System.out.println("子类构造方法");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃饭饭");
	}

}
