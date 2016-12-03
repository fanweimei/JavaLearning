package p14collect;
/*
 * JDK1.5版本出现的新特性
 * 可变参数：扩展符...
 * 在使用时的注意事项：要放在参数的最后
 */
public class ParamMethodDemo_26 {
	static void show(String str,int ...param){
		System.out.println(param.length+" "+param[0]+str);
	}

	public static void main(String[] args) {
		show("a",3);
		show("bb",7,8);
		show("cc",89,0,8);

	}

}
