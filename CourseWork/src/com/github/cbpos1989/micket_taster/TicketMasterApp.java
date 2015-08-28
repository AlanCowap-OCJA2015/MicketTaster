/**
 * 
 */
package com.github.cbpos1989.micket_taster;

import javax.swing.JFrame;
import javax.swing.JList;

/**
 * @author User1
 *
 */
public class TicketMasterApp {

	private final int MAX_ATTENDES = 800;
	private Person[] attendes = new Person[MAX_ATTENDES];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TicketMasterApp tma = new TicketMasterApp();
		tma.populateArray();
		tma.startProgram();
	}

	private void startProgram() {
		JFrame window = new JFrame();
		
		
		TicketMasterGUI content = new TicketMasterGUI(attendes);
		window.setContentPane(content);
		
		JList list = new JList();
		content.add(list);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 500);
		window.setLocation(500,250);
		window.setVisible(true);
		
	}
	
	private void populateArray(){
		for(int i = 0; i < MAX_ATTENDES; ++i){
			attendes[i] = new Person("Joe Bloggs" + i,"joebloggs" + i + "@gmail.com","968757498768594" + i);
		}
	}

}
