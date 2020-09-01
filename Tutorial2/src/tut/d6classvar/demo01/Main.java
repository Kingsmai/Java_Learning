package tut.d6classvar.demo01;

public class Main {

	public static void main(String[] args) {
		// 创建一个英雄对象
		Hero hero = new Hero();
		// 为英雄起名，并设置年龄
		hero.setName("扬尘");
		hero.setAge(20);
		
		// 创建一个武器对象
		Weapon weapon = new Weapon("惊邪剑");
		// 为英雄配备武器
		hero.setWeapon(weapon);
		
		hero.attack();
		
		hero.setSkill(new SkillImplLotus()); // 使用单独定义的实现类
		hero.useSkill();
		
		// 还可以改成使用匿名内部类
		Skill finger = new Skill() {
			
			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("必杀技：大寂灭指！");
			}
		};
		hero.setSkill(finger);
		hero.useSkill();
		
		// 进一步简化，同时使用匿名内部类和匿名对象
		hero.setSkill(new Skill() {
			
			@Override
			public void use() {
				// TODO Auto-generated method stub
				System.out.println("必杀技：天神一尺！");
			}
		});
		hero.useSkill();
	}
}
