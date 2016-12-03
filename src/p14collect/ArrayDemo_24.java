package p14collect;

import java.util.*;

/*
 * Arrays用于操作数组的工具类
 */

public class ArrayDemo_24 {
	//数组变集合
	static void arrayToList(){
		String[] arr = {"aa","cc","bb"};
		System.out.println(Arrays.toString(arr)); //[aa, cc, bb]
		List<String> list = Arrays.asList(arr); 
		System.out.println(list); //[aa, cc, bb]
		/*
		 * 可以将数组变成集合，不可以使用集合的增删方法，因为数组的长度是固定的，其它方法可以使用
		 * list.add("dd");
		 * System.out.println(list); //报出异常UnsupportedOperationException
		 */
		
		/*
		 * 如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素
		 * 如果数组中的元素都是基本数据类型，那么会将该数组本身作为集合中的元素存在。
		 * int[] nums = {3,4,4,8};
		 * List li = Arrays.asList(nums);
		 * System.out.println(li); //[[I@15db9742]
		 */
		Integer[] nums = {3,4,4,8};
		List<Integer> li = Arrays.asList(nums);
		System.out.println(li); //[3, 4, 4, 8]
	}
	
	//集合变数组
	static void listToArray(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("ab");
		al.add("ac");
		al.add("kb");
		
		/*
		 * 指定类型的数组到底要定义多长呢?
		 * 当指定类型的数组长度小于集合的size，那么该方法内部会创建一个新的数组。
		 * 长度为集合的size。当指定类型的数组长度大于了集合的size，就不会创建了数组。
		 * 而是使用传递进来的数组。所以创建一个刚刚好的数组最优。
		 * 
		 * 将集合变为数组的原因：为了限定对元素的操作。
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
