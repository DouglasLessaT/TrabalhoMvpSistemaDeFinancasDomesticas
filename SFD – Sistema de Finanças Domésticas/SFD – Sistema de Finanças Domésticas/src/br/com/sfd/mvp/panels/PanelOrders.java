package br.com.sfd.mvp.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PanelOrders extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelOrders() {
		setBounds(1, 1, 780, 464);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("panelorders");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(236, 132, 284, 159);
		add(lblNewLabel);
	}

}
