package testContorlFlow;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test01 t1 = new Test01();
		System.out.println("난이도 1");
		t1.run("A", 5);
		System.out.println("난이도 2");
		t1.run2("A", 5);
		System.out.println("난이도 3");
		t1.run3("A", 5);
		System.out.println("난이도 3.5");
		t1.run4("A", 5);
		System.out.println("난이도 3.6");
		t1.run5("A", 8);
		System.out.println("난이도 3.8");
		t1.run6("A", 5);
		System.out.println("난이도 5");
		t1.run8("A", 7);
		System.out.println("난이도 5.5");
		t1.run9("X", 5);
		System.out.println("난이도 5.7");
		t1.run10("A", 6);
		System.out.println("난이도 6");
		t1.run11("A", 6);
	}

}
