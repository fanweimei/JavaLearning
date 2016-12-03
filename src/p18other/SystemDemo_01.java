package p18other;

import java.util.*;

/*
 * System:类中的方法和属性都是静态的
 * out:标准输出
 * in:标准输入
 * 
 * getProperties()获取系统属性信息
 * setProperties
 */

public class SystemDemo_01 {

	public static void main(String[] args) {
		Properties prop = System.getProperties();
		for(Object key: prop.keySet()){
			System.out.println(key+"----"+prop.get(key));
		}

	}

}
