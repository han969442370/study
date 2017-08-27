package yaya.thread;

/**
 * @author hanfs
 * 描述：简单线程
 *2016年4月28日
 */
public class SimpleThread extends Thread {
	
	private int countDown = 5;
	
	private int threadNumber;
	
	private static int threadCount = 0;
	
	public SimpleThread(){
		this.threadNumber = ++threadCount;
		System.out.println("Making:"+this.threadNumber);
	}
	
	public void run(){
		while (true) {
			System.out.println("thread:"+threadNumber+"("+countDown+")");
			if (--countDown == 0) {
				return;
			}
		}
	}

	public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
		new SimpleThread().start();
	}
	}

}
