package tut.demo03.d1static;

/*
 * һ��ʹ��static���γ�Ա��������ô��ͳ�Ϊ�˾�̬����
 * ��̬���������ڶ��󣬶���������
 * 
 * ���û��static�ؼ��֣���ô�������ȴ�������Ȼ�����ͨ������ʹ����
 * �����static�ؼ��֣���ô����Ҫ��������ֱ��ͨ����������ʹ����
 * 
 * �����ǳ�Ա���������ǳ�Ա�������������static�����Ƽ�ʹ�������ƽ��е���
 * ��̬������������.��̬����
 * ��̬������������.��̬����()
 * 
 * ע�����
 * 1. ��̬����ֱ�ӷ��ʷǾ�̬
 * 1.1. ��Ϊ���ڴ浱�У��ǡ��ȡ��о�̬���ݣ������зǾ�̬����
 * 1.2. "���˲�֪�����ˣ����Ǻ���֪������"
 * 2. ��̬�������У�����ʹ��this
 * 2.1. this������ǰ����ͨ��˭���÷�����˭���ǵ�ǰ����
 */
public class Demo02StaticMethod {
	public static void main(String[] args) {
		MyClass obj = new MyClass(); // ���ȴ�������
		// Ȼ�����ʹ��û��static�ؼ��ֵ�����
		obj.method();
//		MyClass.method(); // ����д��
		
		// ���ھ�̬������˵������ͨ�����������е��ã�Ҳ����ֱ��ͨ��������������
		obj.methodStatic(); // ��ȷ�����Ƽ�������д���ڱ���֮��Ҳ��ͨ��javac�����Ϊ ������.��̬������
		MyClass.methodStatic(); // ��ȷ���Ƽ�
		
		// ���ڱ��൱�еľ�̬����������ʡ��������
		myMethod();
		Demo02StaticMethod.myMethod(); // ����һ����ȫ��Ч
	}
	
	public static void myMethod() {
		System.out.println("�Լ��ķ���");
	}
}