package basic.demo19abstractpractise;

public class User {

	private String name; // 姓名
	private int money; // 余额
	
	public User() {
		super();
	}

	public User(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	// 显示当前用户信息
	public void show() {
		System.out.println("我叫：" + name + "，我有多少钱：" + money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
