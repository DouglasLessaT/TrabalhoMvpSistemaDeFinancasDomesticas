package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.sfd.mvp.entities.LancamentosGastos;

public class PanelSpendingBids extends JPanel {
	private static final long serialVersionUID = 1L;
    private JTextField textFieldIdLacamentosG;
    private JTextField textFieldValorLacamentosg;
    private JTextField textFieldDataRendamensal;
    private JTextField textFieldQuantidadeLacamentosG;

    private JPanel paneInserir;
    private JPanel paneDeletar;
    private JPanel paneAlterar;
    private JPanel paneVer;
    
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
		
		textFieldIdLacamentosG = new JTextField();
		textFieldIdLacamentosG.setColumns(10);
		textFieldIdLacamentosG.setBounds(171, 11, 98, 20);
		paneinformacoes.add(textFieldIdLacamentosG);
		
		textFieldValorLacamentosg = new JTextField();
		textFieldValorLacamentosg.setColumns(10);
		textFieldValorLacamentosg.setBounds(171, 42, 98, 20);
		paneinformacoes.add(textFieldValorLacamentosg);
		
		JLabel lblValorLacamentosg = new JLabel("Valor LacamentosG:");
		lblValorLacamentosg.setForeground(Color.LIGHT_GRAY);
		lblValorLacamentosg.setFont(new Font("Impact", Font.PLAIN, 15));
		lblValorLacamentosg.setBounds(10, 47, 151, 14);
		paneinformacoes.add(lblValorLacamentosg);
		
		textFieldDataRendamensal = new JTextField();
		textFieldDataRendamensal.setColumns(10);
		textFieldDataRendamensal.setBounds(461, 11, 98, 20);
		paneinformacoes.add(textFieldDataRendamensal);
		
		JLabel lblDataRendamensal = new JLabel("Data RendaMensal:");
		lblDataRendamensal.setForeground(Color.LIGHT_GRAY);
		lblDataRendamensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblDataRendamensal.setBounds(279, 15, 172, 14);
		paneinformacoes.add(lblDataRendamensal);
		
		textFieldQuantidadeLacamentosG = new JTextField();
		textFieldQuantidadeLacamentosG.setText("\r\n");
		textFieldQuantidadeLacamentosG.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldQuantidadeLacamentosG.setColumns(10);
		textFieldQuantidadeLacamentosG.setBounds(461, 43, 263, 20);
		paneinformacoes.add(textFieldQuantidadeLacamentosG);
		
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
		
		JPanel paneInserir = new JPanel();
		paneInserir.addMouseListener(new PanelButtonMouseAdapter(paneInserir) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneInserir.setToolTipText("");
		paneInserir.setBackground(new Color(17, 65, 82));
		paneInserir.setBounds(10, 5, 151, 30);
		paneMenuHome.add(paneInserir);
		
		JLabel lblInserirLacamentosG = new JLabel("Inserir ");
		lblInserirLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblInserirLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserir.add(lblInserirLacamentosG);
		
		JPanel paneDeletar = new JPanel();
		paneDeletar.setToolTipText("");
		paneDeletar.addMouseListener(new PanelButtonMouseAdapter(paneDeletar) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneDeletar.setBackground(new Color(17, 65, 82));
		paneDeletar.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletar);
		
		JLabel lblDeletarLacamentosG = new JLabel("Deletar");
		lblDeletarLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblDeletarLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletar.add(lblDeletarLacamentosG);
		
		JPanel paneAlterar = new JPanel();
		paneAlterar.setToolTipText("");
		paneAlterar.addMouseListener(new PanelButtonMouseAdapter(paneAlterar) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneAlterar.setBackground(new Color(17, 65, 82));
		paneAlterar.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterar);
		
		JLabel lblAlterarLacamentosG = new JLabel("Alterar ");
		lblAlterarLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblAlterarLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterar.add(lblAlterarLacamentosG);
		
		JPanel paneVer = new JPanel();
		paneVer.setToolTipText("");
		paneVer.addMouseListener(new PanelButtonMouseAdapter(paneVer) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneVer.setBackground(new Color(17, 65, 82));
		paneVer.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVer);
		
		JLabel lblVerLacamentosG = new JLabel("Ver");
		lblVerLacamentosG.setForeground(Color.LIGHT_GRAY);
		lblVerLacamentosG.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVer.add(lblVerLacamentosG);
		
		JPanel paneContent = new JPanel();
		paneContent.setLayout(null);
		paneContent.setBounds(10, 151, 760, 302);
		add(paneContent);
		setVisible(true);
	}
	public void menuClicked(JPanel panel) {
	       if (panel == paneInserir) {
	            inserirLacamentosG();
	        } else if (panel == paneDeletar) {
	            deletarLacamentosG();
	        } else if (panel == paneAlterar) {
	            alterarLacamentosG();
	        } else if (panel == paneVer) {
	            verLacamentosG();
	        }
	}
	
