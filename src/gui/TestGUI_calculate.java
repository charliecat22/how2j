package gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGUI_calculate {

	public static void main(String[] args) {
		JFrame f = new JFrame("¼ÆËãÆ÷");
		f.setSize(330, 279);
	    f.setLocation(200, 200);
	    int gap = 8;
	    f.setLayout(null);
	    
	    JPanel middlePanel = new JPanel();
	    middlePanel.setBounds(gap, gap, 300, 225);
	    middlePanel.setLayout(new GridLayout(4, 5,gap,gap));
	    
	    middlePanel.add(new JButton("7"));
        middlePanel.add(new JButton("8"));
        middlePanel.add(new JButton("9"));
        middlePanel.add(new JButton("/"));
        middlePanel.add(new JButton("sq"));
        middlePanel.add(new JButton("4"));
        middlePanel.add(new JButton("5"));
        middlePanel.add(new JButton("6"));
        middlePanel.add(new JButton("*"));
        middlePanel.add(new JButton("%"));
        middlePanel.add(new JButton("1"));
        middlePanel.add(new JButton("2"));
        middlePanel.add(new JButton("3"));
        middlePanel.add(new JButton("-"));
        middlePanel.add(new JButton("1/x"));
        middlePanel.add(new JButton("0"));
        middlePanel.add(new JButton("+/-"));
        middlePanel.add(new JButton("."));
        middlePanel.add(new JButton("+"));
        middlePanel.add(new JButton("="));
	    
        f.add(middlePanel);
	    
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setVisible(true);
	}
}
