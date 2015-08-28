import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.Rectangle;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("Booking Menu");
		setLookAndFeel();
		//Integer.parseInt(args[0]);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel concertPanel = new JPanel();
		concertPanel.setLayout(new BoxLayout(concertPanel, BoxLayout.X_AXIS));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new EmptyBorder(5, 5, 5, 10));
		JLabel concertLabel = new JLabel("Concert");
		
		comboBox.addItem("Concert 1");
		comboBox.addItem("Concert 2");
		comboBox.addItem("Concert 3");
		comboBox.addItem("Concert 4");
		comboBox.addItem("Concert 5");
		
		concertPanel.add(comboBox);
		concertPanel.add(concertLabel);
		
		getContentPane().add(concertPanel, BorderLayout.NORTH);
		
		JPanel mainPanel = new JPanel();
		JLabel ticketsLeft = new JLabel("Tickets Left: ");
		JLabel ticketsLeftVariable = new JLabel("XXXXXX");
		mainPanel.add(ticketsLeft);
		mainPanel.add(ticketsLeftVariable);
		contentPane.add(mainPanel, BorderLayout.WEST);
		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		JButton bookingsBtn = new JButton("Bookings");
		bookingsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new BookingsFrame().setVisible(true);
			}
		});
		JButton eventsBtn = new JButton("Events");
		
		buttonPanel.add(bookingsBtn);
		buttonPanel.add(eventsBtn);
		
		
		
	}
	
	static void setLookAndFeel() {
		try {
			// Set System L&F
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		} 
		catch (UnsupportedLookAndFeelException e) {
			// handle exception
		}
		catch (ClassNotFoundException e) {
			// handle exception
		}
		catch (InstantiationException e) {
			// handle exception
		}
		catch (IllegalAccessException e) {
			// handle exception
		}

	}

}
