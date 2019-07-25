package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
ThreadPoolTest tpt = new ThreadPoolTest();
Thread[] threads;
ConcurrentLinkedQueue<Task> taskQueue = new ConcurrentLinkedQueue<Task>();

ThreadPool(int totalThreads){
	//
	threads = new Thread[totalThreads];
	for (int i = 0; i < threads.length; i++) {
		threads[i]
	}
}

void addTask(Task task) {
	//
}

void start(){
	//
}
	
	
}
