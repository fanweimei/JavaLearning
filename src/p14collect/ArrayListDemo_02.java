package p14collect;

import java.util.*;

/*
 * List和Set的区别:
 * List: 存储顺序按插入的顺序存储、允许重复
 * Set:有序，不允许重复
 * 
 * List子类：
 * 	--ArrayList:底层的数据结构使用的是数组结构，特点：查询速度快，但是增删慢，是不同步的
 *  --LinkedList:底层使用的是链表数据结构，特点：增删速度很快，查询稍慢
 * 	--vector:底层是数组数据结构，是同步的，被ArrayList替代
 * 
 * List:
 * 	特有方法:凡是可以操作角标的方法都是该体系特有的方法
 * 
 * 增：remove(index)
 * 改：set(index,element)
 * 查：get(index);subList(from,to);ListIterator()
 * 
 * List集合特有的迭代器：ListIterator是Iterator的子接口
 * 在迭代时，不可以通过集合对象的方法操作集合中的元素
 * 因为会发生异常
 * 所以，在迭代器时，只能对元素进行判断，取出，删除的操作。
 * 如果想要其它的操作比如添加、修改等，就需要使用其子接口，ListIterator
 * 该接口只能通过List集合的ListIterator方法获取。
 */

public class ArrayListDemo_02 {
	//List独有的方法
	public static void list_unique_fn(){
		ArrayList al = new ArrayList();
		
		//添加元素
		al.add("01");
		al.add("02");
		al.add("03");
		System.out.println(al);  //[01, 02, 03]
		
		//在指定位置添加元素
		al.add(1,"001");
		System.out.println(al);  //[01, 001, 02, 03]
		
		//删除制定位置的元素
		al.remove(1);
		System.out.println(al);  //[01, 02, 03]
		
		//修改元素
		al.set(0, "000");
		
		//通过角标获取元素
		System.out.println(al.get(0));  //000
		
		//获取所有元素
		for(int i=0; i<al.size();i++){
			System.out.print(al.get(i)+" ");  //000 02 03
		}
		System.out.println();
		
		//获取对象位置
		System.out.println(al.indexOf("02"));  //1
		
		//获取子集合
		List subAl = al.subList(0, 2);
		System.out.println(subAl);  //[000, 02]
	}
	
	//如果通过Iterator遍历接口，且在遍历过程中使用add方法，就会返回ConcurrentModificationException，因为这样操作存在安全隐患
	static void iteratorForProblem (){

		ArrayList al = new ArrayList();
		//添加元素
		al.add("01");
		al.add("02");
		al.add("03");
		
		//在迭代过程中，准备添加或者删除元素
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("01")){
				//al.add("05"); //会发生异常
				it.remove();  //将01的引用从集合中删除
			}
		}
		System.out.println(al);  //[02, 03]
	}
	
	//List集合独有的接口ListIterator,在遍历接口时，可以修改、添加等操作
	static void listIteratorForList(){
		ArrayList al = new ArrayList();
		//添加元素
		al.add("01");
		al.add("02");
		al.add("03");
		
		ListIterator lt = al.listIterator();
		//正向遍历
		while(lt.hasNext()){
			Object obj = lt.next();
			if(obj.equals("01")){
				lt.set("001");  //修改  set必须要写在add前
				lt.add("05");  //添加
			}
		}
		System.out.println(al);  //[001, 05, 02, 03]
		
		//反向遍历
		while(lt.hasPrevious()){
			System.out.print(lt.previous()+" ");  //03 02 05 001
		}
	}

	public static void main(String[] args) {
		//list_unique_fn();
		//iteratorForProblem ();
		listIteratorForList();
		
	}

}
