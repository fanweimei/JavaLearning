package p14collect;
/*
 * ʲôʱ���巺�ͣ�����Ҫ������Ӧ���������Ͳ���ȷ��ʱ��
 * ���ڶ���Object�������չ�����ڶ��巺���������չ��
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
