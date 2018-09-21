package net.timeandtraining.other;

import net.timeandtraining.Phone;

public class Test2 {

	public static void main(String[] args) {
		
		
			
		Phone myphone = new Phone(714554, "Iphone X", "White", "t-Mobile", true, true, true, true);
		Phone myFriendsphone = new Phone(3154154, "Iphone 7", "Black", "att", true, true, true, true);
		Phone mySisterPhone = new Phone(6254878, "Galaxy S9");
		
		
		
		Phone myOtherPhone = new Phone(5454);
		
		
		Phone myDadsPhone = new Phone();
		myDadsPhone.showMyPhoneNumber(); // /???
		
		
		myFriendsphone.showMyPhoneModel();
		
		myphone.showMyOperator(); 			// ??
		
		myFriendsphone.showMyPhoneModel(); 	// ??
		
		
		mySisterPhone.showMyOperator(); // ??????
		
		
		
		

		
	
		
		
		
		
		
		
		
		
		
		 
		

	}

}
