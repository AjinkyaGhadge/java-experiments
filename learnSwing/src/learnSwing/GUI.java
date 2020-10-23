package learnSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class GUI{
	public GUI() {
		JFrame gui = new JFrame();
		gui.setTitle("My first GUI application");
		gui.setResizable(false);
		gui.setSize(500,500);
		gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		gui.setVisible(true);
		
		Container pane = gui.getContentPane();
		pane.setBackground(new Color(0,0,0));
		pane.setLayout(new FlowLayout(FlowLayout.LEFT));
		pane.add(new JButton("1"));
		pane.add(new JButton("2"));
		pane.add(new JButton("3"));
	}
	public static void main(String[] args) {
		new GUI();

	}
}

