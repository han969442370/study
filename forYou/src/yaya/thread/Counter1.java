package yaya.thread;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.apache.catalina.filters.AddDefaultCharsetFilter;

public class Counter1 extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int count = 0;
	
	private Button onOff = new Button("onOff"),start = new Button("start");
	
	private TextField t = new TextField();
	
	private boolean runFlag = true;
	
	public void init(){
		add(t);
		start.addActionListener(new StartL());
		add(start);
		onOff.addActionListener(new OnOffL());
		add(onOff);
	}
	
	public void go(){
		while (true) {
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {}
			if (runFlag) {
				t.setText(Integer.toString(count++));
			}
		}
	}
	
	public static void main(String[] args) {
		Counter1 applet = new Counter1();
		Frame aFrame = new Frame("Counter1");
		aFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent paramWindowEvent) {
				System.exit(0);
			}
		});
		aFrame.add(applet, BorderLayout.CENTER);
		aFrame.setSize(300, 200);
		applet.init();
		applet.start();
		aFrame.setVisible(true);
	}

	class StartL implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent paramActionEvent) {
			go();
		}
		
	}
	class OnOffL implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent paramActionEvent) {
			runFlag = !runFlag;
		}
		
	}
}
