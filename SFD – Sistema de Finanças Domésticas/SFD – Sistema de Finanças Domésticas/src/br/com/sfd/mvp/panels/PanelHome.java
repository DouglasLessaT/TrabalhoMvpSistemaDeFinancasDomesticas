package br.com.sfd.mvp.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelHome extends JPanel {

	private static final long serialVersionUID = 1L;

	public PanelHome() {
		setBounds(1, 1, 780, 464);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel = new JLabel("panelHome");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblNewLabel.setBounds(220, 148, 295, 130);
		add(lblNewLabel);
	}


}
