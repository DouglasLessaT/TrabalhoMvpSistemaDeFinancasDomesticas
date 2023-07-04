package br.com.sfd.mvp.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelCustomers extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelCustomers() {
		setBounds(1, 1, 780, 464);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("panelcustumers");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(230, 135, 310, 116);
		add(lblNewLabel);
	}

}
