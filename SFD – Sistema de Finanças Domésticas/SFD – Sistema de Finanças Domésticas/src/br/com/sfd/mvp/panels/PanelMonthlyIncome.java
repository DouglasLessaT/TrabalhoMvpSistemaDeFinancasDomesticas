package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelMonthlyIncome extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public PanelMonthlyIncome() {
		setBackground(new Color(17, 65, 82));
		setBounds(1, 1, 780, 464);
		setLayout(null);
		
		JPanel paneinformacoes = new JPanel();
		paneinformacoes.setLayout(null);
		paneinformacoes.setBackground(new Color(17, 65, 82));
		paneinformacoes.setBounds(10, 64, 760, 76);
		add(paneinformacoes);
		
		JLabel lblIdConta = new JLabel("ID RendaMensal: ");
		lblIdConta.setForeground(Color.LIGHT_GRAY);
		lblIdConta.setFont(new Font("Impact", Font.PLAIN, 15));
		lblIdConta.setBounds(10, 16, 151, 14);
		paneinformacoes.add(lblIdConta);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 11, 98, 20);
		paneinformacoes.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 42, 98, 20);
		paneinformacoes.add(textField_1);
		
		JLabel lblValorRendaMensal = new JLabel("Valor RendaMensal:");
		lblValorRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblValorRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblValorRendaMensal.setBounds(10, 47, 151, 14);
		paneinformacoes.add(lblValorRendaMensal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(461, 11, 98, 20);
		paneinformacoes.add(textField_2);
		
		JLabel lblDataRendamensal = new JLabel("Data RendaMensal:");
		lblDataRendamensal.setForeground(Color.LIGHT_GRAY);
		lblDataRendamensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblDataRendamensal.setBounds(279, 15, 172, 14);
		paneinformacoes.add(lblDataRendamensal);
		
		textField_3 = new JTextField();
		textField_3.setText("\r\n");
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		textField_3.setBounds(461, 43, 263, 20);
		paneinformacoes.add(textField_3);
		
		JLabel lblDescricaoRendamensal = new JLabel("Descricao RendaMensal: ");
		lblDescricaoRendamensal.setForeground(Color.LIGHT_GRAY);
		lblDescricaoRendamensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblDescricaoRendamensal.setBounds(279, 48, 172, 14);
		paneinformacoes.add(lblDescricaoRendamensal);
		
		JPanel paneMenuHome = new JPanel();
		paneMenuHome.setLayout(null);
		paneMenuHome.setBackground(new Color(17, 65, 82));
		paneMenuHome.setBounds(10, 11, 760, 42);
		add(paneMenuHome);
		
		JPanel paneInserirRendaMensal = new JPanel();
		paneInserirRendaMensal.addMouseListener(new PanelButtonMouseAdapter(paneInserirRendaMensal){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneInserirRendaMensal);
			}
		});
		paneInserirRendaMensal.setToolTipText("");
		paneInserirRendaMensal.setBackground(new Color(17, 65, 82));
		paneInserirRendaMensal.setBounds(10, 5, 151, 30);
		paneMenuHome.add(paneInserirRendaMensal);
		
		JLabel lblInserirRendaMensal = new JLabel("Inserir ");
		lblInserirRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblInserirRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserirRendaMensal.add(lblInserirRendaMensal);
		
		JPanel paneDeletarRendaMensal = new JPanel();
		paneDeletarRendaMensal.addMouseListener(new PanelButtonMouseAdapter(paneDeletarRendaMensal) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneDeletarRendaMensal);
			}
		});
		paneDeletarRendaMensal.setToolTipText("");
		paneDeletarRendaMensal.setBackground(new Color(17, 65, 82));
		paneDeletarRendaMensal.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletarRendaMensal);
		
		JLabel lblDeletarRendaMensal = new JLabel("Deletar");
		lblDeletarRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblDeletarRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletarRendaMensal.add(lblDeletarRendaMensal);
		
		JPanel paneAlterarRendaMensal = new JPanel();
		paneAlterarRendaMensal.setToolTipText("");
		paneAlterarRendaMensal.addMouseListener(new PanelButtonMouseAdapter(paneAlterarRendaMensal) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneAlterarRendaMensal);
			}
		});
		paneAlterarRendaMensal.setBackground(new Color(17, 65, 82));
		paneAlterarRendaMensal.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterarRendaMensal);
		
		JLabel lblAlterarRendaMensal = new JLabel("Alterar ");
		lblAlterarRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblAlterarRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterarRendaMensal.add(lblAlterarRendaMensal);
		
		JPanel paneVerRendaMensal = new JPanel();
		paneVerRendaMensal.setToolTipText("");
		paneVerRendaMensal.addMouseListener(new PanelButtonMouseAdapter(paneVerRendaMensal) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(paneVerRendaMensal);
			}
		});
		paneVerRendaMensal.setBackground(new Color(17, 65, 82));
		paneVerRendaMensal.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVerRendaMensal);
		
		JLabel lblVerRendaMensal = new JLabel("Ver");
		lblVerRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblVerRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVerRendaMensal.add(lblVerRendaMensal);
		
		JPanel paneTabela = new JPanel();
		paneTabela.setLayout(null);
		paneTabela.setBounds(10, 151, 760, 302);
		add(paneTabela);
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
