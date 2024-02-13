package com.codewithmosh;
// abstraction -  reduce complex by hiding unnecessary details of a class
// tv remote - not worried about transistors etc inside the remote
// we can change the implementation details without affecting the mail class
public class Main {

	public static void main(String[] args) {
		var mailService = new MailService();
		mailService.sendEmail();
	}
	
}
