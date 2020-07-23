package com.acme;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuiExample implements ActionListener  {
    public static void main(String args[]) throws Exception

    {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setTitle("This is my first Frame");
        frame.setSize(300,300);
        
        GridLayout layout = new GridLayout(3,2);
        frame.setLayout(layout);
        
        Label label = new Label("Name");
        label.setAlignment(label.RIGHT);
        frame.add(label);
        
        TextField text = new TextField();
        frame.add(text);
        
        Label labelRoll = new Label("Rollno");
        labelRoll.setAlignment(labelRoll.RIGHT);
        frame.add(labelRoll);
        
        TextField textRoll = new TextField();
        frame.add(textRoll);
        
        Label labelCgpa = new Label("Cgpa");
        labelCgpa.setAlignment(labelCgpa.RIGHT);
        frame.add(labelCgpa);TextField cgpa = new TextField();
        frame.add(cgpa);
        
        Label emptyLabel = new Label();
        frame.add(emptyLabel);
        Button button = new Button("save");
        frame.add(button);
        
        
        button.addActionListener(new ActionListener()
                {

                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        File file = new File("awtFile");
                        try {
                            file.createNewFile();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        try {
                            FileWriter fileWriter = new FileWriter(file);
                            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
                            bufferWriter.write(text.getText()+"|"+textRoll.getText()+"|"+cgpa.getText());
                            bufferWriter.close();
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.println(text.getText()+"|"+textRoll.getText()+"|"+cgpa.getText());
                        
                    }
            
                });
        
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

}

