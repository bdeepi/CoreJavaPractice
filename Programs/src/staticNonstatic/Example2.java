package staticNonstatic;

public class Example2 {

	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.mul(2, 3);
	}
	public int mul(int a, int b){
		int c;
		c = a * b;
		System.out.println(c);
		return c;
		
	}

}
