package p14collect;

/*
 * 静态导入
 */
import static java.util.Arrays.*; //导入的是Array这个类中的所有静态成员

import java.util.Arrays;

public class StaticImport_27 {

	public static void main(String[] args) {
		int[] arr ={8,3,4,1};
		sort(arr);
		//当方法名相同时，需要之低昂具体的对象名或类名
		System.out.println(Arrays.toString(arr));

	}

}
