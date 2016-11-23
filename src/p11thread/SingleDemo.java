package p11thread;

/*
 * Single中getInstance获取单例存在安全隐患,如果用synchronized修饰getInstance方法，则性能会越低
 * 双重判断加同步代码块
 */

class Single {
	private static Single s = null;
	private Single(){}
	public static Single getInstance(){
		if(s == null){
			synchronized(Single.class){
				if(s == null){
					s = new Single();
				}
			}
		}
		return s;
	}
}

public class SingleDemo {

	public static void main(String[] args) {
		

	}

}
