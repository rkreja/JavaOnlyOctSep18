package net.timeandtraining;

public class Alexa {

	private String name = "Alexa";
	
	
	
	public Alexa(String name) {
	this.name=name;
	}
	public Alexa() {
		
	}
	
	public void playRadio() {
		System.out.println("Playing Z-100");
	}
	
	public void whatDayIsToday() {
		System.out.println("Its Monday");
	}
	
	public void whatIsYourName() {
		System.out.println("My name is "+ name);
	}
	
	public void howManyInchesInFeet(double feet) {
		System.out.println((feet*12) + " inches");
	}
	
	public void thankYou() {
		System.out.println("My pleasure");
	}
	
	public int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public int subtract(int a, int b) {
		System.out.println(a-b);
		return a-b;
	}
	

}
