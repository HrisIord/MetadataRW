package MetadataRW;

import java.awt.Color;
import javax.swing.*;

public class MainPanel extends JPanel {
	
	public MainPanel() {
		super();
		this.setBackground(Color.WHITE);
		JButton b = new JButton("Enter");
		b.setBounds(100, 100, 100, 20);
		b.setActionCommand("test");
		add(b);
	}
	


}
