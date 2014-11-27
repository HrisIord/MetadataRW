package MetadataRW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {
	
	public MainFrame(String title) {
		super(title);
		
		MainPanel main = new MainPanel();
		main.setBounds(0, 0, 800, 600);
		//main.setBounds(getContentPane().getBounds());
		add(main);
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
