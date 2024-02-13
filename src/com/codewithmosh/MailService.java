package com.codewithmosh;

public class MailService {
	public void sendEmail() {
		connect();
		authenticate();
//		sendEmail();
		disconnect();	
	}
	private void connect() {
		System.out.println("Connect");
	}
	private void disconnect() {
		System.out.println("Disconnect");
	}
	private void authenticate() {
		System.out.println("Authenticate");
	}
}
