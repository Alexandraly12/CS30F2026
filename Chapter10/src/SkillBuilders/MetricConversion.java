package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 254);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(20, 27, 220, 23);
		panel.add(lblNewLabel);
		
		String[] conversion = {" ", "inches to centimeters", "feet to meters", "gallon to liters", "pound to kilograms"};
		JComboBox conType = new JComboBox(conversion);
		conType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		conType.setSelectedIndex(0);
		conType.setBounds(20, 61, 232, 22);
		panel.add(conType);
		
		JLabel display = new JLabel("");
		display.setFont(new Font("Tahoma", Font.PLAIN, 13));
		display.setBounds(20, 176, 162, 14);
		panel.add(display);
		
		if(conType.getSelectedItem().equals("inches to centimeters"))
		{
			display.setText("1 inch = 2.54 centimeters");
		}
		else if(conType.getSelectedItem().equals("feet to meters"))
		{
			display.setText("1 foot = 0.3048 meters");
		}
		else if (conType.getSelectedItem().equals("gallon to liters"))
		{
			display.setText("1 gallon = 4.5461 liters");
		}
		else if (conType.getSelectedItem().equals("pound to kilograms"))
		{
			display.setText("1 pound = 0.4536 kilograms");
		}
		
	}
}
