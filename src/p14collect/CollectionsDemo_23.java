package p14collect;

import java.util.*;

/*
 * ���Ͽ�ܵĹ����ࣨCollections��
 * --sort(list) ����
 * --max(list)  ���ֵ
 * --binarySearch(list, key) ͨ�����ַ�����ָ��ֵ
 * --fill(list, replaceKey)  ���������ȫ��Ԫ���滻ΪreplaceKey
 * --replaceAll(list, oldVal, newVal) �������еľ�ֵoldVal�滻Ϊ��ֵnewVal
 * --reverse  ������Ԫ�ط�ת
 * --reverseOrder  ���Ƚ�����ת�Ƚ�
 * --swap(list,i,j) �û�����i��jλ���ϵ�����Ԫ��
 * --shuffle(list)  ������Ԫ�������������һ��
 */

public class CollectionsDemo_23 {
	public static void testCollectionsFn(){
		List<String> list = new ArrayList<String>();
		list.add("abjdh");
		list.add("aa");
		list.add("08jhdd");
		
		//sort
		System.out.println(list); //[abjdh, aa, 08jhdd]
		Collections.sort(list);
		System.out.println(list); //[08jhdd, aa, abjdh]
		Collections.sort(list,new StrLenDomparator());
		System.out.println(list); //[aa, abjdh, 08jhdd]
		
		//max
		System.out.println("max:"+Collections.max(list)); //max:abjdh
		System.out.println("max:"+Collections.max(list,new StrLenDomparator())); //max:08jhdd
		
		//binarySearch ��������򷵻�����ֵ�����򷵻�-(����ֵλ��)-1
		System.out.println(Collections.binarySearch(list, "aa"));  //0
		System.out.println(Collections.binarySearch(list, "daa"));  //-4
		
		//fill
		Collections.fill(list, "ff");
		System.out.println(list); //[ff, ff, ff]
		
		//��������³�Ա
		list.add("hello");
		list.add("world");
		
		//replaceAll
		Collections.replaceAll(list, "ff","zz");
		System.out.println(list); //[zz, zz, zz, hello, world]
		
		//reverse
		Collections.reverse(list);
		System.out.println(list);  //[world, hello, zz, zz, zz]
		
		//swap
		Collections.swap(list, 0, 1);
		System.out.println(list); //[hello, world, zz, zz, zz]
		
		//shuffle
		Collections.shuffle(list);
		System.out.println(list); //[zz, zz, world, hello, zz]
	}
	
	//��תreverseOrder
	static void orderDemo(){
		//TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		//�����ַ�����������
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenDomparator()));
		ts.add("adkls");
		ts.add("aak");
		ts.add("bb");
		ts.add("g");
		
		//System.out.println(ts); //[g, bb, adkls, aak]
		System.out.println(ts);  //�����ַ������������������ [adkls, aak, bb, g]
	}

	public static void main(String[] args) {
		testCollectionsFn();
		//orderDemo();
	}

}
class StrLenDomparator implements Comparator<String> {

	public int compare(String o1, String o2) {
		if(o1.length()>o2.length()){
			return 1;
		}else if(o1.length()<o2.length()){
			return -1;
		}else {
			return 0;
		}
	}
	
}
