package com.acme;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class GUIEX {
	public static void main(String args[]) {
		Frame f = new Frame("STUDENT REGISTRATION FORM");
		f.setVisible(true);
		GridLayout l = new GridLayout(10,10);
		f.setLayout(l);
		f.setSize(1000,1000);
		Label em = new Label();
		f.add(em);
		Label sf = new Label("STUDENT FORM");
		f.add(sf);
		Label name = new Label("Name");
		f.add(name);
		TextField tname = new TextField();
		f.add(tname);
		Label rollNumber = new Label("Roll Number");
		f.add(rollNumber);
		TextField tRollNumber = new TextField();
		f.add(tRollNumber);
		Label PhoneNumber = new Label("Phone number");
		f.add(PhoneNumber);
		TextField tphone = new TextField();
		f.add(tphone);
		Label gender = new Label("Gender");
		f.add(gender);
		Choice choice = new Choice();
		choice.add("Male");
		choice.add("Female");
		choice.add("Other");
		f.add(choice);
		Label subjects = new Label("Subjects selection");
		f.add(subjects);
		Checkbox c1 = new Checkbox("Math");
		Checkbox c2 = new Checkbox("Social Studies");
		Checkbox c3 = new Checkbox("Science");
		Checkbox c4 = new Checkbox("English");
		Checkbox c5 = new Checkbox("telugu");
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(c5);
		Label cca = new Label("Co-cirricular activities:");
		f.add(cca);
		List ccA = new List();
		ccA.add("Singing");
		ccA.add("Dancing");
		ccA.add("Drawing");
		ccA.add("Painting");
		ccA.add("Drama");
		f.add(ccA);
		Label l7 = new Label();
		f.add(l7);
		Button b = new Button("Submit");
		b.setBounds(10,20,30,40);
		f.add(b);
		b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
        
            System.out.println("Name" + ":"+tname.getText());
            System.out.println("Roll Number"+":"+tRollNumber.getText());
            System.out.println("Phone number" + ":"+tphone.getText());
            
    }
        });
		  choice.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("Gender"
	                        + ": "+e.getItem());
	            }

	            
	        });
		  c1.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("Subjects"
	                        + ": "+e.getItem());
	            }

	            
	        });
		  c2.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("Subjects"
	                        + ": "+e.getItem());
	            }

	            
	        });
		  c3.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("Subjects"
	                        + ": "+e.getItem());
	            }

	            
	        });
		  c4.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("Subjects"
	                        + ": "+e.getItem());
	            }

	            
	        });
		  c5.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("Subjects"
	                        + ": "+e.getItem());
	            }

	            
	        });
		  ccA.addItemListener(new ItemListener()
	        {
	            @Override
	            public void itemStateChanged(ItemEvent e)
	            {
	                System.out.println("CCA"
	                        + ": "+e.getItem());
	            }

	            
	        });
		
		
				
		
		
		
		
		
		
		
		
		
		
	

}
}
