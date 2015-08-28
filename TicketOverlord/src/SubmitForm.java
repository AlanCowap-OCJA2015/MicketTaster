import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SubmitForm {

	private JFrame frmNewCustomer;
	private JTextField nameField;
	private JTextField creditCardField;
	private JTextField mailField;
	private JComboBox ticketPriceBox;
	private JComboBox concertBox;
	private Database db = new Database();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubmitForm window = new SubmitForm();
					window.frmNewCustomer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SubmitForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewCustomer = new JFrame();
		frmNewCustomer.setTitle("New customer");
		frmNewCustomer.setBounds(100, 100, 294, 279);
		frmNewCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewCustomer.getContentPane().setLayout(null);
		
		nameField = new JTextField();
		nameField.setBounds(117, 16, 138, 20);
		frmNewCustomer.getContentPane().add(nameField);
		nameField.setColumns(20);
		
		JLabel lblName = new JLabel("Full Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblName.setBounds(10, 21, 60, 14);
		frmNewCustomer.getContentPane().add(lblName);
		
		creditCardField = new JTextField();
		creditCardField.setBounds(117, 47, 138, 20);
		frmNewCustomer.getContentPane().add(creditCardField);
		creditCardField.setColumns(16);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number:");
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCreditCardNumber.setBounds(10, 52, 103, 14);
		frmNewCustomer.getContentPane().add(lblCreditCardNumber);
		
		mailField = new JTextField();
		mailField.setBounds(117, 78, 138, 20);
		frmNewCustomer.getContentPane().add(mailField);
		mailField.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setBounds(10, 83, 46, 14);
		frmNewCustomer.getContentPane().add(lblEmail);
		
		ticketPriceBox = new JComboBox();
		ticketPriceBox.setBounds(117, 140, 138, 20);
		ticketPriceBox.addItem("65€");
		ticketPriceBox.addItem("100€");
		frmNewCustomer.getContentPane().add(ticketPriceBox);
		
		JLabel lblTicket = new JLabel("Ticket price:");
		lblTicket.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTicket.setBounds(10, 143, 78, 14);
		frmNewCustomer.getContentPane().add(lblTicket);
		
		concertBox = new JComboBox();
		concertBox.setBounds(117, 109, 138, 20);
		concertBox.addItem("Concert 1");
		concertBox.addItem("Concert 2");
		concertBox.addItem("Concert 3");
		concertBox.addItem("Concert 4");
		concertBox.addItem("Concert 5");
		frmNewCustomer.getContentPane().add(concertBox);
		
		JLabel lblConcert = new JLabel("Concert:");
		lblConcert.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblConcert.setBounds(10, 114, 46, 14);
		frmNewCustomer.getContentPane().add(lblConcert);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validateData()){
					System.out.println("Form has no empty fields");	
					//TODO save current data to ArrayList of customers
					//TODO empty fields
					//TODO leave form open if user wants to add more customers
					int concert = concertBox.getSelectedIndex();
					System.out.println(concert);
					
					byte ticketPrice;
					if(ticketPriceBox.getSelectedIndex() == 0){
						ticketPrice = 65;
					}else {
						ticketPrice = 100;
					}
					
					//save details
					db.addCustomer(concert,
							nameField.getText(),
							Long.parseLong(creditCardField.getText()),
							mailField.getText(),
							ticketPrice);
					
				}else{
					System.out.println("Form has empty fields");
					//TODO do nothing, show message that fields cannot be empty
					
				}
			}
		});
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSubmit.setBounds(182, 191, 73, 23);
		frmNewCustomer.getContentPane().add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmNewCustomer.dispatchEvent(new WindowEvent(frmNewCustomer, WindowEvent.WINDOW_CLOSING));
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCancel.setBounds(106, 191, 73, 23);
		frmNewCustomer.getContentPane().add(btnCancel);
	}
	
	//TODO will return true if data is valid
	private boolean validateData(){
		if(checkIsEmpty(nameField.getText()))return false;
		if(checkIsEmpty(creditCardField.getText()))return false;
		try{
			long l = Long.parseLong(creditCardField.getText());
		}catch(NumberFormatException nfe){
			return false;
		}
		if(checkIsEmpty(mailField.getText()))return false;
		return true;
	}
	
	//TODO returns true if string is not empty
	private boolean checkIsEmpty(String text){
		if(text.isEmpty()) return true;
		else return false;
	}
}