import java.io.*;
import javax.swing.*;
import java.awt.*;
public class jframe1 {
	public static void main(String[] args) throws IOException{
		String First = "harish";
		String last = "Ram";
		
		JFrame outputFrame =new JFrame();
		Container outputPane;
		
		outputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		outputFrame.setSize(1000, 900);
		
		outputPane = outputFrame.getContentPane();
		outputPane.setLayout(new FlowLayout());
		outputPane.add(new JLabel("welcome MR." + First + last));
		outputPane.add(new JLabel("GUI WINDOW IS PRESENT"));
		
		outputFrame.setVisible(true);
	}
}
