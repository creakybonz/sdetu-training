package basics;

public class LabA {

	public static void main(String[] args) {
		System.out.println(sums(4));

	}
	
	public static int sums(int n) {
		int sum;
		if(n == 1) {
			sum = 1;
		} else {
			sum = sums(n-1) + n;
		}
		return sum;
	}

}
