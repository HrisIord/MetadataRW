package MetadataRW;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.event.*;
import java.io.*;
import java.util.*;

public class DirectoryFrame extends JFrame implements ActionListener {

	private MainPanel main;
	JTextField dirField;
	
	public DirectoryFrame(String title) {
		super(title);
		setLayout(null);
		
		JLabel prompt = new JLabel("Please enter directory:");
		prompt.setBounds(20, 40, 200, 15);
		add(prompt);
		
		dirField = new JTextField(0);
		dirField.setBounds(20, 60, 550, 25);
		add(dirField);
		
		JButton enter = new JButton("Enter");
		enter.setActionCommand("dirPrompt");
		enter.addActionListener(this);
		enter.setBounds(250, 110, 100, 25);
		add(enter);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals("dirPrompt")) {
			String path = dirField.getText();
			File dir = new File(path);
			if (dir.isDirectory()) {
				super.dispose();
				sThread.runMainFrame();
			} else {
				JLabel error = new JLabel("The directory you have specified is invalid "
						+ "please try again.");
				error.setBounds(130, 90, 400, 15);
				add(error);
				dir.delete();
				repaint();
			}
		}
	}

	
}
