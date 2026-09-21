package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon unbroken = new ImageIcon("../Chapter10/src/Mastery/unbrokenPlates.gif");
		ImageIcon twoBrk = new ImageIcon("../Chapter10/src/Mastery/twoBrokenPlates.gif");
		ImageIcon allBrk = new ImageIcon("../Chapter10/src/Mastery/AllBrokenPlates.gif");
		ImageIcon sticker = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
		ImageIcon tiger = new ImageIcon("../Chapter10/src/Mastery/tigerPlush.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 406, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel plates = new JLabel("");
		plates.setIcon(new ImageIcon(BreakAPlate.class.getResource("/Mastery/unbrokenPlates.gif")));
		plates.setBounds(65, 34, 270, 92);
		panel.add(plates);
		
		JButton button = new JButton("Play");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		button.setBounds(139, 148, 110, 42);
		panel.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(148, 211, 101, 92);
		panel.add(lblNewLabel);
	}
}
