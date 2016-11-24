package p14collect;

import java.util.*;

/*
 * Set:元素不可重复，（存入顺序和取出顺序不一致）
 *  --HashSet：底层是哈希表数据结构，存储时是按照hash值来存储的
 *  	HashSet是如何保证元素唯一性的呢？
 *  	是通过元素的两个方法，hashCode和equals来完成
 *  	如果元素的hashCode值相同，才会判断equals是否为true
 *  	如果元素的hashCode值不同，不会调用equals
 *  	contains和remove方法也是依赖hashCode和equals
 *  --TreeSet
 * Set集合的功能和Collection是一致的
 */

public class HashSetDemo_07 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("h01");
		hs.add("h04");
		hs.add("h02");
		hs.add("h01");
		System.out.println(hs);  //[h01, h02, h04]
	}

}
