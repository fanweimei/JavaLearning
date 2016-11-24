package p14collect;
//���Ͷ����ڽӿ���
interface Inter<T> {
	public void show(T t);
}

//��һ�������ʵ�ֽӿڵ�����֪������
class InterImp1 implements Inter<String> {
	public void show(String t){
		System.out.println("I am know T in my class--"+t);
	}
}
//�ڶ��������ʵ�ֽӿڵ�����Ҳ��֪��ʲô����
class InterImp2<T> implements Inter<T>{
	public void show(T t){
		System.out.println("I am do not know everything--"+t.toString());
	}
}

public class GenericDemo5_15 {

	public static void main(String[] args) {
		//����
		InterImp1 it1 = new InterImp1();
		it1.show("yes");
		
		InterImp2<Integer> it2 = new InterImp2<Integer>();
		it2.show(0);

	}

}
