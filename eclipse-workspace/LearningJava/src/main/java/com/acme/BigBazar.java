package com.acme;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BigBazar {
    public static void main(String args[])
    {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setTitle("BigBazar");
        GridLayout layout = new GridLayout(7,3);
        frame.setLayout(layout);
        
        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("Men");
        Menu subMenu = new Menu("more");
        MenuItem m1 = new MenuItem("Dresses");
        MenuItem m2 = new MenuItem("Watches");
        MenuItem m3 = new MenuItem("Perfumes");
        menu.add(m1);
        menu.add(m2);
        subMenu.add(m3);
        menu.add(subMenu);
        menuBar.add(menu);
        frame.setMenuBar(menuBar);
        
        menu = new Menu("Women");
        subMenu = new Menu("More");
        MenuItem w1 = new MenuItem("Dresses");
        MenuItem w2 = new MenuItem("Watches");
        MenuItem w3 = new MenuItem("Perfumes");
        menu.add(w1);
        menu.add(w2);
        subMenu.add(w3);
        menu.add(subMenu);
        menuBar.add(menu);
        frame.setMenuBar(menuBar);
        
        Label label = new Label("Name");
        frame.add(label);
        final TextField tf = new TextField();
        frame.add(tf);
        label = new Label();
        frame.add(label);
        
        label = new Label("Phone Number");
        frame.add(label);
        final TextField tf1 = new TextField();
        frame.add(tf1);
        label = new Label();
        frame.add(label);
        
        label = new Label("Method of payment");
        frame.add(label);
        Checkbox checkbox = new Checkbox("Cash");
        frame.add(checkbox);
        Checkbox checkboxCard = new Checkbox("card");
        frame.add(checkbox);
        frame.add(checkboxCard);
        
        label = new Label("Gender");
        frame.add(label);
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox cb = new Checkbox("Male",cg,true);
        Checkbox cb1 = new Checkbox("Female",cg,true);
        Checkbox cb2 = new Checkbox("Others",cg,true);
        frame.add(cb);
        frame.add(cb1);
        
        
        
        label = new Label("No of items");
        frame.add(label);
        Choice choice = new Choice();
        choice.add("1");
        choice.add("2");
        frame.add(choice);
        label = new Label();
        frame.add(label);
        
        label = new Label("Types");
        frame.add(label);
        List list = new List(6);
        list.add("Pant");
        list.add("Dress");
        list.add("Kurthi");
        list.add("Jeans");
        list.add("Shirt");
        list.add("Skirt");
        frame.add(list);
        label = new Label();
        frame.add(label);
        
        
        label = new Label();
        frame.add(label);
        label = new Label();
        frame.add(label);
        Button button = new Button("Print");
        frame.add(button);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
        
            System.out.println(tf.getText()+"|"+tf1.getText());
                

    }
            

    });
        checkbox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Method of Payment "
                        + ": "+e.getItem());
            }

            
        });
        
        checkboxCard.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Method of Payment :"+e.getItem());
            }

            
        });
        
        cb.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Gender : "+e.getItem());
            }

            
        });
        
        cb1.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Gender : "+e.getItem());
            }

            
        });
        
        choice.addItemListener(new ItemListener()
                {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println("Number of items : " + e.getItem());
            }
                });
             
        list.addItemListener(new ItemListener()
        {
           @Override
           public void itemStateChanged(ItemEvent e)
           {
              System.out.println("list : " + e.getItem());
           }
                });
}
    }
