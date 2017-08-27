package yaya.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class IOTest {

	@Test
	public void echo() {
		/*DataInputStream ds = 
				new DataInputStream(new BufferedInputStream(System.in));*/
		try {
			String rd;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while ((rd = br.readLine()) != null) {
			    if (rd.equalsIgnoreCase("exit")) {
					break;
				}else{
				    System.out.println(rd);
				}
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test1() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("\\E:\\hello.txt",true), "UTF-8"));
			String s;
			while ((s=br.readLine())!=null) {
				pw.write(s);
				pw.newLine();
				pw.flush();
				br.readLine();
			}
			br.close();
			pw.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void redirecting(){
		try {
			BufferedInputStream in = 
					new BufferedInputStream(
							new FileInputStream(new File("\\E:\\keygen.java")));
			PrintStream out = 
					new PrintStream(
							new BufferedOutputStream(
									new FileOutputStream(new File("\\E:\\hello.txt"),true)));
			
			//重定向输入输出
			System.setIn(in);
			System.setOut(out);
			System.setErr(out);

			BufferedReader br = 
					new BufferedReader(
							new InputStreamReader(System.in));
			String s;
			while ((s=br.readLine())!= null) {
				System.out.println(s);
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void redirecting1(){
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter pw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("\\E:\\hello.txt",true), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
