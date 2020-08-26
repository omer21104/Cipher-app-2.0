package main;

import java.io.IOException;
import window.*;

import ciphers.CeaserCipher;
import file_parser.Parser;

public class Driver {
	static String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345" + 
			"67890 !?.";
	static final int HEIGHT = 1024, WIDTH = 1024;

	public static void main(String[] args){
//		Parser parser = new Parser();
//		CeaserCipher c1 = new CeaserCipher("henlo", 3);
//		c1.encrypt();
//		try {
//			parser.write(c1.getMsg());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(c1.getMsg());
//		System.out.println(c1.decrypt());
		//foo("hello");
		Window w = new Window(HEIGHT, WIDTH);



	}

	static void foo(String msg)
	{
		System.out.println("Encrypting...");
		System.out.println(msg);
		char[] arr = msg.toCharArray();
		for (int i = 0; i < msg.length(); i++) {
			for (int j = 0; j < SYMBOLS.length(); j++) {
				arr[i] = SYMBOLS.charAt(j);
				print(arr);
			}
		}
	}
	static void print(char[] arr)
	{
		for (char c : arr)
			System.out.print(c);
		System.out.println();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
