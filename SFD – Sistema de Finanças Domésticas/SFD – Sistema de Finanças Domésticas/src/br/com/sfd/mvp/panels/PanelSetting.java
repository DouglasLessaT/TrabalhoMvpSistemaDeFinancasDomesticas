package br.com.sfd.mvp.panels;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelSetting extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8754064385170323836L;

	public PanelSetting() {
		setBounds(1, 1, 780, 464);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("panelsettings");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(196, 134, 374, 154);
		add(lblNewLabel);
	}

}
