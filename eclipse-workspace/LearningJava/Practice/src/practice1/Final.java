package practice1;

abstract class Final {
	abstract  void abc(int a,int b);

}

class Demo extends Final{

	@Override
	void abc(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

	/*
	 * void just(int a,int b) { int c = a+b; } void just(int a,int b) {
	 * 
	 * }
	 */
	public static void main(String args[]) {
		Final f = new Demo();
		f.abc(2,3);
	}
}