package com.example.thread.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorFutureTask implements Callable<String> {
	
	String message;
	
	public ExecutorFutureTask(String message) {
		this.message = message;
	}

	@Override
	public String call() throws Exception {
		
		return "Hello :::: "+ message +" !!";
	}
	
}

public class ExecutorFutureExample {

	public static void main(String[] args) {
		ExecutorFutureTask exe = new ExecutorFutureTask("Thirumurugan");
		
		ExecutorService exeServ  = Executors.newFixedThreadPool(1);
		Future<String> result = exeServ.submit(exe);
		
		try {
			System.out.println(result.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		exeServ.shutdown();
	}

}
