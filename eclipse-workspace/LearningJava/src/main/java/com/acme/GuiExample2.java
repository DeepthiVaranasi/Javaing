package com.acme;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiExample2 {
	public static void main(String args[]) {
		Frame frame = new Frame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setTitle("WestSide");
		GridLayout layout = new GridLayout(7, 3);
		frame.setLayout(layout);
		Label name, phno, amt, addr, paym, choice;
		TextField tname, tphno, tamt;
		tname = new TextField();
		tphno = new TextField();
		tamt = new TextField();
		name = new Label("Name");
		phno = new Label("Phone number");
		amt = new Label("Amount");
		addr = new Label("Address");
		paym = new Label("Payment Method");
		choice = new Label("No of Items");
		frame.add(name);
		frame.add(tname);
		frame.add(phno);
		frame.add(tphno);
		frame.add(addr);
		TextArea taddr = new TextArea();
		taddr.setBounds(10, 20, 100, 200);
		frame.add(taddr);
		frame.add(choice);
		Choice choice1 = new Choice();
		choice1.add("1");
		choice1.add("2");
		frame.add(choice1);
		frame.add(amt);
		frame.add(tamt);
		frame.add(paym);
		Checkbox check1 = new Checkbox("card");
		Checkbox check2 = new Checkbox("cash");
		frame.add(check1);
		frame.add(check2);
		Button button = new Button("Submit");
		frame.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Name : " + tname.getText());
				System.out.println("PhoneNumber : " + tphno.getText());
				System.out.println("Amount : " + tamt.getText());
				System.out.println("Address : " + taddr.getText());
			}
		});
	}
}
