package p13string;
/*
 * ������������
 * 
 * ��������ת�����װ�������ã�
 * 1.�������ͺ��ַ���֮��ת��
 * תΪ�ַ�����������������.toString(������������ֵ��
 * �ַ���תΪ���������ࣺparseInt()  xxx.parseXxx(str)
 * 
 * JDK1.5�汾�Ժ���ֵ�������
 */

public class BaseDemo {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("45")+5);
		//����֮���ת��
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.parseInt("110",2));
		
		Integer x = new Integer("123");
		Integer y = new Integer(123);
		System.out.println(x.equals(y));
		
		System.out.println(x.compareTo(y));;
		
	}

}
