package p14collect;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * °´ÕÕ×Ö·û´®³¤¶ÈÅÅÐò
 */

public class TreeSetTest_10 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new StrComparator());
		ts.add("absj");
		ts.add("a");
		ts.add("bg");
		ts.add("ijjkehiheth");
		ts.add("abc");
		System.out.println(ts); //[a, bg, abc, absj, ijjkehiheth]
	}

}
class StrComparator implements Comparator {
	public int compare(Object o1, Object o2){
		String s1 = (String) o1;
		String s2 = (String) o2;
		if(s1.length()>s2.length()){
			return 1;
		}else if(s1.length()<s2.length()){
			return -1;
		}else {
			return s1.compareTo(s2);
		}
	}
}
