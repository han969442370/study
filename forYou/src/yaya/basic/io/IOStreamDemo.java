package yaya.basic.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberInputStream;
import java.io.StringReader;

public class IOStreamDemo {

	public static void main(String[] args) {
     try {
		//1.Buffered input file
    	 //此缓冲类仅用于将字节流以字符串的方式读取，要将字节转换成其他的java节本类型读取，使用DataInputStream
    	 BufferedReader br = 
                new BufferedReader(
                		new InputStreamReader(
               				new FileInputStream(new File("\\E:\\keygen.java"))));
    	 //以其他java类型读取文件内容 
    	 DataInputStream ds = 
    			 new DataInputStream(
    					 new BufferedInputStream(
    							 new FileInputStream(new File("\\E:\\keygen.java"))));
    	 String s,s2 = new String();
    	 while ((s=br.readLine())!=null) {
			s2 +=s+"\n";
		}
    	 br.close();
    	//2.input from memory java1.2以后使用该类将字符串创建为流
    	 StringReader sr = new StringReader(s2);
    	 int c;
    	 while ((c=sr.read())!=-1) {
			System.out.println((char)c);
		}
    	 sr.close();
    	 
    	//3.formatted memory input
    	 //StringBufferInputStream在java2中不能 将字节正确转换成字符串
    	/* DataInputStream ds2 = 
    			 new DataInputStream(new StringBufferInputStream(s2));
    	 ds2.readLine();*/
    	 String s3;
    	 BufferedReader br2 = new BufferedReader(new StringReader(s2));
    	 while ((s3=br2.readLine())!=null) {
			System.out.println(s3);
		}
    	 br2.close();
    	 
    	 //4.line number & file output
    	 
	} catch (Exception e) {
	  e.printStackTrace();
	}
	}

}
