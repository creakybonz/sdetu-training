package basics;



public class SalaryCalculator {
	public static void main(String[] args){
		// create a variable to define carreer
		
		// Declare variable
		String career;
		System.out.println("Program is starting");
		career = "Software Developer";
		System.out.println("My career is " + career);
		
		//declare and define
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		double rate = 42.73;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of " + String.format("%.2f", rate) + " per hour is $" + String.format("%.2f", salary) + " per year\n");
		
		//compute annual salary
		//rate * hoursPerWeek * weeksPerYear
	}
}
