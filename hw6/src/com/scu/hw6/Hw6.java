package com.scu.hw6;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Hw6 {
	

	
public static void main(String[] args)
{
	JFrame myFrame = new JFrame("This is my frame");
	JPanel myPanel= new JPanel();
	JLabel label= new JLabel();
	JLabel label2=new JLabel();
	//label.setText("Image will be here");
	
	
	JButton btnAddFlight = new JButton("Cat");
	JButton btnAddFlight1 = new JButton("Dog");
	btnAddFlight.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent e)
        {
        	ImageIcon imgThisImg = new ImageIcon("/Users/abhishekbirjepatil/Desktop/image1.png");

        	label.setIcon(imgThisImg);
        	
        	System.out.println("Button Pressed");

        }
    });
	
	btnAddFlight1.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent e)
        {
        	ImageIcon imgThisImg = new ImageIcon("/Users/abhishekbirjepatil/Desktop/image2.png");

        	label.setIcon(imgThisImg);
        	
        	System.out.println("Button Pressed");

        }
    });
	
	
	
	myPanel.add(btnAddFlight);
	myPanel.add(btnAddFlight1);
	
	myPanel.add(label);
	myFrame.add(myPanel);
	
	
	//myFrame.add(btnAddFlight1);
	myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	myFrame.setVisible(true);	
}
}
