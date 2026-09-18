package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/Mastery/die1.gif");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/Mastery/die2.gif");
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 484, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);	
		
		JLabel Lab1 = new JLabel("");
		Lab1.setBounds(81, 35, 128, 131);
		panel.add(Lab1);
		
		JLabel Lab2 = new JLabel("");
		Lab2.setBounds(249, 35, 128, 131);
		panel.add(Lab2);
		
		JButton roll = new JButton("Roll Dice");
		roll.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Lab1.setIcon(d1);
				
				
			}
		});
		roll.setFont(new Font("SimSun", Font.BOLD, 15));
		roll.setBounds(165, 177, 138, 50);
		panel.add(roll);
		
	
	}
}
