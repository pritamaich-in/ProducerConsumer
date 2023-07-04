import java.util.Random;

public class Consumer extends Thread {

	Company c;
	int sleepTime;
	Random rand;

	Consumer(Company c, Random rand) {
		this.c = c;
		this.rand = rand;
	}

	@Override
	public void run() {
		while (true) {
			try {
				c.consume_item();
				this.sleepTime = this.rand.nextInt(0, 6);
				System.out.println("Consumer machine is sleeping for " + this.sleepTime + " second.");
				Thread.sleep(sleepTime * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
