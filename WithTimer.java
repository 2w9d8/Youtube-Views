import java.awt.*;
import java.io.*;
import java.net.*;
import java.util.Timer;
import java.util.TimerTask;


public class WithTimer { //Start

	/*
	 * With Timer 
	 * 
	 */
	
	
	public static String Sound = "https://soundcloud.com/hacked34354tf/test477"; //Sound link
	private static Timer timer = new Timer();
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		timer.schedule( new TimerTask() {
			public void run() {
				RunWithTimer();
			}
		 }, 0, (123*4)*1000);
	}
	
	
	public static void Start() throws IOException, URISyntaxException {
		Desktop d = Desktop.getDesktop();
		d.browse(new URI(Sound));
	}
	
	public static void Thread(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (Exception e) {
			
		}
	}	
	
	public static void RunWithTimer() {
		try {
			Start();
			Thread(123);
			Start();
			Thread(123);
			Start();
			Thread(123);
			Start();
			Thread(123);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
} //End
