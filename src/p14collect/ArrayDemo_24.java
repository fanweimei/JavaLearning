package p14collect;

import java.util.*;

/*
 * Arrays���ڲ�������Ĺ�����
 */

public class ArrayDemo_24 {
	//����伯��
	static void arrayToList(){
		String[] arr = {"aa","cc","bb"};
		System.out.println(Arrays.toString(arr)); //[aa, cc, bb]
		List<String> list = Arrays.asList(arr); 
		System.out.println(list); //[aa, cc, bb]
		/*
		 * ���Խ������ɼ��ϣ�������ʹ�ü��ϵ���ɾ��������Ϊ����ĳ����ǹ̶��ģ�������������ʹ��
		 * list.add("dd");
		 * System.out.println(list); //�����쳣UnsupportedOperationException
		 */
		
		/*
		 * ��������е�Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ��
		 * ��������е�Ԫ�ض��ǻ����������ͣ���ô�Ὣ�����鱾����Ϊ�����е�Ԫ�ش��ڡ�
		 * int[] nums = {3,4,4,8};
		 * List li = Arrays.asList(nums);
		 * System.out.println(li); //[[I@15db9742]
		 */
		Integer[] nums = {3,4,4,8};
		List<Integer> li = Arrays.asList(nums);
		System.out.println(li); //[3, 4, 4, 8]
	}
	
	//���ϱ�����
	static void listToArray(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("ab");
		al.add("ac");
		al.add("kb");
		
		/*
		 * ָ�����͵����鵽��Ҫ����೤��?
		 * ��ָ�����͵����鳤��С�ڼ��ϵ�size����ô�÷����ڲ��ᴴ��һ���µ����顣
		 * ����Ϊ���ϵ�size����ָ�����͵����鳤�ȴ����˼��ϵ�size���Ͳ��ᴴ�������顣
		 * ����ʹ�ô��ݽ��������顣���Դ���һ���ոպõ��������š�
		 * 
		 * �����ϱ�Ϊ�����ԭ��Ϊ���޶���Ԫ�صĲ�����
		 */
		
//		String[] arr = al.toArray(new String[2]);
//		System.out.println(Arrays.toString(arr)); //[ab, ac, kb]
		
		String[] arr = al.toArray(new String[5]);
		System.out.println(Arrays.toString(arr)); //[ab, ac, kb, null, null]
	}

	public static void main(String[] args) {
		//arrayToList
		listToArray();
	}

}
