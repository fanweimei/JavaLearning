package p11thread;

/*
 * 
 */

class Res {
	public String color;
	public int index;
	public boolean flag = true;
}

class SetRes implements Runnable{
	static String[] colors = {"red","yello","pink","black","white","purple","orange"};
	Res r;
	SetRes(Res r){
		this.r = r;
	}
	public synchronized void run() {
		while(true){
			synchronized(Res.class){
				if(!this.r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				this.r.index = (int) (Math.random()*SetRes.colors.length);
				this.r.color = SetRes.colors[this.r.index];
				this.r.flag = false;
			}
		}
		
	}
}

class GetRes implements Runnable{
	Res r;
	GetRes(Res r){
		this.r = r;
	}

	public void run() {
		while(true){
			synchronized(Res.class){
				if(!this.r.flag){
					System.out.println(this.r.index+"-->"+this.r.color);
					this.r.flag = true;
					r.notify();
				}
			}
		}
	}
}

public class Comunication {

	public static void main(String[] args) {
		Res r = new Res();
		new Thread(new SetRes(r)).start();
		new Thread(new GetRes(r)).start();

	}

}
