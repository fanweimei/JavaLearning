package p07;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private Object[] o;
	private int next = 0;
	public Sequence(int size){
		o = new Object[size];
	}
	public void add(Object x) {
		if(next < o.length){
			o[next] = x;
			next++;
		}
	}
	
	private class SubSelector implements Selector {
		int i = 0;

		public boolean end() {
			// TODO Auto-generated method stub
			return i == o.length;
		}

		public Object current() {
			// TODO Auto-generated method stub
			return o[i];
		}

		public void next() {
			if(i < o.length){
				i++;
			}
			
		}
		
	}
	public Selector getSelector(){
		return new SubSelector();
	}

	
	public static void main(String[] args) {
		Sequence s = new Sequence(10);
		for(int i = 0; i<10; i++){
			s.add(Integer.toString(i));
		}
		Selector s1 = s.getSelector();
		while(!s1.end()){
			System.out.println(s1.current());
			s1.next();
		}

	}

}

