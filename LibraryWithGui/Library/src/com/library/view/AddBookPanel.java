package com.library.view;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddBookPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	/*bunu belirttiğimizde AddBookPanel i serializabled olarak implement etmemize gerek kalmıyor*/
	private Box MainBox, hBox1,hBox2,hBox3,hBox4,hBox5,hBox6,hBox7,hBox8;
	private JLabel jlIsbn,jlWriter,jlBookName,jlFile,jlLogDog;
	private JTextField jtfIsbn,jtfWriter,jtfBookName,jtfFile;
	private JButton bBrowse,bAddFile,bAddBook,bSave,bSaveAndQuit;
	private JTextArea jtaLog;
	private JScrollPane scrollPane;
	
	public AddBookPanel(){
		super(new FlowLayout());
		initWidgets();
		addwidgets();
		setBackground(new Color(0,153,153));//ist rgb color for background
	}
	private void initWidgets() {
		
		MainBox = Box.createVerticalBox();
		
		hBox1 = Box.createHorizontalBox();
		hBox2 = Box.createHorizontalBox();
		hBox3 = Box.createHorizontalBox();
		hBox4 = Box.createHorizontalBox();
		hBox5 = Box.createHorizontalBox();
		hBox6 = Box.createHorizontalBox();
		hBox7 = Box.createHorizontalBox();
		hBox8 = Box.createHorizontalBox();
		
		jlIsbn = new JLabel("Enter ISBN:");
		jlWriter = new JLabel ("Enter Writer:");
		jlBookName = new JLabel("Enter Book's Name:");
		jlFile = new JLabel ("Enter the File Name:");
		jlLogDog = new JLabel ("Enter LogDog:");
		
		jtfIsbn = new JTextField (20);
		jtfWriter = new JTextField (20);
		jtfBookName = new JTextField (20);
		jtfFile = new JTextField (20);
		
		jtaLog = new JTextArea (10,24);
		jtaLog.setEditable(false);
		
		scrollPane = new JScrollPane (jtaLog);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
	}
	private void addwidgets() {
		hBox1.add(jlIsbn);
		hBox1.add(jlIsbn);
		hBox2.add(jlWriter);
		hBox2.add(jlWriter);
		hBox3.add(jlBookName);
		hBox3.add(jlBookName);
		hBox4.add(jlFile);
		hBox4.add(jlFile);
		hBox5.add(bBrowse);
		hBox5.add(bAddFile);
		hBox6.add(jlLogDog);
		hBox6.add(bAddBook);
		hBox7.add(bSave);
		hBox7.add(bSaveAndQuit);	
		
		MainBox.add(hBox1);
		MainBox.add(hBox2);
		MainBox.add(hBox3);
		MainBox.add(hBox4);
		MainBox.add(hBox5);
		MainBox.add(hBox6);
		MainBox.add(scrollPane);
		MainBox.add(hBox7);
		
		add(MainBox);
	}
}

