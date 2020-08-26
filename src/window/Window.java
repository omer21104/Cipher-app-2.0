package window;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window extends Canvas implements ActionListener {

	private static final long serialVersionUID = 1L;
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	JTextField textField;
    JTextArea textArea;
	
	public Window(int height, int width)
	{
		frame = new JFrame("Cipher App");
		panel = new JPanel();
		label = new JLabel("YO: ");
		button = new JButton("GO!");
		textField = new JTextField(16);
		textArea = new JTextArea(16,16);
		
		panel.add(label);
		panel.add(textField);
		panel.add(textArea);
		panel.add(button);

		textArea.setEditable(false);
		textArea.setText("Hello world");
		button.addActionListener(this);
		
		frame.add(panel);
		
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		
		//
		label.setVisible(true);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			String text = textField.getText();
			textArea.setText("");
			textArea.setText(text);
	
		
	}

}
