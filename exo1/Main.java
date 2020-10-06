package exo1;

public class Main {
	public static void main(String [] args) {
		TraitementA tA = new TraitementA();
		Thread t = new Thread(tA);
		t.start();
		TraitementB tB = new TraitementB();
		tB.start();
	}
}
