package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Practise_2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("lol");
		f.setBounds(200, 200, 400, 300);
		f.setLayout(new FlowLayout());
		
		JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(80, 30));
		JButton b = new JButton("检测");
		
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = tf.getText();
				try {
					Integer.parseInt(text);
				} catch (NumberFormatException e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(f, "输入框内容不是整数");
					tf.grabFocus();
				}
			}
		});
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
