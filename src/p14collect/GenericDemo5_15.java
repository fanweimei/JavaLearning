package p14collect;
//泛型定义在接口上
interface Inter<T> {
	public void show(T t);
}

//第一种情况，实现接口的子类知道类型
class InterImp1 implements Inter<String> {
	public void show(String t){
		System.out.println("I am know T in my class--"+t);
	}
}
//第二种情况，实现接口的子类也不知道什么类型
class InterImp2<T> implements Inter<T>{
	public void show(T t){
		System.out.println("I am do not know everything--"+t.toString());
	}
}

public class GenericDemo5_15 {

	public static void main(String[] args) {
		//测试
		InterImp1 it1 = new InterImp1();
		it1.show("yes");
		
		InterImp2<Integer> it2 = new InterImp2<Integer>();
		it2.show(0);

	}

}
