package thread;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		
		myThread.start();
		
		myThread.setPriority(Thread.MIN_PRIORITY);
		
		try {
			myThread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		MyRunnable myRunnable = new MyRunnable();
		Thread t = new Thread(myRunnable);
		
		t.start();
		
		System.out.println("inside main thread");
		
		t.setPriority(Thread.MAX_PRIORITY);
		
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		System.out.println("inside main thread");
		
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("inside runnable thread");
				
			}
			
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		System.out.println("inside main thread");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		try {
			t1.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		
		System.out.println("inside main thread");
	}

}
