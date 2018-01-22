package basics;

public class LabB {

	public static void main(String[] args) {
		System.out.println(fact(10));

	}
	
	public static int fact(int n) {
		int factorial;
		if(n == 0 || n == 1) {
			factorial = 1;
		} else {
			factorial = fact(n -1) * n;
		}
		
		
		return factorial;
	}

}
