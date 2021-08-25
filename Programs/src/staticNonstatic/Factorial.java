package staticNonstatic;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		 obj.fact(3);
	}
	public int fact(int n){
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact = fact * i;
		}
		System.out.println(fact);
		return fact;
	}

}
