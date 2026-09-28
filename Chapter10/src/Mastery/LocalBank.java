package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class LocalBank 
{

	private JFrame frame;
	private JTextField accNum;
	private JTextField Amt;
	private JTextField fN;
	private JTextField lN;
	private JTextField begBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 477, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Select = new JLabel("Select An Action:");
		Select.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Select.setBounds(10, 23, 199, 14);
		panel.add(Select);
		
		JLabel Instruction = new JLabel("Complete the Information");
		Instruction.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Instruction.setBounds(10, 109, 433, 21);
		panel.add(Instruction);
		
		JComboBox actionBox = new JComboBox();
		actionBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(actionBox.getSelectedItem().equals("Add An Account"))
				{
					Instruction.setText("Complete the Information in BLACK:");
				}
				else
				{
					Instruction.setText("Complete the Information in RED:");
				}
			}
		});
		actionBox.setModel(new DefaultComboBoxModel(new String[] {"", "Add An Account", "Deposit", "Withdrawal", "Check Balance"}));
		actionBox.setBounds(10, 48, 412, 29);
		panel.add(actionBox);
		
		accNum = new JTextField();
		accNum.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(accNum.getText().equals("Account Number:"))
				{
					accNum.setText(" ");
				}
			}
		});
		accNum.setForeground(new Color(255, 0, 0));
		accNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		accNum.setText("Account Number:");
		accNum.setBounds(10, 141, 412, 29);
		panel.add(accNum);
		accNum.setColumns(10);
		
		Amt = new JTextField();
		Amt.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(Amt.getText().equals("Amount Deposit/Withdrawal:"))
				{
					Amt.setText(" ");
				}
			}
		});
		Amt.setForeground(new Color(255, 0, 0));
		Amt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Amt.setText("Amount Deposit/Withdrawal:");
		Amt.setColumns(10);
		Amt.setBounds(10, 187, 412, 29);
		panel.add(Amt);
		
		fN = new JTextField();
		fN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(fN.getText().equals("First Name:"))
				{
					fN.setText(" ");
				}
			}
		});
		fN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		fN.setText("First Name:");
		fN.setColumns(10);
		fN.setBounds(10, 232, 412, 29);
		panel.add(fN);
		
		lN = new JTextField();
		lN.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(lN.getText().equals("Last Name:"))
				{
					lN.setText(" ");
				}
			}
		});
		lN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lN.setText("Last Name:");
		lN.setColumns(10);
		lN.setBounds(10, 272, 412, 29);
		panel.add(lN);
		
		begBalance = new JTextField();
		begBalance.addKeyListener(new KeyAdapter() 
		{
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if(begBalance.getText().equals("Beginning Balance:"))
				{
					begBalance.setText(" ");
				}
			}
		});
		begBalance.setFont(new Font("Tahoma", Font.PLAIN, 13));
		begBalance.setText("Beginning Balance:");
		begBalance.setColumns(10);
		begBalance.setBounds(10, 312, 412, 29);
		panel.add(begBalance);
		
		JTextArea display = new JTextArea();
		display.setBounds(10, 352, 412, 84);
		panel.add(display);
		
		
		JButton process = new JButton("Process Transaction");
		process.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if(actionBox.getSelectedItem().equals("Add An Account"))
				{
					String firstN = fN.getText();
					String lastN = lN.getText();
					char fChar = fN.getText().charAt(1);
					
					display.setText("Account Created!"
							+ "\nAccount Number:" + fChar + lastN);
					
				}
			}
		});
		process.setBounds(10, 447, 199, 43);
		panel.add(process);
		
	}
}
