package p14collect;

import java.util.*;

/*
 * map���ϣ��ü��ϴ洢��ֵ�ԣ��ұ�֤����Ψһ��
 * 1.���  put(k,v), putAll(map)
 * 2.ɾ��  clear  remove(key)
 * 3.�ж�  containsValue(v)  containsKey(k)  isEmpty()
 * 4.��ȡ  get(k) size()  values()  /entrySet()  keySet()
 * 
 * Map����
 * 	--Hashtable: �ײ��ǹ�ϣ�ṹ�������Դ���null��nullֵ����ͬ��
 *  --HashMap���ײ��ǹ�ϣ�ṹ������ʹ��null��nullֵ���ǲ�ͬ���ģ���HashtableЧ�ʸ�
 *  --TreeMap���ײ��Ƕ��������ݽṹ����ͬ�������ռ�������洢
 */

public class MapDemo_18 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		System.out.println(map.put("01", "zs")); //null
		System.out.println(map.put("01", "ha"));  //zs �����ͬ�ļ�������ԭ����ֵ������ԭ����ֵ����
		map.put("02", "ls");
		map.put("03", "ww");
		System.out.println(map.containsKey("02")); //true
		map.remove("02");
		System.out.println(map); //{01=zs, 03=ww}
		map.put(null, "none");
		System.out.println(map.get(null)); //none
		map.put("00", null);
		System.out.println(map.get("00")); //null
		
		//��ȡMap�����е����е�ֵ
		Collection<String> val = map.values();
		System.out.println(val); //[none, null, zs, ww]  ����
		
	}

}
