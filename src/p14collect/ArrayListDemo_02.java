package p14collect;

import java.util.*;

/*
 * List��Set������:
 * List: �洢˳�򰴲����˳��洢�������ظ�
 * Set:���򣬲������ظ�
 * 
 * List���ࣺ
 * 	--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ٶȿ죬������ɾ�����ǲ�ͬ����
 *  --LinkedList:�ײ�ʹ�õ����������ݽṹ���ص㣺��ɾ�ٶȺܿ죬��ѯ����
 * 	--vector:�ײ����������ݽṹ����ͬ���ģ���ArrayList���
 * 
 * List:
 * 	���з���:���ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ���
 * 
 * ����remove(index)
 * �ģ�set(index,element)
 * �飺get(index);subList(from,to);ListIterator()
 * 
 * List�������еĵ�������ListIterator��Iterator���ӽӿ�
 * �ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ��
 * ��Ϊ�ᷢ���쳣
 * ���ԣ��ڵ�����ʱ��ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
 * �����Ҫ�����Ĳ���������ӡ��޸ĵȣ�����Ҫʹ�����ӽӿڣ�ListIterator
 * �ýӿ�ֻ��ͨ��List���ϵ�ListIterator������ȡ��
 */

public class ArrayListDemo_02 {
	//List���еķ���
	public static void list_unique_fn(){
		ArrayList al = new ArrayList();
		
		//���Ԫ��
		al.add("01");
		al.add("02");
		al.add("03");
		System.out.println(al);  //[01, 02, 03]
		
		//��ָ��λ�����Ԫ��
		al.add(1,"001");
		System.out.println(al);  //[01, 001, 02, 03]
		
		//ɾ���ƶ�λ�õ�Ԫ��
		al.remove(1);
		System.out.println(al);  //[01, 02, 03]
		
		//�޸�Ԫ��
		al.set(0, "000");
		
		//ͨ���Ǳ��ȡԪ��
		System.out.println(al.get(0));  //000
		
		//��ȡ����Ԫ��
		for(int i=0; i<al.size();i++){
			System.out.print(al.get(i)+" ");  //000 02 03
		}
		System.out.println();
		
		//��ȡ����λ��
		System.out.println(al.indexOf("02"));  //1
		
		//��ȡ�Ӽ���
		List subAl = al.subList(0, 2);
		System.out.println(subAl);  //[000, 02]
	}
	
	//���ͨ��Iterator�����ӿڣ����ڱ���������ʹ��add�������ͻ᷵��ConcurrentModificationException����Ϊ�����������ڰ�ȫ����
	static void iteratorForProblem (){

		ArrayList al = new ArrayList();
		//���Ԫ��
		al.add("01");
		al.add("02");
		al.add("03");
		
		//�ڵ��������У�׼����ӻ���ɾ��Ԫ��
		Iterator it = al.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			if(obj.equals("01")){
				//al.add("05"); //�ᷢ���쳣
				it.remove();  //��01�����ôӼ�����ɾ��
			}
		}
		System.out.println(al);  //[02, 03]
	}
	
	//List���϶��еĽӿ�ListIterator,�ڱ����ӿ�ʱ�������޸ġ���ӵȲ���
	static void listIteratorForList(){
		ArrayList al = new ArrayList();
		//���Ԫ��
		al.add("01");
		al.add("02");
		al.add("03");
		
		ListIterator lt = al.listIterator();
		//�������
		while(lt.hasNext()){
			Object obj = lt.next();
			if(obj.equals("01")){
				lt.set("001");  //�޸�  set����Ҫд��addǰ
				lt.add("05");  //���
			}
		}
		System.out.println(al);  //[001, 05, 02, 03]
		
		//�������
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
