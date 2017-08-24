package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestGUI_Dialog {
	
	public static void main(String[] args) {
	
		JFrame f = new JFrame("LOL");
		f.setSize(400, 300);
		f.setLocation(580, 200);
		f.setLayout(null);
		
		JButton b = new JButton("打开一个模态窗口");
		b.setBounds(130, 100, 150, 30);
		
		b.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JDialog d =new JDialog(f);
				d.setTitle("这是一个模态窗口");
				d.setModal(true);
				d.setSize(200,150);
				d.setLocationRelativeTo(f);
				
				JButton b = new JButton("锁定大小");
				d.add(b);
				
				b.addActionListener(new ActionListener() {
					boolean resizable = false;
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						d.setResizable(resizable);
						resizable = !resizable;
						b.setText(resizable?"解锁大小":"锁定大小");
					}
				});
				d.setVisible(true);
			}
		});
		
		f.add(b);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
