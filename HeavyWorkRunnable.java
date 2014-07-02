public class HeavyWorkRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " is about to sleep 5 seconds");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			IllegalStateException ex = new IllegalStateException("some threading problem");
			ex.initCause(e);
			throw ex;
		}
		System.out.println(Thread.currentThread().getName() + " is awake");
		
	}

}
