package staticNonstatic;

public class Example1 {

	public static void main(String[] args) {
	Example1 obj = new Example1();	
    obj.Add(3, 4);
	}
	public int Add(int a, int b){
		int c;
		c = a+b;
		System.out.println(c);
		return c;
	}

}


