import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TicketMasterGUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameField;
	private JTextField emailField;
	private JTextField creditCardField;
	private JComboBox eventBox;
	
	private int remaining65 = 60000;
	private int remaining100 = 20000;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketMasterGUI frame = new TicketMasterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TicketMasterGUI() {
		setTitle("Ticket Master");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 359, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		final JLabel eventName = new JLabel("GARTH_BROOKES");
		eventName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		eventName.setBounds(171, 9, 141, 20);
		contentPane.add(eventName);
		
		String[] events = EventName.getEvents();
		eventBox = new JComboBox(events);
		eventBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent iev) {
				
				String selected = (String)eventBox.getSelectedItem();
				eventName.setText(selected);
				
			}
		});
		eventBox.setBounds(10, 11, 133, 20);
		eventBox.setSelectedIndex(0);
		contentPane.add(eventBox);
		
		final JLabel remainingTickets = new JLabel("60000");
		remainingTickets.setBounds(211, 68, 46, 14);
		contentPane.add(remainingTickets);
		
		JLabel lblTicket = new JLabel("Ticket");
		lblTicket.setBounds(10, 68, 46, 14);
		contentPane.add(lblTicket);
		
		String[] prices = {"€65", "€100"};
		final JComboBox ticketPrice = new JComboBox(prices);
		ticketPrice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				remainingTickets.setText((String) (ticketPrice.getSelectedItem().equals("€65") ? "" + remaining65 : "" + remaining100));
				
			}
		});
		ticketPrice.setBounds(56, 65, 75, 20);
		contentPane.add(ticketPrice);
		
		nameField = new JTextField();
		nameField.setBounds(10, 118, 86, 20);
		contentPane.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 93, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(116, 96, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCreditCardNumber = new JLabel("Credit Card Number");
		lblCreditCardNumber.setBounds(10, 152, 152, 14);
		contentPane.add(lblCreditCardNumber);
		
		emailField = new JTextField();
		emailField.setBounds(116, 118, 141, 20);
		contentPane.add(emailField);
		emailField.setColumns(10);
		
		creditCardField = new JTextField();
		creditCardField.setBounds(10, 177, 133, 20);
		contentPane.add(creditCardField);
		creditCardField.setColumns(10);
		
		JButton buyButton = new JButton("Buy Ticket(s)");
		buyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String name = nameField.getText();
				String email = emailField.getText();
				String creditCardNumber = creditCardField.getText();
				
				
				if(name.length() > 0){
					if(email.length() > 0 && email.contains("@")){
						
						if(creditCardNumber.length() > 0){
							
						}else{
							JOptionPane.showMessageDialog(null, "Invalid Credit Card Number");
						}
						
					}else{
						JOptionPane.showMessageDialog(null, "Invalid Email");
					}
				}else{
					JOptionPane.showMessageDialog(null, "Invalid Name");
				}
				
				
			}
		});
		buyButton.setBounds(10, 208, 110, 23);
		contentPane.add(buyButton);
		
		JLabel lblRemaining = new JLabel("Remaining: ");
		lblRemaining.setBounds(141, 68, 75, 14);
		contentPane.add(lblRemaining);
		
		
	}
}
