package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class classDemo {

	private JFrame frame;
	private JTextField fN;
	private JTextField lN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					classDemo window = new classDemo();
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
	public classDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		fN = new JTextField();
		fN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(fN.getText().equals("Enter your first name"))
				{
					fN.setText("");
				}
				
			}
		});
		fN.setText("Enter your first name");
		fN.setBounds(20, 34, 147, 37);
		panel.add(fN);
		fN.setColumns(10);
		
		lN = new JTextField();
		lN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(lN.getText().equals("Enter your last name"))
				{
					lN.setText("");
				}
			}
		});
		lN.setText("Enter your last name");
		lN.setColumns(10);
		lN.setBounds(187, 34, 147, 37);
		panel.add(lN);
		
		JLabel display = new JLabel("");
		display.setBounds(20, 179, 328, 52);
		panel.add(display);
		
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String firstN = fN.getText();
				String lastN = lN.getText();
				
				display.setText(firstN
								+ " " + lastN);
			}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 15));
		submit.setBounds(384, 34, 123, 197);
		panel.add(submit);
		
	}
}
