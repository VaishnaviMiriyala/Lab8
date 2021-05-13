package m10.task1;

public class MainApp {

	public static void main(String[] args) {
		int hours = 0;
		int min = 0;
		int sec = 0;
		while(hours < 24) {
			min = 0;
			while(min < 60) {
				sec = 0;
				while(sec < 60) {
					Timer tr = new Timer(hours,min,sec);
				    new Thread(tr).start();
				    sec++;
				}
				min++;
			}
			hours++;
		}
		

	}

}
