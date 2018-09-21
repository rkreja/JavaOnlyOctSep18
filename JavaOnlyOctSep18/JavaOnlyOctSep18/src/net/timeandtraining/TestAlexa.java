package net.timeandtraining;

public class TestAlexa {

	public static void main(String[] args) {
		Alexa myalexa = new Alexa();
		myalexa.whatIsYourName();
				
		Alexa myFriendsAlexa = new Alexa("Siri");
		myFriendsAlexa.whatIsYourName();
		
		
		Alexa mySistersAlexa = new Alexa("Monica");
		mySistersAlexa.whatIsYourName();
		
	}
}
