package tut.demo01.d3objectoriented;
/*
 * ����һ���࣬����ģ�⡰ѧ�������������������ɲ��֣�
 * 
 * ���ԣ���ʲô����
 * 1. ����
 * 2. ����
 * ��Ϊ������ʲô����
 * 1. �Է�
 * 2. ˯��
 * 3. ѧϰ
 * 
 * ��Ӧ��Java���൱�У�
 * ��Ա���������ԣ���
 * String name; // ����
 * int age; // ����
 * ��Ա��������Ϊ����
 * public void eat() {} // �Է�
 * public void sleep() {} // ˯��
 * public void study() {} //ѧϰ
 * 
 * ע�����
 * 1. ��Ա������ֱ�Ӷ������൱�еģ��ڷ������
 * 2. ��Ա������Ҫдstatic�ؼ���
 */
public class Student {
	// ��Ա����
	String name; // ����
	int age; // ����
	
	// ��Ա����
	public void eat() {
		System.out.println("�Է�����");
	}
	
	public void sleep() {
		System.out.println("˯������");
	}
	
	public void study() {
		System.out.println("ѧϰ��");
	}
}