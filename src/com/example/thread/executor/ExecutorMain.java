package com.example.thread.executor;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorTask implements Runnable {
	
	private String name;
	
	public ExecutorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			for(int i=0; i<=5; i++) {
				
				if(i==0) {
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization Time for Task Name :: "+ name + " == "+sdf.format(d) );
				}else {
					Date d = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Executing Time for Task Name :: "+ name + " == "+sdf.format(d) );
				}
				Thread.sleep(1000);
			}
			
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	
}


public class ExecutorMain {

	 static final int MAX_T = 3; 
	public static void main(String[] args) {
		Runnable r1 = new ExecutorTask("Task 1");
		Runnable r2 = new ExecutorTask("Task 2");
		Runnable r3 = new ExecutorTask("Task 3");
		Runnable r4 = new ExecutorTask("Task 4");
		Runnable r5 = new ExecutorTask("Task 5");
		
		ExecutorService pool  = Executors.newFixedThreadPool(MAX_T);
		
		
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);
		
		pool.shutdown();

	}

}
