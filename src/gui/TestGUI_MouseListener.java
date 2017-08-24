package gui;
  
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
  
public class TestGUI_MouseListener {
  
    public static void main(String[] args) {
  
    	JFrame f = new JFrame("LOL");
    	f.setSize(800, 600);
    	f.setLocationRelativeTo(null);
    	f.setLayout(null);
    	
    	JLabel l = new JLabel();
    	ImageIcon i = new ImageIcon("E:/Ñ¸À×ÏÂÔØ/how2j/shana_heiheihei.png");
    	l.setIcon(i);
    	l.setBounds(375, 375, i.getIconWidth(), i.getIconHeight());
    	f.add(l);
    	
    	
    	l.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
	
	                Random r = new Random();
	                int x = r.nextInt(f.getWidth() - l.getWidth());
	                int y = r.nextInt(f.getHeight() - l.getHeight());
	                
	                l.setLocation(x, y);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
    	   	
  
    	

    	
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setVisible(true);
    }
  
}