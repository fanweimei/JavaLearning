package p07;

abstract class Contents {
	abstract public int value();
}

interface Destination {
	String readLabel();
}

public class Parcel2 {
	private static class SubContents extends Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	protected static class SubDestination implements Destination {
		private String label;
		private SubDestination(String to){
			label = to;
		}
		public String readLabel() {
			System.out.print(label);
			return label;
		}
	}
	public Destination dest(String s){
		return new SubDestination(s);
	}
	public static Contents cont() {
		return new SubContents();
	}
	
	public static void main(String[] args){
		
		Contents c = cont();
//		Destination d = dest("gz");
//		d.readLabel();
//		Destination d2 = dest("bj");
//		d2.readLabel();
		Parcel2 p2 = new Parcel2();
		Destination d3 = p2.dest("sh");
		d3.readLabel();
		
	}

}
