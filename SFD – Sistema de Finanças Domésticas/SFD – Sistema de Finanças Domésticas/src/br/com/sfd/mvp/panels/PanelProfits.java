package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelProfits extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textIdProspeccao;
	private JTextField textFieldValorProspeccao;
	private JTextField txtParcelas;
	private JTextField txtDescriao;

	/**
	 * Create the panel.
	 */
	public PanelProfits() {
		setBackground(new Color(17, 65, 82));
		setBounds(1, 1, 780, 464);
		setLayout(null);
		
		JPanel paneMenuHome = new JPanel();
		paneMenuHome.setBackground(new Color(17, 65, 82));
		paneMenuHome.setBounds(10, 11, 760, 42);
		add(paneMenuHome);
		paneMenuHome.setLayout(null);
		
		JPanel paneInserirProspeccao = new JPanel();
		paneInserirProspeccao.setBackground(new Color(17, 65, 82));
		paneInserirProspeccao.addMouseListener(new PanelButtonMouseAdapter(paneInserirProspeccao){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneInserirProspeccao);
			}
		});
		paneInserirProspeccao.setToolTipText("");
		paneInserirProspeccao.setBounds(10, 5, 151, 30);
		paneMenuHome.add(paneInserirProspeccao);
		
		JLabel lblInserirProspeccao = new JLabel("Inserir");
		lblInserirProspeccao.setForeground(new Color(192, 192, 192));
		lblInserirProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserirProspeccao.add(lblInserirProspeccao);
		
		JPanel paneDeletarProspeccao = new JPanel();
		paneDeletarProspeccao.setToolTipText("");
		paneDeletarProspeccao.addMouseListener(new PanelButtonMouseAdapter(paneDeletarProspeccao){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneDeletarProspeccao);
			}
		});
		paneDeletarProspeccao.setBackground(new Color(17, 65, 82));
		paneDeletarProspeccao.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletarProspeccao);
		
		JLabel lblDeletarProspeccao = new JLabel("Deletar ");
		lblDeletarProspeccao.setForeground(new Color(192, 192, 192));
		lblDeletarProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletarProspeccao.add(lblDeletarProspeccao);
		
		JPanel paneAlterarProspeccao = new JPanel();
		paneAlterarProspeccao.setToolTipText("");
		paneAlterarProspeccao.addMouseListener(new PanelButtonMouseAdapter(paneAlterarProspeccao){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneDeletarProspeccao);
			}
		});
		paneAlterarProspeccao.setBackground(new Color(17, 65, 82));
		paneAlterarProspeccao.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterarProspeccao);
		
		JLabel lblAlterarProspeccao = new JLabel("Alterar ");
		lblAlterarProspeccao.setForeground(new Color(192, 192, 192));
		lblAlterarProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterarProspeccao.add(lblAlterarProspeccao);
		
		JPanel paneVerProspeccao = new JPanel();
		paneVerProspeccao.setToolTipText("");
		paneVerProspeccao.addMouseListener(new PanelButtonMouseAdapter(paneVerProspeccao){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneVerProspeccao);
			}
		});
		paneVerProspeccao.setBackground(new Color(17, 65, 82));
		paneVerProspeccao.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVerProspeccao);
		
		JLabel lblVerProspeccao = new JLabel("Ver");
		lblVerProspeccao.setForeground(new Color(192, 192, 192));
		lblVerProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVerProspeccao.add(lblVerProspeccao);
		
		JPanel paneinformacoes = new JPanel();
		paneinformacoes.setBackground(new Color(17, 65, 82));
		paneinformacoes.setBounds(10, 64, 760, 113);
		add(paneinformacoes);
		paneinformacoes.setLayout(null);
		
		JLabel lblIdProspeccao = new JLabel("ID Prospeccao: ");
		lblIdProspeccao.setForeground(new Color(192, 192, 192));
		lblIdProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		lblIdProspeccao.setBounds(10, 17, 150, 14);
		paneinformacoes.add(lblIdProspeccao);
		

		textIdProspeccao = new JTextField();
		textIdProspeccao.setToolTipText("");
		textIdProspeccao.setHorizontalAlignment(SwingConstants.LEFT);
		textIdProspeccao.setBounds(176, 11, 120, 20);
		paneinformacoes.add(textIdProspeccao);
		textIdProspeccao.setColumns(10);
		
		textFieldValorProspeccao = new JTextField();
		textFieldValorProspeccao.setColumns(10);
		textFieldValorProspeccao.setBounds(176, 42, 120, 20);
		paneinformacoes.add(textFieldValorProspeccao);
		
		JLabel lblValorProspeccao = new JLabel("Valor Prospeccao: ");
		lblValorProspeccao.setForeground(Color.LIGHT_GRAY);
		lblValorProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		lblValorProspeccao.setBounds(10, 48, 150, 14);
		paneinformacoes.add(lblValorProspeccao);
		
		JLabel lblNumeroParcelas = new JLabel("Numero Prospeccao: ");
		lblNumeroParcelas.setForeground(Color.LIGHT_GRAY);
		lblNumeroParcelas.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNumeroParcelas.setBounds(306, 17, 150, 14);
		paneinformacoes.add(lblNumeroParcelas);
		
		txtParcelas = new JTextField();
		txtParcelas.setColumns(10);
		txtParcelas.setBounds(466, 11, 120, 20);
		paneinformacoes.add(txtParcelas);
		
		txtDescriao = new JTextField();
		txtDescriao.setText("\r\n");
		txtDescriao.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescriao.setColumns(10);
		txtDescriao.setBounds(466, 42, 263, 20);
		paneinformacoes.add(txtDescriao);
		
		JLabel lblDescricaoProspeccao = new JLabel("Descricao Prospeccao: ");
		lblDescricaoProspeccao.setForeground(Color.LIGHT_GRAY);
		lblDescricaoProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
		lblDescricaoProspeccao.setBounds(306, 48, 150, 14);
		paneinformacoes.add(lblDescricaoProspeccao);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 188, 760, 265);
		add(panel);
	}
	
	public void menuClicked(JPanel panel) {

		
	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		


		@Override
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(17, 65, 82));
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(17, 65, 82));
		}

		
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	}
}
