package p13string;


public class StringDemo {

	public static void main(String[] args) {
		String s1 = "abc"; //s1是一个类类型字符串，"abc"是一个对象，字符最大的特点：一旦被初始化了就不可以被改变
		String s2 = new String("abc");
		/*
		 * s1和s2的区别：s1在内存中有一个对象，s2在内存中有两个对象
		 */
		String s3 = "abc";
		System.out.println(s1 == s3);
		
		String s = "abcdefdabghhjs";
		
		//获取字符串的长度
		System.out.println(s.length());
		
		//根据位置获取位置上的某个字符
		System.out.println(s.charAt(0));
		
		//根据字符获取索引
		System.out.println(s.indexOf('a'));
		
		//从指定位置获取字符索引
		System.out.println(s.indexOf('a', 1));
		
		//根据字符串获取索引
		System.out.println(s.indexOf("bc"));
		
		//反向索引
		System.out.println(s.lastIndexOf('d'));
		
		System.out.println("---------------判断----------------");
		
		//判断字符串是否为空
		System.out.println(s.isEmpty());
		
		//判断文件是否以ab开头
		System.out.println(s.startsWith("ab"));
		
		//判断文件是否以s结尾
		System.out.println(s.endsWith("s"));
		
		//判断文件是否包含def
		System.out.println(s.contains("def"));
		
		//判断字符串的内容是否相同
		System.out.println(s.equals("abscd"));
		
		//判断字符串的内容是否相同，并忽略大小写
		System.out.println(s.equalsIgnoreCase("abdcF"));
		
		System.out.println("---------------转化----------------");
		
		//将字符数组转为字符串
		char[] crr = {'a','b','c','d'};
		String s11 = new String(crr);
		String s12 = new String(crr,1,3);  //从1开始，取三个字符
		String s13 = String.copyValueOf(crr);
		
		//将字符串转为字符数组
		char[] crr2 = s.toCharArray();
		
		//将基本数据类型转为字符串
		String s14 = String.valueOf(5.6f);
		System.out.println(s14);
		
		//将字节数组转为字符串
		byte[] brr = {5,6,6,2};
		String s15 = new String(brr);
		
		//将字符串转为字节数组
		byte[] brr2 = s.getBytes();
		
		System.out.println("---------------替换----------------");
		
		//替换,replace方法不会改变原来的字符串
		String ss = s.replace('a', 'k');
		System.out.println(s);
		System.out.println(ss);
		String ss2 = s.replace("ab", "mm");
		System.out.println(ss2);
		
		System.out.println("---------------切割----------------");
		String sq = "fanfan,zz,yy";
		String[] srr = sq.split(",");
		System.out.println(srr.length);
		
		System.out.println("---------------子串----------------");
		String subs = s.substring(1,3);
		System.out.println(subs);
		
		System.out.println("---------------转化、去除空格、比较----------------");
		//将字符串转为大写或小写
		System.out.println(s.toUpperCase());
		
		//将字符串两端的多个空格去除
		String s21 = "   he llo    ";
		String s22 = s21.trim();
		System.out.println("["+s21+"]");
		System.out.println("["+s22+"]");
		
		//将两个字符串进行自然顺序的比较
		String s31 = "aaa";
		String s32 = "abd";
		System.out.println(s31.compareTo(s32));
		

	}

}
