package br.com.sfd.mvp.panels;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;

public class PanelSetting extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8754064385170323836L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public PanelSetting() {
		setBackground(new Color(17, 65, 82));
		setBounds(1, 1, 780, 464);
		setLayout(null);
		
		JPanel paneTabela = new JPanel();
		paneTabela.setLayout(null);
		paneTabela.setBounds(10, 151, 760, 302);
		add(paneTabela);
		
		JPanel paneinformacoes = new JPanel();
		paneinformacoes.setLayout(null);
		paneinformacoes.setBackground(new Color(17, 65, 82));
		paneinformacoes.setBounds(10, 64, 760, 76);
		add(paneinformacoes);
		
		JLabel lblIdUsuario = new JLabel("ID Usuario: ");
		lblIdUsuario.setForeground(Color.LIGHT_GRAY);
		lblIdUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		lblIdUsuario.setBounds(10, 16, 151, 14);
		paneinformacoes.add(lblIdUsuario);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 11, 98, 20);
		paneinformacoes.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 42, 98, 20);
		paneinformacoes.add(textField_1);
		
		JLabel lblValorRendaMensal = new JLabel("Nome Usuario:");
		lblValorRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblValorRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblValorRendaMensal.setBounds(10, 47, 151, 14);
		paneinformacoes.add(lblValorRendaMensal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(461, 11, 98, 20);
		paneinformacoes.add(textField_2);
		
		JLabel lblDataRendamensal = new JLabel(" Senha:");
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
		
		JLabel lblDescricaoRendamensal = new JLabel("Confirmar senha : ");
		lblDescricaoRendamensal.setForeground(Color.LIGHT_GRAY);
		lblDescricaoRendamensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblDescricaoRendamensal.setBounds(279, 48, 172, 14);
		paneinformacoes.add(lblDescricaoRendamensal);
		
		JPanel paneMenuHome = new JPanel();
		paneMenuHome.setLayout(null);
		paneMenuHome.setBackground(new Color(17, 65, 82));
		paneMenuHome.setBounds(10, 11, 760, 42);
		add(paneMenuHome);
		
		JPanel paneInserirUsuario = new JPanel();
		paneInserirUsuario.setToolTipText("");
		paneInserirUsuario.setBackground(new Color(17, 65, 82));
		paneInserirUsuario.setBounds(10, 5, 151, 30);
		paneMenuHome.add(paneInserirUsuario);
		
		JLabel lblInserirUsuario = new JLabel("Inserir ");
		lblInserirUsuario.setForeground(Color.LIGHT_GRAY);
		lblInserirUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserirUsuario.add(lblInserirUsuario);
		
		JPanel paneDeletarUsuario = new JPanel();
		paneDeletarUsuario.setToolTipText("");
		paneDeletarUsuario.setBackground(new Color(17, 65, 82));
		paneDeletarUsuario.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletarUsuario);
		
		JLabel lblDeletarUsuario = new JLabel("Deletar");
		lblDeletarUsuario.setForeground(Color.LIGHT_GRAY);
		lblDeletarUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletarUsuario.add(lblDeletarUsuario);
		
		JPanel paneAlterarUsuario = new JPanel();
		paneAlterarUsuario.setToolTipText("");
		paneAlterarUsuario.setBackground(new Color(17, 65, 82));
		paneAlterarUsuario.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterarUsuario);
		
		JLabel lblAlterarUsuario = new JLabel("Alterar ");
		lblAlterarUsuario.setForeground(Color.LIGHT_GRAY);
		lblAlterarUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterarUsuario.add(lblAlterarUsuario);
		
		JPanel paneVerUsuario = new JPanel();
		paneVerUsuario.setToolTipText("");
		paneVerUsuario.setBackground(new Color(17, 65, 82));
		paneVerUsuario.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVerUsuario);
		
		JLabel lblVerUsuario = new JLabel("Ver");
		lblVerUsuario.setForeground(Color.LIGHT_GRAY);
		lblVerUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVerUsuario.add(lblVerUsuario);
		setVisible(true);
	}

}
