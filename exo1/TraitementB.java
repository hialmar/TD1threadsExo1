package exo1;

public class TraitementB extends Thread {

	public void run() {
		while(true) {
			synchronized(System.out) {
				System.out.println("Affichage du thread B :");
				for(int i = 2; i<7; i++)
					System.out.println(i+"ème ligne du thread B");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
