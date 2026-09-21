package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

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
		
		ImageIcon d1 = new ImageIcon("../Chapter10/src/SkillBuilders/die1.gif");
		ImageIcon d2 = new ImageIcon("../Chapter10/src/SkillBuilders/die2.gif");
		ImageIcon d3 = new ImageIcon("../Chapter10/src/SkillBuilders/die3.gif");
		ImageIcon d4 = new ImageIcon("../Chapter10/src/SkillBuilders/die4.gif");
		ImageIcon d5 = new ImageIcon("../Chapter10/src/SkillBuilders/die5.gif");
		ImageIcon d6 = new ImageIcon("../Chapter10/src/SkillBuilders/die6.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 416, 284);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);	
		
		JLabel disD1 = new JLabel("");
		disD1.setBounds(65, 48, 99, 100);
		panel.add(disD1);
		
		JLabel disD2 = new JLabel("");
		disD2.setBounds(247, 48, 99, 100);
		panel.add(disD2);
		
		JButton roll = new JButton("Roll Dice");
		roll.setBackground(Color.darkGray);
		roll.setForeground(Color.white);
		roll.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				int rolld1 = (int)(Math.random() * 6) + 1;
				int rolld2 = (int)(Math.random() * 6) + 1;
				
				if(rolld1 == 1)
				{
					disD1.setIcon(d1);
				}
				if(rolld1 == 2)
				{
					disD1.setIcon(d2);
				}
				if(rolld1 == 3)
				{
					disD1.setIcon(d3);
				}
				if(rolld1 == 4)
				{
					disD1.setIcon(d4);
				}
				if(rolld1 == 5)
				{
					disD1.setIcon(d5);
				}
				if(rolld1 == 6)
				{
					disD1.setIcon(d6);
				}
				
				if(rolld2 == 1)
				{
					disD2.setIcon(d1);
				}
				if(rolld2 == 2)
				{
					disD2.setIcon(d2);
				}
				if(rolld2 == 3)
				{
					disD2.setIcon(d3);
				}
				if(rolld2 == 4)
				{
					disD2.setIcon(d4);
				}
				if(rolld2 == 5)
				{
					disD2.setIcon(d5);
				}
				if(rolld2 == 6)
				{
					disD2.setIcon(d6);
				}
				
				
			}
		});
		roll.setFont(new Font("SimSun", Font.BOLD, 15));
		roll.setBounds(130, 177, 138, 50);
		panel.add(roll);
		
	
	}
}
