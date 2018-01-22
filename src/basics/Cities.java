package basics;

public class Cities {

	public static void main(String[] args) {
		//Declare and define an array
		/*
		String[] cities = {"New York", "San Francisco", "Miami", "Dalas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		//Declare array
		String[] countries;
		countries = new String[2];
		countries[0] = "USA";
		countries[1] = "Canada";
		System.out.println(countries[0]);
		*/
		
		
		//Declare & define the array (size only)
		String[] states = new String[5];
		states[0] = "New York";
		states[1] = "California";
		states[2] = "Florida";
		states[3] = "Texas";
		states[4] = "Alaska";
		
		int i = 0;
		//Do loop enters loop and then tests condition
		do {
			System.out.println(states[i]);
			i += 1;
		} while(i<5);
		
		//while loop tests condition and then enters loop
		System.out.println("#####################################################");
		int n = 0;
		boolean stateFound = false;
		while(!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND");
				stateFound = true;
			}
			n++;
		}
		System.out.println("\n###########################################\n");
		// for loop is best structure for itterating though array
		
		for(int x=0; x<=4; x++) {
			System.out.println(states[x]);
		}
		
		

	}

}
