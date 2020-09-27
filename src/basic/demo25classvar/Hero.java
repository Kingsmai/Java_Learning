package basic.demo25classvar;

/*
 * 游戏当中的英雄角色类
 */
public class Hero {

	private String name; // 姓名
	private int age; // 年龄
	private Weapon weapon; // 武器
	private Skill skill; // 技能
	
	public Hero() {
		super();
	}

	public Hero(String name, int age, Weapon weapon, Skill skill) {
		super();
		this.name = name;
		this.age = age;
		this.weapon = weapon;
		this.skill = skill;
	}

	public void attack() {
		System.out.println("年龄为" + age + "的" + name + "使用" + weapon.getCode() + "进行攻击");
		System.out.println("==============");
	}
	
	public void useSkill() {
		System.out.println(name + "释放技能：");
		skill.use();
		System.out.println("技能释放完毕！");
		System.out.println("==============");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
}
