package oop;

public class LoanAccount implements IRate {

	
	@Override
	public void setRate() {
		System.out.println("Rate set");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increasing rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting term to: " + term + "years" );
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammoritization schedule");
	}

}
