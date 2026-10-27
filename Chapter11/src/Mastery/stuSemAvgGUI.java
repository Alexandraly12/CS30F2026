package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class stuSemAvgGUI {

	private JFrame frame;
	private JTextField stuName;
	private JTextField grdLvl;
	private JTextField semNum;
	private JTextField gr1;
	private JTextField gr2;
	private JTextField gr3;
	private JTextField gr4;
	private JTextField avgGrd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stuSemAvgGUI window = new stuSemAvgGUI();
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
	public stuSemAvgGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblStu = new JLabel("Student Name:");
		lblStu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblStu.setBounds(10, 11, 111, 14);
		panel.add(lblStu);
		
		JLabel lblGrd = new JLabel("Grade Level:");
		lblGrd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGrd.setBounds(10, 36, 111, 14);
		panel.add(lblGrd);
		
		JLabel lblSemNum = new JLabel("Semester Number: ");
		lblSemNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSemNum.setBounds(10, 61, 132, 14);
		panel.add(lblSemNum);
		
		JLabel lblGrd1 = new JLabel("Grade 1:");
		lblGrd1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGrd1.setBounds(10, 85, 111, 14);
		panel.add(lblGrd1);
		
		JLabel lblGrd2 = new JLabel("Grade 2:");
		lblGrd2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGrd2.setBounds(10, 110, 111, 14);
		panel.add(lblGrd2);
		
		JLabel lblGrd3 = new JLabel("Grade 3:");
		lblGrd3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGrd3.setBounds(10, 135, 111, 14);
		panel.add(lblGrd3);
		
		JLabel lblGrd4 = new JLabel("Grade 4:");
		lblGrd4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGrd4.setBounds(10, 161, 111, 14);
		panel.add(lblGrd4);
		
		JLabel lblAvg = new JLabel("Average:");
		lblAvg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAvg.setBounds(10, 186, 59, 16);
		panel.add(lblAvg);
		
		stuName = new JTextField();
		stuName.setBounds(235, 9, 311, 20);
		panel.add(stuName);
		stuName.setColumns(10);
		
		grdLvl = new JTextField();
		grdLvl.setColumns(10);
		grdLvl.setBounds(235, 34, 311, 20);
		panel.add(grdLvl);
		
		semNum = new JTextField();
		semNum.setColumns(10);
		semNum.setBounds(235, 59, 311, 20);
		panel.add(semNum);
		
		gr1 = new JTextField();
		gr1.setColumns(10);
		gr1.setBounds(235, 83, 311, 20);
		panel.add(gr1);
		
		gr2 = new JTextField();
		gr2.setColumns(10);
		gr2.setBounds(235, 108, 311, 20);
		panel.add(gr2);
		
		gr3 = new JTextField();
		gr3.setColumns(10);
		gr3.setBounds(235, 133, 311, 20);
		panel.add(gr3);
		
		gr4 = new JTextField();
		gr4.setColumns(10);
		gr4.setBounds(235, 159, 311, 20);
		panel.add(gr4);
		
		JTextArea display = new JTextArea();
		display.setBounds(10, 215, 536, 159);
		panel.add(display);
		
		avgGrd = new JTextField();
		avgGrd.setBounds(67, 185, 41, 20);
		panel.add(avgGrd);
		avgGrd.setColumns(10);
		
		JButton saveBtn = new JButton("Save to File");
		saveBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade1 = gr1.getText();
				String grade2 = gr2.getText();
				String grade3 = gr3.getText();
				String grade4 = gr4.getText();
				String name = stuName.getText();
				String grade = grdLvl.getText();
				String sem = semNum.getText();
				
				double avgGrade = (Double.parseDouble(grade1) + Double.parseDouble(grade2) + Double.parseDouble(grade3) + Double.parseDouble(grade4 )) / 4 ;
				
				DecimalFormat dc = new DecimalFormat("0.0");
				avgGrd.setText(dc.format(avgGrade));
				
				File dataFile;
				FileWriter out;
				BufferedWriter writeFile;
				
				try
				{
					dataFile = new File("../Chapter11/src/Mastery/stuGrade.txt");
					out = new FileWriter(dataFile);
					writeFile = new BufferedWriter(out);
					
					writeFile.write(" Name: " + name + " Grade Level: " + grade + " Semester: " + sem + " Grades: " + grade1 + ", " + grade2 + ", " + grade3 + ", " + grade4 + " Average: " + avgGrade);
					writeFile.newLine();
					
					writeFile.close();
					out.close();
				}
				catch (IOException p)
				{
					System.out.println("Problem writing to file.");
					System.err.println("IOException: " + p.getMessage());
				}
				
				gr1.setText("");
				gr2.setText("");
				gr3.setText("");
				gr4.setText("");
				stuName.setText("");
				grdLvl.setText("");
				semNum.setText("");
				
			}
		});
		saveBtn.setBounds(152, 378, 121, 30);
		panel.add(saveBtn);
		
		JButton viewBtn = new JButton("View File Contents");
		viewBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try  
				{
					File dataFile;
					FileReader in;
					BufferedReader readFile;
					String dis;
					
					dataFile = new File("../Chapter11/src/Mastery/stuGrade.txt");
					
					in = new FileReader(dataFile);
					readFile = new BufferedReader(in);
					
					while((dis = readFile.readLine()) != null)
					{
						display.setText(dis);
					}
					
					readFile.close();
					in.close();
					
				}
				catch(FileNotFoundException p) //Catches exceptions for FileReader
				{
					System.out.println("File does not exist or could not be found.");
					System.err.println("FileNotFoundException: " + p.getMessage());
				}
				catch (IOException p) //Catches exceptions for BufferedReader
				{
					System.out.println("Problem reading file.");
					System.err.println("IOException: " + p.getMessage());
				}
			}
		});
		viewBtn.setBounds(301, 378, 121, 30);
		panel.add(viewBtn);
		
	}
}
