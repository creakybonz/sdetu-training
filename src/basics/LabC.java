package basics;

public class LabC {

	public static void main(String[] args) {
		int[] n = {5,2,3,6,3,37};
		System.out.println(minimum(n));
		System.out.println(maximum(n));
		System.out.println(average(n));

	}
	
	public static int minimum(int[] n) {
		int min = n[0];
		for(int i = 1; i < n.length; i++) {
			if(n[i] < min) {
				min = n[i];
			}
		}
		
		return min;
	}
	
	public static int maximum(int[] n) {
		int max = 0;
		for(int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
			}
		}
		
		return max;
	}
	
	public static double average(int[] n) {
		double total = 0;
		for(int i = 0; i < n.length; i++) {
			total += n[i];
		}
		
		return (total / n.length);
	}

}
