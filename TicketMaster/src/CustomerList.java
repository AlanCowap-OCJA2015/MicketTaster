import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.JScrollPane;

public class CustomerList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerList frame = new CustomerList();
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
	public CustomerList() {
		setTitle("Customers");
		MainFrame.setLookAndFeel();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel customerListLabel = new JLabel("Customer List");
		customerListLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(customerListLabel);
		
		
		DefaultListModel model = new DefaultListModel();
		JList customerList = new JList(model);
		//customerList.setListData("Alex");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		model.addElement("ALEX");
		
		
		//customerList.setFixedCellWidth(150);
		
		
		
		JScrollPane scrollPane = new JScrollPane(customerList);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.EAST);
		
		
		//scrollPane.add(customerList);
	}

}
