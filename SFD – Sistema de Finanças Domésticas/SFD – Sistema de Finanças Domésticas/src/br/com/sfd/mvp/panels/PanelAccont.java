package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAccont extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldIdConta;
	private JTextField textFieldNumeroConta;
	private JTextField textField;

	public PanelAccont() {
		setBackground(new Color(17, 65, 82));
		setBounds(1, 1, 780, 464);
		setLayout(null);
		
		JPanel paneMenuHome = new JPanel();
		paneMenuHome.setBackground(new Color(17, 65, 82));
		paneMenuHome.setBounds(10, 11, 760, 42);
		add(paneMenuHome);
		paneMenuHome.setLayout(null);
		
		JPanel paneInserirConta = new JPanel();
		paneInserirConta.setBackground(new Color(17, 65, 82));
		paneInserirConta.addMouseListener(new PanelButtonMouseAdapter(paneInserirConta){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneInserirConta);
			}
		});
		paneInserirConta.setToolTipText("");
		paneInserirConta.setBounds(10, 5, 151, 30);
		paneMenuHome.add(paneInserirConta);
		
		JLabel lblInserirConta = new JLabel("Inserir ");
		lblInserirConta.setForeground(new Color(192, 192, 192));
		lblInserirConta.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserirConta.add(lblInserirConta);
		
		JPanel paneDeletarConta = new JPanel();
		paneDeletarConta.setToolTipText("");
		paneDeletarConta.addMouseListener(new PanelButtonMouseAdapter(paneDeletarConta){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneDeletarConta);
			}
		});
		paneDeletarConta.setBackground(new Color(17, 65, 82));
		paneDeletarConta.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletarConta);
		
		JLabel lblDeletarConta = new JLabel("Deletar ");
		lblDeletarConta.setForeground(new Color(192, 192, 192));
		lblDeletarConta.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletarConta.add(lblDeletarConta);
		
		JPanel paneAlterarConta = new JPanel();
		paneAlterarConta.setToolTipText("");
		paneAlterarConta.addMouseListener(new PanelButtonMouseAdapter(paneAlterarConta){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneDeletarConta);
			}
		});
		paneAlterarConta.setBackground(new Color(17, 65, 82));
		paneAlterarConta.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterarConta);
		
		JLabel lblAlterarConta = new JLabel("Alterar ");
		lblAlterarConta.setForeground(new Color(192, 192, 192));
		lblAlterarConta.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterarConta.add(lblAlterarConta);
		
		JPanel paneVerConta = new JPanel();
		paneVerConta.setToolTipText("");
		paneVerConta.addMouseListener(new PanelButtonMouseAdapter(paneVerConta){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneVerConta);
			}
		});
		paneVerConta.setBackground(new Color(17, 65, 82));
		paneVerConta.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVerConta);
		
		JLabel lblVerConta = new JLabel("Ver ");
		lblVerConta.setForeground(new Color(192, 192, 192));
		lblVerConta.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVerConta.add(lblVerConta);
		
		JPanel paneinformacoes = new JPanel();
		paneinformacoes.setBackground(new Color(17, 65, 82));
		paneinformacoes.setBounds(10, 64, 760, 113);
		add(paneinformacoes);
		paneinformacoes.setLayout(null);
		
		JLabel lblIdConta = new JLabel("ID CONTA: ");
		lblIdConta.setForeground(new Color(192, 192, 192));
		lblIdConta.setFont(new Font("Impact", Font.PLAIN, 15));
		lblIdConta.setBounds(10, 16, 77, 14);
		paneinformacoes.add(lblIdConta);
		
		textFieldIdConta = new JTextField();
		textFieldIdConta.setBounds(97, 10, 98, 20);
		paneinformacoes.add(textFieldIdConta);
		textFieldIdConta.setColumns(10);
		
		textFieldNumeroConta = new JTextField();
		textFieldNumeroConta.setColumns(10);
		textFieldNumeroConta.setBounds(97, 41, 98, 20);
		paneinformacoes.add(textFieldNumeroConta);
		
		JLabel lblNumeroConta = new JLabel("N. Conta:");
		lblNumeroConta.setForeground(Color.LIGHT_GRAY);
		lblNumeroConta.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNumeroConta.setBounds(10, 47, 77, 14);
		paneinformacoes.add(lblNumeroConta);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(97, 72, 98, 20);
		paneinformacoes.add(textField);
		
		JLabel lblNomeConta = new JLabel("Nome Conta:");
		lblNomeConta.setForeground(Color.LIGHT_GRAY);
		lblNomeConta.setFont(new Font("Impact", Font.PLAIN, 15));
		lblNomeConta.setBounds(10, 78, 86, 14);
		paneinformacoes.add(lblNomeConta);
		
		JPanel paneTabela = new JPanel();
		paneTabela.setBounds(10, 188, 760, 265);
		add(paneTabela);
		paneTabela.setLayout(null);
		setVisible(true);
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
