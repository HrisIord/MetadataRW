package MetadataRW;

import javax.swing.JFrame;

public class sThread implements Runnable{
	
	private DirectoryFrame dFrame;
	
	/**
	 * Creates a default thread.
	 */
	public sThread() {
	}
	
	/**
	 * Runs the thread by calling on yFrame.
	 */
	public void run() {
		// creates the thread
		dFrame = new DirectoryFrame("MetaDataRW");
		// sets the size, visibility and default closing option
		dFrame.setSize(600, 200);
		dFrame.setLocation(300, 200);
		dFrame.setVisible(true);
		dFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void runMainFrame() {
		MainFrame mFrame = new MainFrame("MetaDataRW");
		// sets the size, visibility and default closing option
		mFrame.setSize(GetScreenWorkingWidth(), GetScreenWorkingHeight());
		mFrame.setVisible(true);
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static int GetScreenWorkingWidth() {
	    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
	    		.getMaximumWindowBounds().width;
	}

	public static int GetScreenWorkingHeight() {
	    return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
	    		.getMaximumWindowBounds().height;
	}

}
