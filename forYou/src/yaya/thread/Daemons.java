package yaya.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author hanfs
 * 描述：线程程序片
 *2016年4月28日
 */
public class Daemons {

	public static void main(String[] args) {
     Thread d = new Daemon();
     System.out.println("d.isDaemon() = "+d.isDaemon());
     BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("waiting for CR");
     try {
		buf.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
class Daemon extends Thread{
	private static final int SIZE = 10;
	
	private Thread[] t= new Thread[SIZE];
	
	public Daemon(){
		setDaemon(true);
	    start();
	}
	
	public void run(){
		for (int i = 0; i < SIZE; i++) {
			t[i] = new DaemonSpawn(i);
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.println("t["+i+"].isDamon() = "+t[i].isDaemon());
		}
		while (true) {
			yield();
		}
	}
}
class DaemonSpawn extends Thread{
	
	public DaemonSpawn(int i){
		System.out.println("DaemonSpawn["+i+"] start");
		start();
	}
	
	public void run(){
		while (true) {
			yield();
		}
	}
}