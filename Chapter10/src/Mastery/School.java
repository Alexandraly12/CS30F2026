package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class School 
{

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
					School window = new School();
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
	public School() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon crescent = new ImageIcon("../Chapter10/src/Mastery/crescent.jpg");
		ImageIcon swc = new ImageIcon("../Chapter10/src/Mastery/swc logo.png");
		ImageIcon dief = new ImageIcon("../Chapter10/src/Mastery/Dief.png");
		ImageIcon nt = new ImageIcon("../Chapter10/src/Mastery/Northtrail.png");
		ImageIcon western = new ImageIcon("../Chapter10/src/Mastery/Western.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 556, 496);
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
				if(fN.getText().equals("Enter your first name:"))
				{
					fN.setText(" ");
				}
			}
		});
		fN.setText("Enter your first name:");
		fN.setBounds(23, 51, 148, 28);
		panel.add(fN);
		fN.setColumns(10);
		
		lN = new JTextField();
		lN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(lN.getText().equals("Enter your last name:"))
				{
					lN.setText(" ");
				}
			}
		});
		lN.setText("Enter your last name:");
		lN.setColumns(10);
		lN.setBounds(181, 51, 148, 28);
		panel.add(lN);
		
		JComboBox grade = new JComboBox();
		grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "10", "11", "12"}));
		grade.setBounds(23, 111, 148, 28);
		panel.add(grade);
		
		JComboBox school = new JComboBox();
		school.setModel(new DefaultComboBoxModel(new String[] {"School", "Crescent Heights", "Western", "John G. Diefenbaker", "Sir Winston Churchill", "North Trail"}));
		school.setBounds(181, 111, 148, 28);
		panel.add(school);
		
		JLabel logo = new JLabel("");
		logo.setBounds(23, 243, 306, 157);
		panel.add(logo);
		
		JTextArea display = new JTextArea();
		display.setBounds(23, 164, 315, 68);
		panel.add(display);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String first = fN.getText();
				String last = lN.getText();	
				String grd = " ";
				String skl = " ";
				
				if(grade.getSelectedItem().equals("10"))
				{
					grd = "10";
				}
				else if(grade.getSelectedItem().equals("11"))
				{
					grd = "11";
				}
				else if(grade.getSelectedItem().equals("12"))
				{
					grd = "12";
				}
				
				if(school.getSelectedItem().equals("Crescent Heights"))
				{
					skl = "Crescent Heights";
					logo.setIcon(crescent);
				}
				else if(school.getSelectedItem().equals("Western"))
				{
					skl = "Western";
					logo.setIcon(western);
				}
				else if(school.getSelectedItem().equals("John G. Diefenbaker"))
				{
					skl = "John G. Diefenbaker";
					logo.setIcon(dief);
				}
				else if(school.getSelectedItem().equals("Sir Winston Churchill"))
				{
					skl = "Sir Winston Churchill";
					logo.setIcon(swc);
				}
				else if(school.getSelectedItem().equals("North Trail"))
				{
					skl = "North Trail";
					logo.setIcon(nt);
				}
				
				display.setText(first + " " + last + " is in grade: " + grd
						 + "\n and goes to " + skl + " High School.");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(380, 51, 129, 263);
		panel.add(btnNewButton);
				
	}
}
