package p14collect;

import java.util.*;

/*
 * map集合：该集合存储键值对，且保证键名唯一性
 * 1.添加  put(k,v), putAll(map)
 * 2.删除  clear  remove(key)
 * 3.判断  containsValue(v)  containsKey(k)  isEmpty()
 * 4.获取  get(k) size()  values()  /entrySet()  keySet()
 * 
 * Map分类
 * 	--Hashtable: 底层是哈希结构，不可以存入null键null值，是同步
 *  --HashMap：底层是哈希结构，允许使用null键null值，是不同步的，比Hashtable效率高
 *  --TreeMap：底层是二叉树数据结构，不同步，按照键来排序存储
 */

public class MapDemo_18 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
		System.out.println(map.put("01", "zs")); //null
		System.out.println(map.put("01", "ha"));  //zs 添加相同的键，覆盖原来的值，并将原来的值返回
		map.put("02", "ls");
		map.put("03", "ww");
		System.out.println(map.containsKey("02")); //true
		map.remove("02");
		System.out.println(map); //{01=zs, 03=ww}
		map.put(null, "none");
		System.out.println(map.get(null)); //none
		map.put("00", null);
		System.out.println(map.get("00")); //null
		
		//获取Map集合中的所有的值
		Collection<String> val = map.values();
		System.out.println(val); //[none, null, zs, ww]  无序
		
	}

}
