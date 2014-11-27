package MetadataRW;

public class Launcher {
	
	/**
     * @param args
     */
    public static void main(String[] args) {
    	Thread sThread = new Thread(new sThread());
		sThread.start();
    }

}
