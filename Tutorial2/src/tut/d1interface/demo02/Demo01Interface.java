package tut.d1interface.demo02;

/*
 * ʹ�ýӿڵ�ʱ����Ҫע�⣺
 * 1. �ӿ���û�о�̬�����Ļ��߹��췽����
 * 2. һ�����ֱ�Ӹ�����Ψһ�ģ�����һ�������ͬʱʵ�ֶ���ӿ�
 * ��ʽ��
 * public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB {
 *     // ������д���г��󷽷�
 * }
 * 3. ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ��ĳ��󷽷�����ôֻ��Ҫ������дһ�μ���
 * 4. ���ʵ����û�и�����д���нӿڵ��е����г��󷽷�����ôʵ����ͱ����Ǹ�������
 * 5. ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ���Ĭ�Ϸ�������ôʵ����һ��Ҫ��ͻ��Ĭ�Ϸ������и�����д
 * 6. һ�������ֱ�Ӹ��൱�еķ������ͽӿڵ��е�Ĭ�Ϸ��������˳�ͻ �������ø��൱�еķ���
 */
public class Demo01Interface {

	public static void main(String[] args) {
		Son son = new Son();
		son.method(); // ���෽��
	}
}