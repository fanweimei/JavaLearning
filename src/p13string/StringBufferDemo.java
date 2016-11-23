package p13string;
/*
 * StringButter���ַ���������
 * ��һ������
 * �����ǿɱ仯��
 * ����ֱ�Ӳ��������������
 * ���տ���ͨ��toString������Ϊ�ַ���
 * 
 * 1.�洢��append  ��ӵ���β��
 * 			insert(index,data)���Խ����ݲ��뵽ָ��λ����
 * 2.ɾ�� delete(start, end)����ͷ������β
 * 		deleteCharAt(index)ɾ��ָ��λ�õ��ַ�
 * 3.��ȡ
 * charAt(index)��ȡ
 * indexOf()
 * lastIndexOf()
 * subString
 * 
 * 4.����
 * replace��start, end, str)
 * setCharAt(index,ch)�滻�ַ�
 * 
 * 5.��ת
 * reverse
 * 
 * 6.����������ָ�����ݴ洢��ָ���ַ�������
 * getChars(int srcBegin, int srcEnd, char[] dst, int toBegin)
 *
 *jdk1.5֮�������StringBuilder
 *StringBuffer���߳�ͬ�������ڶ��߳���
 *StringBuilder���̲߳�ͬ�������ܺã����ڶ��̻߳��Լ������˶��߳�
 *
 *������ԭ��
 *��������
 *����д
 */

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("helo").append(90);
		sb.insert(1, "fanfan ");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		//sb.delete(0, sb.length()); //��ջ�����
		sb.replace(0, 4, "java");
		System.out.println(sb);
		sb.setCharAt(4, '-');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		char[] arr = new char[5];
		sb.getChars(0, 5, arr, 0);
		System.out.println(String.valueOf(arr));
		System.out.println(sb);
	}

}
