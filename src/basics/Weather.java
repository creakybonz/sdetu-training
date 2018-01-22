package basics;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature = 67;
		String sunCondition = "Sunny";
		
		if (temperature >= 80) {
			System.out.println("It's pleasant. Wear shorts and a t-shirt");
		} 
		else if (temperature > 60 && sunCondition == "Sunny") {
			System.out.println("It's a bit cooler. Perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat to block the sun");
		}
		else {
			System.out.println("It's cold out, dress warm.");
		}
	}

}
