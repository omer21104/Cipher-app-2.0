package window;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import main.App;
import warnings.KeyWarning;

public class Window extends Canvas {

	private static final long serialVersionUID = 1L;
	private static final boolean RIGHT_TO_LEFT = false;
	// Frame and Components
	JFrame frame;
	JPanel panel;
	JLabel label1, label2, label3, label4, label5;
	JButton button;
    JTextArea textArea1, textArea2, textArea3;
    JFormattedTextField keyField;
    JComboBox cipherList, modeList;
    Font font = new Font("Arial", Font.PLAIN, 16);
    
    // Layout variables
    int startX = 20,   startY = 20,
    	midX   = 100,  midY = 250,
    	endX   = 650,  endY = 350,
    	offset = 50;
	
	@SuppressWarnings("unchecked")
	public Window(int height, int width, App app)
	{
		frame = new JFrame("Cipher App");
		panel = new JPanel();
		label1 = new JLabel("Enter text: ");
		label2 = new JLabel("Message: ");
		label3 = new JLabel("Cipher: ");
		label4 = new JLabel("Mode: ");
		label5 = new JLabel("Key: ");
		cipherList = new JComboBox<String>(App.getCiphers());
		modeList = new JComboBox<String>(App.getModes());
		button = new JButton("GO!");
		textArea1 = new JTextArea(16,16);
		textArea2 = new JTextArea(16,16);
		textArea3 = new JTextArea(16,16);
		//keyField = new JFormattedTextField(NumberFormat.getIntegerInstance());

		// configure layout
		panel.setLayout(null);
		label1.setBounds(startX, startY, 200, 20);
		label2.setBounds(startX, endY, 200, 20);
		label3.setBounds(endX - offset, startY, 50, 20);
		label4.setBounds(endX - offset, endY, 50, 20);
		label5.setBounds(startX, midY, 50, 20);
		textArea1.setBounds(midX, startY, 400, 170);
		textArea2.setBounds(midX, endY, 400, 170);
		textArea3.setBounds(midX, midY, 100, 60);
		//keyField.setBounds(midX, midY, 100, 60);
		textArea1.setLineWrap(true);
		textArea2.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		textArea2.setWrapStyleWord(true);
		textArea1.setFont(font);
		textArea2.setFont(font);
		textArea3.setFont(font);
		//keyField.setFont(font);
		cipherList.setBounds(endX, startY, 100, 30);
		modeList.setBounds(endX, endY, 100, 30);
		button.setBounds(endX - offset, endY + offset*2, 150, 50);
		
		// add components to the panel
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(label4);
		panel.add(label5);
		panel.add(textArea1);
		panel.add(textArea2);
		panel.add(textArea3);
		//panel.add(keyField);
		panel.add(cipherList);
		panel.add(modeList);
		panel.add(button);
		
		textArea2.setEditable(false);
		textArea1.setText("Hello world");
		button.addActionListener(app);
		
		frame.add(panel);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
		
	
	}
	
	public int getModeSelection()
	{
		return modeList.getSelectedIndex();
	}
	
	public int getCipherSelection()
	{
		return cipherList.getSelectedIndex();
	}
	
	public String getMessage()
	{
		return textArea1.getText();
	}

	public String getTranslatedMessage()
	{
		return textArea2.getText();
	}
	
	public int getKey()
	{
		// check for any non digit characters in key field
		if (textArea3.getText().matches("[^0-9]+"))
		{
			textArea3.setText("0");
			new KeyWarning();
			return 0;
		}
		return (int) Integer.valueOf(textArea3.getText());
	}
	
	public void setTranslatedMessage(String msg)
	{
		textArea2.setText(msg);
	}
}
