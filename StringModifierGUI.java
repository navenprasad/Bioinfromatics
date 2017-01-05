import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Simple GUI class to test some string functions.
 * 
 * @author Michael
 * @version 05 Sept 2000
 */
public class StringModifierGUI
{
	private StringModifier sModifier;

    private JFrame frame;
	private JLabel display;
	private JTextField inputText;

	/**
	 * Create a user interface for a given calcEngine.
	 */
	public StringModifierGUI()
	{
		//sModifier = new StringEngine();
		sModifier = new StringModifier(this);
		makeFrame();
		frame.setVisible(true);
	}

	/**
	 * Return the current text of the display string.
	 */
	public String getDisplayString()
	{
		return display.getText();
	}

	/**
	 * Return the current text of the input string.
	 */
	public String getInputString()
	{
		return inputText.getText();
	}

	/**
	 * Make the frame for the user interface.
	 */
	private void makeFrame()
	{
		frame = new JFrame("String Test");
		
		JPanel contentPane = (JPanel)frame.getContentPane();
		contentPane.setLayout(new BorderLayout(8, 8));
		contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

		JPanel buttonPanel = new JPanel();
			addButton(buttonPanel, "UPPERCASE", new UppercaseHandler());
			addButton(buttonPanel, "lowercase", new LowercaseHandler());
			addButton(buttonPanel, "Titlecase", new TitlecaseHandler());
			addButton(buttonPanel, "Strip", new StripHandler());
			addButton(buttonPanel, "Length", new LengthHandler());
			addButton(buttonPanel, "Quit", new QuitHandler());
		contentPane.add(buttonPanel, BorderLayout.NORTH);

		display = new JLabel("Welcome to the String Tester");
		contentPane.add(display, BorderLayout.CENTER);

		JPanel inputPanel = new JPanel();
			inputText = new JTextField(20);
			inputPanel.add(inputText);
			addButton(inputPanel, "Append", new AppendHandler());
			addButton(inputPanel, "Prepend", new PrependHandler());
			addButton(inputPanel, "Insert", new InsertHandler());
			addButton(inputPanel, "Replace", new ReplaceHandler());
		contentPane.add(inputPanel, BorderLayout.SOUTH);

		frame.pack();
	}

	/**
	 * Add a button to the button panel.
	 */
	private void addButton(Container panel, String buttonText, 
						   ActionListener listener)
	{
		JButton button = new JButton(buttonText);
		button.addActionListener(listener);
		panel.add(button);
	}

    class UppercaseHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.getDisplayUppercase());
		}
	}

    class LowercaseHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.getDisplayLowercase());
		}
	}

    class TitlecaseHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.getDisplayTitlecase());
		}
	}

    class StripHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.getDisplayStripped());
		}
	}

    class LengthHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(String.valueOf(sModifier.getDisplayLength()));
		}
	}
    class QuitHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}

    class AppendHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.appendInputToDisplay());
		}
	}

    class PrependHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.prependInputToDisplay());
		}
	}


    class InsertHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(sModifier.insertInputToDisplay());
		}
	}

    class ReplaceHandler implements ActionListener {
		public void actionPerformed(ActionEvent event)
		{
			display.setText(inputText.getText());
		}
	}
	
	public static void main(String[] args)
	{
		StringModifierGUI st1 = new StringModifierGUI();
	}
	
}