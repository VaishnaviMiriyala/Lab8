package m10.task1;

public class Timer implements Runnable{
	int hr,min,sec;
	

	public Timer() {
		super();
	}


	public Timer(int hr, int min, int sec) {
		super();
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}


	@Override
	public void run() {
		try {
			System.out.println(hr+" : "+min+" : "+sec);
			Thread.sleep(10000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		
	}
	

}
