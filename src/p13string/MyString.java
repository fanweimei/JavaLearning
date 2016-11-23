package p13string;
/*
 * 字符串练习题
 */

public class MyString {
	//模拟一个trim方法，去除字符串两端的空格
	public static String imitateTrim(String str){
		int begin = 0;
		int end = str.length();
		int i;
		for(i=0; i<str.length(); i++){
			if(str.charAt(i) != ' '){
				begin = i;
				break;
			}
		}
		if(i == str.length()){
			return "[]";
		}
		for(i=str.length()-1; i>=0; i--){
			if(str.charAt(i) != ' '){
				end = i;
				break;
			}
		}
		return "["+str.substring(begin,end+1)+"]";
	}
	
	//将字符串指定位置进行反转
	public static String reverse(String str, int bIndex, int eIndex){
		char[] srr = str.toCharArray();
		for(int i=bIndex,j=eIndex;i<j;i++,j--){
			char c = srr[i];
			srr[i] = srr[j];
			srr[j] = c;
		}
		return String.valueOf(srr);
		
	}

	//获取一个字符串在另一个字符串中出现的次数
	public static int count(String str,String key){
		int count = 0;
		int i = 0;
		int index = 0;
		while((i=str.indexOf(key,index))!=-1){
			count++;
			index = i+key.length();
		}
		return count;
	}
	
	//获取两个字符串中最大相同子串 ，比如"abcwerthelloyuiodef"和"cvhellobnm"
	public static String maxSameSubstr(String s1,String s2){
		String max,min,sub;
		if(s1.length()>s2.length()){
			max = s1;
			min = s2;
		}else {
			max = s2;
			min = s1;
		}
		int l = min.length();
		for(int i=0; i<l; i++){
			for(int j=0; j<=i; j++){
				sub = min.substring(j,l-i+j);
				if(max.contains(sub)){
					return sub;
				}
			}
		}
		return "";
	}

	public static void main(String[] args) {
		System.out.println(imitateTrim("     hj"));
		System.out.println(reverse("bhelloe",1,5));
		System.out.println(count("abhhkkdhabkkhhabjkaba","ab"));
		
		System.out.println(maxSameSubstr("abcwerthelloyuiodef","cvhellobnm"));

	}

}
