package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import window.*;

import ciphers.CeaserCipher;
import file_parser.Parser;

public class App implements ActionListener 
{
	static String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345" + 
			"67890 !?.";
	static final int HEIGHT = 600, WIDTH = 800;
	static final String[] CIPHERS = {"Caeser"};
	static final String[] MODES = {"encrypt", "decrypt"};

	public static void main(String[] args)
	{
		new App();


	}
	
	
	
	public App()
	{
		Window w = new Window(HEIGHT, WIDTH, this);	
	}

	
	public static String[] getCiphers()
	{
		return CIPHERS;
	}
	
	public static String[] getModes()
	{
		return MODES;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// Handle button click here
		// Create a new Cipher object based on selections
		
	}
}
	

	

	




/* Prototype for enctyption effect on letters 
 * static void foo(String msg)
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
	*/

