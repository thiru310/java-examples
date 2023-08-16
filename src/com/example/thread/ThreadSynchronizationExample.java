package com.example.thread;

class TestSynchronization {
	
	synchronized static void printTable(int n) {
		for(int j=0; j < 10; j++) {
			System.out.println("n * j" + n*j);
			try {
				Thread.sleep(400);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Thread name :: "+Thread.currentThread().getName());
	}
}
class Thread1 extends Thread {
	 
	public void run() {
		TestSynchronization.printTable(1);
	}
}

class Thread2 extends Thread {
	 
	public void run() {
		TestSynchronization.printTable(10);
	}
}

class Thread3 extends Thread {
	 
	public void run() {
		TestSynchronization.printTable(100);
	}
}
public class ThreadSynchronizationExample {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();

	}

}
