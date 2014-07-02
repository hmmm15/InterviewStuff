public class HeavyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new HeavyWorkRunnable(), "T1");
		Thread t2 = new Thread(new HeavyWorkRunnable(), "T2");
		Thread t3 = new Thread(new HeavyWorkRunnable(), "T3");
		Thread t4 = new Thread(new HeavyWorkRunnable(), "T4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
