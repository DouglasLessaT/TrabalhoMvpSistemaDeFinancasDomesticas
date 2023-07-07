package br.com.sfd.mvp.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelSpendingBids extends JPanel {

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
	public PanelSpendingBids() {
		setBackground(new Color(17, 65, 82));
		setBounds(1, 1, 780, 464);
		setLayout(null);
		
		JPanel paneinformacoes = new JPanel();
		paneinformacoes.setLayout(null);
		paneinformacoes.setBackground(new Color(17, 65, 82));
		paneinformacoes.setBounds(10, 64, 760, 76);
		add(paneinformacoes);
		
		JLabel lblIdLacamentosG = new JLabel("ID LacamentosG: ");
		lblIdLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblIdLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		lblIdLacamentosG.setBounds(10, 16, 151, 14);
		paneinformacoes.add(lblIdLacamentosG);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 11, 98, 20);
		paneinformacoes.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 42, 98, 20);
		paneinformacoes.add(textField_1);
		
		JLabel lblValorLacamentosg = new JLabel("Valor LacamentosG:");
		lblValorLacamentosg.setForeground(Color.LIGHT_GRAY);
		lblValorLacamentosg.setFont(new Font("Impact", Font.PLAIN, 15));
		lblValorLacamentosg.setBounds(10, 47, 151, 14);
		paneinformacoes.add(lblValorLacamentosg);
		
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
		
		JLabel lblQuantidadeLacamentosG = new JLabel("Quantidade LacamentosG: ");
		lblQuantidadeLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblQuantidadeLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		lblQuantidadeLacamentosG.setBounds(279, 48, 172, 14);
		paneinformacoes.add(lblQuantidadeLacamentosG);
		
		JPanel paneMenuHome = new JPanel();
		paneMenuHome.setLayout(null);
		paneMenuHome.setBackground(new Color(17, 65, 82));
		paneMenuHome.setBounds(10, 11, 760, 42);
		add(paneMenuHome);
		
		JPanel paneInserirLacamentosG = new JPanel();
		paneInserirLacamentosG.addMouseListener(new PanelButtonMouseAdapter(paneInserirLacamentosG) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneInserirLacamentosG.setToolTipText("");
		paneInserirLacamentosG.setBackground(new Color(17, 65, 82));
		paneInserirLacamentosG.setBounds(10, 5, 151, 30);
		paneMenuHome.add(paneInserirLacamentosG);
		
		JLabel lblInserirLacamentosG = new JLabel("Inserir ");
		lblInserirLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblInserirLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserirLacamentosG.add(lblInserirLacamentosG);
		
		JPanel paneDeletarLacamentosG = new JPanel();
		paneDeletarLacamentosG.setToolTipText("");
		paneDeletarLacamentosG.addMouseListener(new PanelButtonMouseAdapter(paneDeletarLacamentosG) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneDeletarLacamentosG.setBackground(new Color(17, 65, 82));
		paneDeletarLacamentosG.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletarLacamentosG);
		
		JLabel lblDeletarLacamentosG = new JLabel("Deletar");
		lblDeletarLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblDeletarLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletarLacamentosG.add(lblDeletarLacamentosG);
		
		JPanel paneAlterarLacamentosG = new JPanel();
		paneAlterarLacamentosG.setToolTipText("");
		paneAlterarLacamentosG.addMouseListener(new PanelButtonMouseAdapter(paneAlterarLacamentosG) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneAlterarLacamentosG.setBackground(new Color(17, 65, 82));
		paneAlterarLacamentosG.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterarLacamentosG);
		
		JLabel lblAlterarLacamentosG = new JLabel("Alterar ");
		lblAlterarLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblAlterarLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterarLacamentosG.add(lblAlterarLacamentosG);
		
		JPanel paneVerLacamentosG = new JPanel();
		paneVerLacamentosG.setToolTipText("");
		paneVerLacamentosG.addMouseListener(new PanelButtonMouseAdapter(paneVerLacamentosG) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneVerLacamentosG.setBackground(new Color(17, 65, 82));
		paneVerLacamentosG.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVerLacamentosG);
		
		JLabel lblVerLacamentosG = new JLabel("Ver");
		lblVerLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblVerLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVerLacamentosG.add(lblVerLacamentosG);
		
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
