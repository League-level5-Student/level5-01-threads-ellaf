package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {

	ConcurrentLinkedQueue<Task> taskQueue;
	
	Worker(ConcurrentLinkedQueue<Task> taskQueue){
		this.taskQueue = taskQueue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(taskQueue.isEmpty() != true) {
		Task t = taskQueue.remove();
		t.perform();
		//System.out.println("banana");
		}
	}


}
