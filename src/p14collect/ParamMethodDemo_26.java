package p14collect;
/*
 * JDK1.5�汾���ֵ�������
 * �ɱ��������չ��...
 * ��ʹ��ʱ��ע�����Ҫ���ڲ��������
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