	private void inserirLacamentosG() {
	    int idLancamentosG = Integer.parseInt(textFieldIdLacamentosG.getText());
	    float valorLacamentosG = Float.parseFloat(textFieldValorLacamentosg.getText());
	    Date dataRendaMensal = new Date();
	    String quantidadeLacamentosG = textFieldQuantidadeLacamentosG.getText();

	    // Criar um objeto LancamentosGastos com os dados fornecidos
	    LancamentosGastos lancamentos = new LancamentosGastos(idLancamentosG, valorLacamentosG, dataRendaMensal, quantidadeLacamentosG);

	    // Chamar o método para salvar o lançamento
	    lancamentos.salvarLancamento();
	    
	    // Mostrar mensagem de confirmação
	    JOptionPane.showMessageDialog(this, "Inserção concluída com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);

	    // Limpar os campos de texto após a inserção
	    textFieldIdLacamentosG.setText("");
	    textFieldValorLacamentosg.setText("");
	    textFieldDataRendamensal.setText("");
	    textFieldQuantidadeLacamentosG.setText("");
	}

	private void deletarLacamentosG() {
	    int idLancamentosG = Integer.parseInt(textFieldIdLacamentosG.getText());

	    // Chamar o método para buscar o lançamento pelo ID
	    LancamentosGastos lancamentos = LancamentosGastos.buscarLancamentoPorId(idLancamentosG);

	    // Verificar se o lançamento foi encontrado e excluir se for o caso
	    if (lancamentos != null) {
	        lancamentos.excluirLancamento();
	        // Mostrar mensagem de confirmação
	        JOptionPane.showMessageDialog(this, "Exclusão concluída com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);

	    }

	    // Limpar os campos de texto após a exclusão
	    textFieldIdLacamentosG.setText("");
	    textFieldValorLacamentosg.setText("");
	    textFieldDataRendamensal.setText("");
	    textFieldQuantidadeLacamentosG.setText("");
	}

	private void alterarLacamentosG() {
	    int idLancamentosG = Integer.parseInt(textFieldIdLacamentosG.getText());
	    float valorLacamentosG = Float.parseFloat(textFieldValorLacamentosg.getText());
	    Date dataRendaMensal = new Date();
	    String quantidadeLacamentosG = textFieldQuantidadeLacamentosG.getText();

	    // Chamar o método para buscar o lançamento pelo ID
	    LancamentosGastos lancamentos = LancamentosGastos.buscarLancamentoPorId(idLancamentosG);
	    
	    // Mostrar mensagem de confirmação
	    JOptionPane.showMessageDialog(this, "Atualização concluída com sucesso!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);

	    // Verificar se o lançamento foi encontrado e atualizar os dados se for o caso
	    if (lancamentos != null) {
	        lancamentos.setValorGasto(valorLacamentosG);
	        lancamentos.setDataGasto(dataRendaMensal);
	        lancamentos.setQuantidadePorConsumo(quantidadeLacamentosG);
	        lancamentos.atualizarLancamento();
	    }

	    // Limpar os campos de texto após a atualização
	    textFieldIdLacamentosG.setText("");
	    textFieldValorLacamentosg.setText("");
	    textFieldDataRendamensal.setText("");
	    textFieldQuantidadeLacamentosG.setText("");
	}

	private void verLacamentosG() {
	    int idLancamentosG = Integer.parseInt(textFieldIdLacamentosG.getText());

	    // Chamar o método para buscar o lançamento pelo ID
	    LancamentosGastos lancamentos = LancamentosGastos.buscarLancamentoPorId(idLancamentosG);

	    // Preencher os campos de texto com os dados do lançamento encontrado
	    if (lancamentos != null) {
	        textFieldValorLacamentosg.setText(Float.toString(lancamentos.getValorGasto()));
	        textFieldDataRendamensal.setText(formatDate(lancamentos.getDataGasto()));
	        textFieldQuantidadeLacamentosG.setText(lancamentos.getQuantidadePorConsumo());
	    } else {
	        textFieldValorLacamentosg.setText("");
	        textFieldDataRendamensal.setText("");
	        textFieldQuantidadeLacamentosG.setText("");
	    }
	}
	private String formatDate(Date date) {
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    return sdf.format(date);
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
