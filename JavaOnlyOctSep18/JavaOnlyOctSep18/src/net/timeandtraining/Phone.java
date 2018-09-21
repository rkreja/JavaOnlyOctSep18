package net.timeandtraining;

public class Phone {
	
	private int number = 0;
	private String model="Galaxy S6";
	private String color="Black";
	private String operator="ATT";
	private boolean gpsEnabled=false;
	private boolean bluetoothEnabled=false;
	private boolean touchScreen=true;
	private boolean frontCamera=false;
	
	
	public Phone() {
			
		
	}
	
	
	public void call() {
		System.out.println("You are calling someOne from the number: "+ number);
	}
	
	
	
	public Phone(int num) {
		number=num;	
	
		
	}
	
	public Phone(int num, String mod) {
		number=num;
		model=mod;
	
		
	}
	
	public Phone(int num, String mod, String col, String op, boolean gps, boolean bt, boolean tc, boolean fc ) {
		number=num;
		model=mod;
		color=col;
		operator=op;
		gpsEnabled=gps;
		bluetoothEnabled=bt;
		touchScreen=tc;
		frontCamera=fc;
		
	}
	
	
	public void showIfMyPhoneHasBlueTooth() {
		System.out.println(bluetoothEnabled);
	}
	
	public void setBlueTooth(boolean bool) {
		bluetoothEnabled = bool;
	}
	
	
	
	public void showIfMyPhoneHasTouchSceen() {
		System.out.println(touchScreen);
	}
	
	public void setTouchScreen(boolean bool) {
		
		touchScreen = bool;
	}
	
	public void showIfMyPhoneFrontCamera() {
		System.out.println(frontCamera);
	}
	
	public void setFrontCamera(boolean bool) {
		frontCamera = bool;
	}
	
	
	public void showIfMyPhoneHasGPS() {
		System.out.println(gpsEnabled);
	}
	
	public void setGPS(boolean bool) {
		gpsEnabled = bool;
	}
	
	public void showMyPhoneNumber() {
		System.out.println(number);
	}
	
	public void showMyOperator() {
		System.out.println(operator);
	}
	public void setMyOperator(String op) {
		operator = op;
	}
	
	public void showMyPhoneModel() {
		System.out.println(model);
	}
	
	public void showMyPhoneColor() {
		System.out.println(color);
	}
	
	
	public void setYourNewNumber(int num) {
		number = num;
	}
	
	public void setYourModel(String mod) {
		model = mod;
	}
	
	public void setYourColor(String col) {
		color = col;
	}
	
	
	
	
	

}
