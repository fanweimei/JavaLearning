package p14collect;
/*
 * 什么时候定义泛型：当类要操作的应用数据类型不正确的时候
 * 早期定义Object来完成扩展，现在定义泛型来完成扩展。
 */

class Worker {
	
}
class Tool<QQ> {
	private QQ w;
	public void setObject(QQ w){
		this.w = w;
	}
	public QQ getObject() {
		return w;
	}
}

public class GenericDemo3_13 {

	public static void main(String[] args) {
		Tool<Worker> t = new Tool<Worker>();
		t.setObject(new Worker());
		System.out.println(t.getObject());
	}

}
