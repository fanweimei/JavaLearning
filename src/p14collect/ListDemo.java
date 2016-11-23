package p14collect;

import java.util.*;

/*
 * List和Set的区别:
 * List: 无序、允许重复
 * Set:有序，不允许重复
 * 
 * List:
 * 	特有方法:凡是可以操作角标的方法都是该体系特有的方法
 * 
 * 增：remove(index)
 * 改：set(index,element)
 * 查：get(index);subList(from,to);ListIterator()
 */

public class ListDemo {
	//List独有的方法
	public static void list_unique_fn(){
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("01");
		al.add("02");
		al.add("03");
		System.out.println(al);
		
		//在指定位置添加元素
		al.add(1,"001");
		System.out.println(al);
		
		//删除制定位置的元素
		al.remove(1);
		System.out.println(al);
		
		//修改元素
		al.set(0, "000");
		
		//通过角标获取元素
		System.out.println(al.get(0));
		
		//获取所有元素
		for(int i=0; i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		//获取对象位置
		System.out.println(al.indexOf("02"));
		
		//获取子集合
		List subAl = al.subList(0, 2);
		System.out.println(subAl);
	}

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//添加元素
		al.add("01");
		al.add("02");
		al.add("03");
		
		//在迭代过程中，准备添加或者删除元素
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("000")){
				al.add("00");
			}
		}
		System.out.println(al);
	}

}
