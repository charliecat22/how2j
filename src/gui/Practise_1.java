package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Practise_1 {
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
				if(0 == text.length()){
					JOptionPane.showMessageDialog(f, "文本不能为空");
					}
			}
		});
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
