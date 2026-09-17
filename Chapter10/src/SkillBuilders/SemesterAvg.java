package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;

import javax.swing.JLabel;

public class SemesterAvg {

	private JFrame frame;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		gr1 = new JTextField();
		gr1.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(gr1.getText().equals("Enter the first grade:"))
				{
					gr1.setText("");
				}
			}
		});
		gr1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gr1.setText("Enter the first grade:");
		gr1.setBounds(20, 43, 260, 40);
		panel.add(gr1);
		gr1.setColumns(10);
		
		gr2 = new JTextField();
		gr2.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(gr2.getText().equals("Enter the second grade:"))
				{
					gr2.setText("");
				}
			}
		});
		gr2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gr2.setText("Enter the second grade:");
		gr2.setColumns(10);
		gr2.setBounds(20, 120, 260, 40);
		panel.add(gr2);
		
		gr3 = new JTextField();
		gr3.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(gr3.getText().equals("Enter the third grade:"))
				{
					gr3.setText("");
				}
			}
		});
		gr3.setText("Enter the third grade:");
		gr3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		gr3.setColumns(10);
		gr3.setBounds(20, 191, 260, 40);
		panel.add(gr3);
		
		JLabel displayavg = new JLabel("");
		displayavg.setBounds(344, 174, 35, 24);
		panel.add(displayavg);
		
		JButton avg = new JButton("Average");
		avg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		avg.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade1 = gr1.getText();
				String grade2 = gr2.getText();
				String grade3 = gr3.getText();
				
				double avgGrade = (Double.parseDouble(grade1) + Double.parseDouble(grade2) + Double.parseDouble(grade3)) / 3 ;
				
				DecimalFormat dc = new DecimalFormat("0.0");
				
				displayavg.setText(dc.format(avgGrade));
			}
		});
		avg.setBounds(302, 78, 111, 86);
		panel.add(avg);
		
		lblNewLabel = new JLabel("Semester Average");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 11, 230, 21);
		panel.add(lblNewLabel);
		
	}
}
