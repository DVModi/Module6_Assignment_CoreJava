package com.gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingDemo {
	JFrame f;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	public SwingDemo() {
		f=new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		//f.setLayout(new FlowLayout());
		//f.setLayout(new GridLayout(7,2));
		f.setLayout(null);
		
		l1=new JLabel("ID");
		l2=new JLabel("FIRST NAME");
		l3=new JLabel("LAST NAME");
		l4=new JLabel("EMAIL");
		l5=new JLabel("MOBILE");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		
		b1=new JButton("INSERT");
				b2=new JButton("SERACH");
				b3=new JButton("UPDATE");
				b4=new JButton("DELETE");
				f.add(l1);
				f.add(t1);
				f.add(l2);
				f.add(t2);
				f.add(l3);
				f.add(t3);
				f.add(l4);
				f.add(t4);
				f.add(l5);
				f.add(t5);
				f.add(b1);
				f.add(b2);
				f.add(b3);
				f.add(b4);
				
				

	
	}
	public static void main(String[] args) {
		new SwingDemo();
	}
	

}
