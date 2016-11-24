package p14collect;

import java.util.*;

public class GenericDemo2_12 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>(new LenComparator());
		ts.add("a04");
		ts.add("a01");
		ts.add("a02");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}

	}

}

class LenComparator implements Comparator<String> {
	public int compare(String o1,String o2){
		if(o2.length()>o1.length()){
			return 1;
		}else if(o2.length()<o1.length()){
			return -1;
		}else {
			return o2.compareTo(o1);
		}
	}
}
