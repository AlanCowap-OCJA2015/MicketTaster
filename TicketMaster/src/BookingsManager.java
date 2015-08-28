import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingsManager extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingsManager frame = new BookingsManager();
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
	public BookingsManager() {
		MainFrame.setLookAndFeel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 220, 118);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel pricePanel = new JPanel();
		contentPane.add(pricePanel, BorderLayout.NORTH);

		JLabel priceLabel = new JLabel("Price: ");
		pricePanel.add(priceLabel);

		JLabel priceLabelVar = new JLabel("XXXXXX");
		pricePanel.add(priceLabelVar);

		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.CENTER);

		JButton customerButton = new JButton("Customer");
		buttonPanel.add(customerButton);
		JButton bookingButton = new JButton("Book");


		buttonPanel.add(bookingButton);

		//action listeners
		customerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CustomerList().setVisible(true);
			}
		});


	}
}
