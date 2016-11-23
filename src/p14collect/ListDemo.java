package p14collect;

import java.util.*;

/*
 * List��Set������:
 * List: ���������ظ�
 * Set:���򣬲������ظ�
 * 
 * List:
 * 	���з���:���ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ���
 * 
 * ����remove(index)
 * �ģ�set(index,element)
 * �飺get(index);subList(from,to);ListIterator()
 */

public class ListDemo {
	//List���еķ���
	public static void list_unique_fn(){
		ArrayList al = new ArrayList();
		
		//���Ԫ��
		al.add("01");
		al.add("02");
		al.add("03");
		System.out.println(al);
		
		//��ָ��λ�����Ԫ��
		al.add(1,"001");
		System.out.println(al);
		
		//ɾ���ƶ�λ�õ�Ԫ��
		al.remove(1);
		System.out.println(al);
		
		//�޸�Ԫ��
		al.set(0, "000");
		
		//ͨ���Ǳ��ȡԪ��
		System.out.println(al.get(0));
		
		//��ȡ����Ԫ��
		for(int i=0; i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		//��ȡ����λ��
		System.out.println(al.indexOf("02"));
		
		//��ȡ�Ӽ���
		List subAl = al.subList(0, 2);
		System.out.println(subAl);
	}

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		//���Ԫ��
		al.add("01");
		al.add("02");
		al.add("03");
		
		//�ڵ��������У�׼����ӻ���ɾ��Ԫ��
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
