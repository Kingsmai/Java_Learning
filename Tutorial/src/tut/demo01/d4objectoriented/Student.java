package tut.demo01.d4objectoriented;
/*
 * 对于基本类型当中的Boolean值，Getter方法一定要写成isXxx形式，而setXxx规则不变
 */
public class Student {
	private String name; // 姓名
	private int age; // 年龄
	private boolean male; // 是不是男的
	
	public void setName(String str) {
		name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int num) {
		age = num;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMale(boolean b) {
		male = b;
	}
	
	public boolean isMale() {
		return male;
	}
}
