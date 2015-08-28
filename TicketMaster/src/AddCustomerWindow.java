import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class AddCustomerWindow {

	private JFrame frmNewCustomer;
	private JTextField nameField;
	private JTextField creditCardField;
	private JTextField emailField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddCustomerWindow window = new AddCustomerWindow(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//					window.frmNewCustomer.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public AddCustomerWindow(int tier, int price) {
		initialize(tier, price);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int tier, int price) {
		frmNewCustomer = new JFrame();
		frmNewCustomer.setTitle("New Customer");
		frmNewCustomer.setBounds(100, 100, 305, 269);
		frmNewCustomer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNewCustomer.getContentPane().setLayout(null);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameField.setBounds(125, 11, 142, 20);
		frmNewCustomer.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFullName.setBounds(20, 14, 74, 14);
		frmNewCustomer.getContentPane().add(lblFullName);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		lblCreditCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCreditCardNumber.setBounds(20, 45, 113, 14);
		frmNewCustomer.getContentPane().add(lblCreditCardNumber);
		
		creditCardField = new JTextField();
		creditCardField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		creditCardField.setBounds(125, 42, 142, 20);
		frmNewCustomer.getContentPane().add(creditCardField);
		creditCardField.setColumns(10);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		emailField.setBounds(125, 72, 142, 20);
		frmNewCustomer.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		JLabel lblEmail = new JLabel("e-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEmail.setBounds(20, 75, 46, 14);
		frmNewCustomer.getContentPane().add(lblEmail);
		
		JLabel lblTicketPrice = new JLabel("Ticket price");
		lblTicketPrice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTicketPrice.setBounds(20, 133, 86, 14);
		frmNewCustomer.getContentPane().add(lblTicketPrice);
		
		JLabel lblPrice = new JLabel("" + price);
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPrice.setBounds(125, 133, 46, 14);
		frmNewCustomer.getContentPane().add(lblPrice);
		
		JLabel lblTier = new JLabel("Tier");
		lblTier.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTier.setBounds(20, 112, 46, 14);
		frmNewCustomer.getContentPane().add(lblTier);
		
		JLabel tierLabel = new JLabel("" + tier);
		tierLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tierLabel.setBounds(125, 108, 46, 14);
		frmNewCustomer.getContentPane().add(tierLabel);
		
		JButton submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		submitButton.setBounds(122, 181, 89, 23);
		frmNewCustomer.getContentPane().add(submitButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cancelButton.setBounds(23, 181, 89, 23);
		frmNewCustomer.getContentPane().add(cancelButton);
		
		
	}
}
