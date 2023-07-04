public class Company {

	int productId;
	boolean prodAvailable = false;

	synchronized public void produce_item(int n) throws InterruptedException {
		if (prodAvailable)
			wait();
		this.productId = n;
		System.out.println("Produced : " + this.productId);
		prodAvailable = true;
		notify();
	}

	synchronized public int consume_item() throws InterruptedException {
		if (!prodAvailable)
			wait();
		System.out.println("Consumed : " + this.productId);
		prodAvailable = false;
		notify();
		return this.productId;
	}
}
