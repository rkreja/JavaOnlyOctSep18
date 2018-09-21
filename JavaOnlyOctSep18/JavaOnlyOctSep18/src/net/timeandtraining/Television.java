package net.timeandtraining;

public class Television {
	
	private boolean turnedOn=false;

	
	public void powerButton() {
		
		if (turnedOn==true) {
			
			System.out.println("Tv is turning off");
			turnedOn=false;
			
		}else {
			
			System.out.println("Tv is turning on");
			turnedOn=true;
		}
		
		
		
	}

}
