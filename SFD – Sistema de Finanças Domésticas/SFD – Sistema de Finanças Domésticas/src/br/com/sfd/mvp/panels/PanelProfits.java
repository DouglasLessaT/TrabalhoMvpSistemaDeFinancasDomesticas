package br.com.sfd.mvp.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PanelProfits extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public PanelProfits() {
		setBounds(1, 1, 780, 464);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("panelprofits");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel.setBounds(205, 123, 342, 189);
		add(lblNewLabel);
	}

}
