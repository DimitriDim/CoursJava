package projetThread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MonThread A = new MonThread("A"); MonThread B = new MonThread("B"); MonThread
		 * C = new MonThread("C"); A.start(); B.start(); C.start();
		 * 
		 * while(A.isAlive() || B.isAlive() || C.isAlive()); {
		 * System.out.println(Thread.currentThread(). getName() + " : j�ai fini"); }
		 */

		MonCompteur TC = new MonCompteur();
		Thread t1 = new Thread(new TestThread(TC, " t1 "));
		Thread t2 = new Thread(new TestThread(TC, " t2"));
		Thread t3 = new Thread(new TestThread(TC, "t3 "));
		t1.start();
		t2.start();
		t3.start();

	}

}
