import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Company comp = new Company();
		Random random = new Random();

		Producer prod = new Producer(comp, random);
		Consumer cons = new Consumer(comp, random);

		prod.start();
		cons.start();
	}

}
