package p07;

public class Parcel1 {
	public Wrapping wrap(int x,final String name,final float price){
		return new Wrapping(x) {
			private String label = name;
			private int cost;
			{
				cost = Math.round(price);
				if(cost>100){
					System.out.println("over");;
				}
			}
			public int value(){
				return super.value()*2;
			}
			public void showName(){
				System.out.println(label);
			}
		};
	}

	public static void main(String[] args) {
		Parcel1 p1 = new Parcel1();
		Wrapping w = p1.wrap(10,"fanfanf",120);
		System.out.print(w.value());
		

	}

}
