import java.util.Random;

public class Producer extends Thread {

	Company c;
	Random rand;
	int sleepTime;

	Producer(Company c, Random rand) {
		this.c = c;
		this.rand = rand;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			try {
				this.c.produce_item(i++);
				this.sleepTime = this.rand.nextInt(0, 6);
				System.out.println("Producer machine is sleeping for " + this.sleepTime + " second.");
				Thread.sleep(sleepTime * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
