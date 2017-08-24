package gui;
  
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
  
public class TestGUI_ButtonActionListener {
  
    public static void main(String[] args) {
  
    	JFrame f = new JFrame("LOL");
    	f.setSize(400, 300);
    	f.setLocation(580, 200);
    	f.setLayout(null);
    	
    	JLabel l = new JLabel();
    	ImageIcon i = new ImageIcon("E:/Ñ¸À×ÏÂÔØ/how2j/shana.png");
    	l.setIcon(i);
    	l.setBounds(140, 50, i.getIconWidth(), i.getIconHeight());
    	
    	JButton b = new JButton("Òþ²ØÍ¼Æ¬");
    	b.setBounds(150, 200, 100, 30);
    	
    	b.addActionListener(new ActionListener() {
			boolean hide = false;
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l.setVisible(hide);
				hide = !hide;
				b.setText(hide?"ÏÔÊ¾Í¼Æ¬":"Òþ²ØÍ¼Æ¬");
			}
		});
    	
    	f.add(l);
    	f.add(b);
    	
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setVisible(true);
    }
  
}