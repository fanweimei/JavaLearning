package p07;

public class TestBed {
	TestBed() {}
	  void f() { System.out.println("f()"); }
	  public static class Tester {
	    public static void main(String[] args) {
	      TestBed t = new TestBed();
	      t.f();
	    }
	  }
}
