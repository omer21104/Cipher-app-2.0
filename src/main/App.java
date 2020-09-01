package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;

import window.*;

import ciphers.CeaserCipher;
import ciphers.Cipher;
import file_parser.Parser;

public class App implements ActionListener 
{
	static String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345" + 
			"67890 !?.";
	static final int HEIGHT = 600, WIDTH = 800;
	static final String[] CIPHERS = {"Caeser"};
	static final String[] MODES = {"encrypt", "decrypt"};
	
	private Window w;

	public static void main(String[] args)
	{
		new App();


	}
	
	
	
	public App()
	{
		w = new Window(HEIGHT, WIDTH, this);	
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
		
		
		if (e.getActionCommand().equals("GO!"))
		{
			int cipherIndex = w.getCipherSelection();
			Cipher c = null;
			switch (CIPHERS[cipherIndex])
			{
			case "Caeser":
				// caeser
				c = new CeaserCipher(w.getMessage(), w.getKey());

				
			}
			if (w.getModeSelection() == 0)
			{
				// encryption
				w.setTranslatedMessage(c.encrypt());
			}
			else if (w.getModeSelection() == 1)
			{
				// decrytion
				w.setTranslatedMessage(c.decrypt());
			}
			
			
		}
		
		
		
		
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

