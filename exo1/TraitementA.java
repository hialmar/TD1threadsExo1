package exo1;

public class TraitementA implements Runnable {

	public void run() {
		while(true) {
			synchronized(System.out) {
				System.out.println("Affichage du thread A :");
				for(int i = 2; i<7; i++)
					System.out.println(i+"ème ligne du thread A");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
