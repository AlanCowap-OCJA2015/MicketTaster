/**
 * 
 */
package com.github.cbpos1989.micket_taster;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Colm O'Sullivan, Connor Brennan, James MacMahon, Mubasher Mohammed
 *
 */
public class TicketMasterGUI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Person[] attendes;
	
	public TicketMasterGUI(Person[] attendes){
		this.attendes = attendes;
		
		this.setLayout(null);
		JTextArea textArea = new JTextArea();
		//JScrollPane pane = new JScrollPane(textArea);
		
		textArea.setBounds(10, 11, 319, 259);
		//add(textArea);
		
		JButton btnPrintDetails = new JButton("Print Details");
		btnPrintDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(printDetails());
			}
		});
		btnPrintDetails.setBounds(340, 23, 89, 23);
		add(btnPrintDetails);

		
		
		this.add(textArea);
		this.setVisible(true);
	}
	
	private String printDetails(){
		String output = "";
		
		for(Person p: attendes){
			output+= p.toString() + "\n";
		}
		
		return output;
	}
}
