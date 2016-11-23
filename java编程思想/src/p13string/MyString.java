package p13string;
/*
 * �ַ�����ϰ��
 */

public class MyString {
	//ģ��һ��trim������ȥ���ַ������˵Ŀո�
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
	
	//���ַ���ָ��λ�ý��з�ת
	public static String reverse(String str, int bIndex, int eIndex){
		char[] srr = str.toCharArray();
		for(int i=bIndex,j=eIndex;i<j;i++,j--){
			char c = srr[i];
			srr[i] = srr[j];
			srr[j] = c;
		}
		return String.valueOf(srr);
		
	}

	//��ȡһ���ַ�������һ���ַ����г��ֵĴ���
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
	
	//��ȡ�����ַ����������ͬ�Ӵ� ������"abcwerthelloyuiodef"��"cvhellobnm"
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
