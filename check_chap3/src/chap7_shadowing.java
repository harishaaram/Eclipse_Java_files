
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class chap7_shadowing {
		// Field declarations
		private static int number;
		private static JLabel numberLabel;
		private static JButton incrementButton;
		// Start of ButtonHandler class
		private static class ButtonHandler implements ActionListener
		{
		public void actionPerformed(ActionEvent event)// Event handler method
		{
		number++;
		numberLabel.setText("" + number);
		}
		}
		// End of ButtonHandler class
		// Start of main
		public static void main(String[] args)
		{
		JFrame outputFrame; // Declare JFrame variable
		Container outputPane; // Declare Container variable
		ButtonHandler incrementListener; // Declare event listener
		// Create a JFrame object
		outputFrame = new JFrame();
		// Ask the JFrame for its content pane
		outputPane = outputFrame.getContentPane();
		// Specify the window-closing action
		outputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Specify the frame size
		outputFrame.setSize(200, 75);
		// Specify a layout manager
		outputPane.setLayout(new FlowLayout());
		// Prepare label and button for user interface
		number = 0;
		numberLabel = new JLabel("" + number);
		incrementButton = new JButton("Increment");
		incrementListener = new ButtonHandler();
		incrementButton.addActionListener(incrementListener);
		// Add output to the content pane
		outputPane.add(numberLabel);
		outputPane.add(incrementButton);
		// Make the JFrame visible
		outputFrame.setVisible(true);
		}
		}