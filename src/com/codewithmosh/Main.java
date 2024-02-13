package com.codewithmosh;
// polymorpishm - ability of an object many forms
public class Main {

	public static void main(String[] args) {
//		Textbox
//		Button
//		Checkbox
		
//		enable()
//		focus()
//		setPosition()
		
		drawUIControl(new Textbox());
		drawUIControl(new Checkbox());
	}
	
	public static void drawUIControl(UIControl control) {
		control.draw();
	}
	
}
