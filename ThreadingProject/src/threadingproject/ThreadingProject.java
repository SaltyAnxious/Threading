/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadingproject;

/**
 *
 * @author gleos
 */
import java.lang.Thread;
class RunnableThread implements Runnable {

	Thread runner;
	public RunnableThread() {
	}
	public RunnableThread(String threadName) {
		runner = new Thread(this, threadName); //Create a new thread.
		System.out.println(runner.getName());
		runner.start(); //Start the thread.
	}
	public void run() {
		//Display info about this particular thread
		System.out.println(Thread.currentThread());
	}
}
public class ThreadingProject {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		RunnableThread thread3 = new RunnableThread("thread3");
		//Start the threads
		thread1.start();
		thread2.start();
		try {
			//delay for one second
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
    }
    
}
