import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookingsFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingsFrame frame = new BookingsFrame();
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
	public BookingsFrame() {
		setTitle("Tiers Available");

		MainFrame.setLookAndFeel();

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 277, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel tier1Panel = new JPanel();
		tier1Panel.setBounds(10, 11, 241, 79);
		contentPane.add(tier1Panel);

		JButton tier1Button = new JButton("Book");

		
		

		tier1Button.setBounds(158, 21, 55, 23);
		tier1Panel.setLayout(null);

		JLabel tier1label = new JLabel("Tier 1 Tickets: 65\u20AC");
		tier1label.setBounds(10, 8, 138, 17);
		tier1label.setFont(new Font("Tahoma", Font.BOLD, 14));
		tier1Panel.add(tier1label);
		JLabel tier1TicketsLeft = new JLabel("Tickets Left: ");
		tier1TicketsLeft.setBounds(10, 36, 62, 14);
		tier1Panel.add(tier1TicketsLeft);
		JLabel tier1TicketsLeftVar = new JLabel("XXXX");
		tier1TicketsLeftVar.setBounds(82, 36, 24, 14);
		tier1Panel.add(tier1TicketsLeftVar);
		tier1Panel.add(tier1Button);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 101, 241, 79);
		contentPane.add(panel);

		JLabel tier2Tickets = new JLabel("Tier 2 Tickets: 100\u20AC");
		tier2Tickets.setFont(new Font("Tahoma", Font.BOLD, 14));
		tier2Tickets.setBounds(10, 8, 138, 17);
		panel.add(tier2Tickets);

		JLabel tier2TicketsLeft = new JLabel("Tickets Left: ");
		tier2TicketsLeft.setBounds(10, 36, 62, 14);
		panel.add(tier2TicketsLeft);

		JLabel tier2TicketsLeftVar = new JLabel("XXXX");
		tier2TicketsLeftVar.setBounds(82, 36, 24, 14);
		panel.add(tier2TicketsLeftVar);

		JButton tier2Button = new JButton("Book");
		tier2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		tier2Button.setBounds(158, 21, 55, 23);
		panel.add(tier2Button);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 186, 241, 52);
		contentPane.add(panel_1);

		JButton btnManageTiers = new JButton("Manage Tiers");
		panel_1.add(btnManageTiers);
		
		
		//action listeners
		tier1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new BookingsManager().setVisible(true);

			}
		});
		
		tier2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				new BookingsManager().setVisible(true);

			}
		});
	}
}
