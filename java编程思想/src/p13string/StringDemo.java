package p13string;


public class StringDemo {

	public static void main(String[] args) {
		String s1 = "abc"; //s1��һ���������ַ�����"abc"��һ�������ַ������ص㣺һ������ʼ���˾Ͳ����Ա��ı�
		String s2 = new String("abc");
		/*
		 * s1��s2������s1���ڴ�����һ������s2���ڴ�������������
		 */
		String s3 = "abc";
		System.out.println(s1 == s3);
		
		String s = "abcdefdabghhjs";
		
		//��ȡ�ַ����ĳ���
		System.out.println(s.length());
		
		//����λ�û�ȡλ���ϵ�ĳ���ַ�
		System.out.println(s.charAt(0));
		
		//�����ַ���ȡ����
		System.out.println(s.indexOf('a'));
		
		//��ָ��λ�û�ȡ�ַ�����
		System.out.println(s.indexOf('a', 1));
		
		//�����ַ�����ȡ����
		System.out.println(s.indexOf("bc"));
		
		//��������
		System.out.println(s.lastIndexOf('d'));
		
		System.out.println("---------------�ж�----------------");
		
		//�ж��ַ����Ƿ�Ϊ��
		System.out.println(s.isEmpty());
		
		//�ж��ļ��Ƿ���ab��ͷ
		System.out.println(s.startsWith("ab"));
		
		//�ж��ļ��Ƿ���s��β
		System.out.println(s.endsWith("s"));
		
		//�ж��ļ��Ƿ����def
		System.out.println(s.contains("def"));
		
		//�ж��ַ����������Ƿ���ͬ
		System.out.println(s.equals("abscd"));
		
		//�ж��ַ����������Ƿ���ͬ�������Դ�Сд
		System.out.println(s.equalsIgnoreCase("abdcF"));
		
		System.out.println("---------------ת��----------------");
		
		//���ַ�����תΪ�ַ���
		char[] crr = {'a','b','c','d'};
		String s11 = new String(crr);
		String s12 = new String(crr,1,3);  //��1��ʼ��ȡ�����ַ�
		String s13 = String.copyValueOf(crr);
		
		//���ַ���תΪ�ַ�����
		char[] crr2 = s.toCharArray();
		
		//��������������תΪ�ַ���
		String s14 = String.valueOf(5.6f);
		System.out.println(s14);
		
		//���ֽ�����תΪ�ַ���
		byte[] brr = {5,6,6,2};
		String s15 = new String(brr);
		
		//���ַ���תΪ�ֽ�����
		byte[] brr2 = s.getBytes();
		
		System.out.println("---------------�滻----------------");
		
		//�滻,replace��������ı�ԭ�����ַ���
		String ss = s.replace('a', 'k');
		System.out.println(s);
		System.out.println(ss);
		String ss2 = s.replace("ab", "mm");
		System.out.println(ss2);
		
		System.out.println("---------------�и�----------------");
		String sq = "fanfan,zz,yy";
		String[] srr = sq.split(",");
		System.out.println(srr.length);
		
		System.out.println("---------------�Ӵ�----------------");
		String subs = s.substring(1,3);
		System.out.println(subs);
		
		System.out.println("---------------ת����ȥ���ո񡢱Ƚ�----------------");
		//���ַ���תΪ��д��Сд
		System.out.println(s.toUpperCase());
		
		//���ַ������˵Ķ���ո�ȥ��
		String s21 = "   he llo    ";
		String s22 = s21.trim();
		System.out.println("["+s21+"]");
		System.out.println("["+s22+"]");
		
		//�������ַ���������Ȼ˳��ıȽ�
		String s31 = "aaa";
		String s32 = "abd";
		System.out.println(s31.compareTo(s32));
		

	}

}
