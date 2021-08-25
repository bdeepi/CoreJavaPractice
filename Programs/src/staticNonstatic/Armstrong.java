package staticNonstatic;

public class Armstrong {
	
	public static void main(String[] args) {
		
	Armstrong obj = new Armstrong();
	obj.armstrong(34);
	}
	public boolean armstrong(int n){
			int rem = 0, r = 0, temp = n;
			while (n > 0) {
				rem = n % 10;
				r = r + (rem * rem * rem);
				n = n / 10;

			}
			if (temp == r) {
				System.out.println("Armstrong");
				return true;
			} else {
				System.out.println("not Armstrong");
				return false;
			}
			
		}
}






