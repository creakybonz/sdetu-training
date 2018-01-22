package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci is defined by the sum of the 2 previous fibonnaci numbers
		for(int i=0; i <= 10; i++) {
			System.out.println(fib(i));
		}
		

	}
	
	public static int fib(int n) {
		int retNum;
		if (n==0) {
			retNum = 0;
		} else if (n==1) {
			retNum = 1;
		} else {
			retNum = (fib(n-1) + fib(n-2));
		}
		
		return retNum;
	}

}
