
public class Main {
	private volatile int a;

	public static void main(String[] args) {

		Exemple r1 = new Exemple();
		Exemple r2 = new Exemple();

		// NE JAMAIS FAIRE
		// r1.run();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		// NE JAMAIS FAIRE
		// t1.run();

		// Lancer la thread
		t1.start();
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Apres mon t2");
	}

}
