package com.automationpractice.other;

import com.java.MyFriendPhone;
import com.java.Phone;

public class ConstrctorDemo {

	public static void main(String[] args) {
		
		
		Phone myPhone = new Phone();
		Phone myFriendsPhone = new Phone("iphone", "5646465");
		Phone myUnclesPhone = new Phone("nokia", "44555");
		
		
		myPhone.showModel();
		myPhone.showNumber();
		
		myFriendsPhone.showModel();
		myFriendsPhone.showNumber();
		
		
		
		myUnclesPhone.showNumber();
	

	}

}
