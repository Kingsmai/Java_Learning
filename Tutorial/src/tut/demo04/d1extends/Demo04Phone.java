package tut.demo04.d1extends;

public class Demo04Phone {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.call();
		phone.send();
		phone.show();
		System.out.println("============");
		NewPhone newPhone = new NewPhone();
		newPhone.call();
		newPhone.send();
		newPhone.show();
	}
}
