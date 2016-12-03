package p14collect;

import java.util.*;

/*
 * 集合框架的工具类（Collections）
 * --sort(list) 排序
 * --max(list)  最大值
 * --binarySearch(list, key) 通过二分法查找指定值
 * --fill(list, replaceKey)  将集合里的全部元素替换为replaceKey
 * --replaceAll(list, oldVal, newVal) 将集合中的旧值oldVal替换为新值newVal
 * --reverse  将集合元素反转
 * --reverseOrder  将比较器反转比较
 * --swap(list,i,j) 置换集合i和j位置上的两个元素
 * --shuffle(list)  将集合元素重新随机排列一次
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
		
		//binarySearch 如果存在则返回索引值，否则返回-(插入值位置)-1
		System.out.println(Collections.binarySearch(list, "aa"));  //0
		System.out.println(Collections.binarySearch(list, "daa"));  //-4
		
		//fill
		Collections.fill(list, "ff");
		System.out.println(list); //[ff, ff, ff]
		
		//添加两个新成员
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
	
	//反转reverseOrder
	static void orderDemo(){
		//TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		//按照字符长度逆序存放
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenDomparator()));
		ts.add("adkls");
		ts.add("aak");
		ts.add("bb");
		ts.add("g");
		
		//System.out.println(ts); //[g, bb, adkls, aak]
		System.out.println(ts);  //按照字符长度逆序的排序结果： [adkls, aak, bb, g]
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
