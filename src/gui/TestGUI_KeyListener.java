package gui;
  
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
  
public class TestGUI_KeyListener {
  
    public static void main(String[] args) {
  
    	JFrame f = new JFrame("LOL");
    	f.setSize(400, 300);
    	f.setLocation(580, 200);
    	f.setLayout(null);
    	
    	JLabel l = new JLabel();
    	ImageIcon i = new ImageIcon("E:/Ѹ������/how2j/shana.png");
    	l.setIcon(i);
    	l.setBounds(140, 50, i.getIconWidth(), i.getIconHeight());
    	
    	f.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				// ����a
				  int step = 10;
	                if (e.getKeyCode() == 38) {
	                    // ͼƬ�����ƶ� ��x���겻�䣬y������٣�
	                    l.setLocation(l.getX() , l.getY()- step);
	                }
	                if (e.getKeyCode() == 40) {
	                    // ͼƬ�����ƶ� ��x���겻�䣬y�������ӣ�
	                    l.setLocation(l.getX() , l.getY()+ step);
	                }
	                if (e.getKeyCode() == 37) {
	                    // ͼƬ�����ƶ� ��y���겻�䣬x������٣�
	                    l.setLocation(l.getX() - step, l.getY());
	                }                
	                if (e.getKeyCode() == 39) {
	                    // ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
	                    l.setLocation(l.getX() + step, l.getY());
	                }
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
    	   	
  
    	f.add(l);

    	
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setVisible(true);
    }
  
}