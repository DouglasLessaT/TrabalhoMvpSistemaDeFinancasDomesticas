package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelSetting extends JPanel {


	private static final long serialVersionUID = -8754064385170323836L;
	private JTextField textFielddUsuario;
	private JTextField textFieldNomeUsuario;
	private JTextField textFieldSenhaUsuario;
	private JTextField textFieldSenhaUsuarioC;
	
    private JPanel paneInserir;
    private JPanel paneDeletar;
    private JPanel paneVer;

    
    
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
		
		textFielddUsuario = new JTextField();
		textFielddUsuario.setColumns(10);
		textFielddUsuario.setBounds(171, 11, 98, 20);
		paneinformacoes.add(textFielddUsuario);
		
		textFieldNomeUsuario = new JTextField();
		textFieldNomeUsuario.setColumns(10);
		textFieldNomeUsuario.setBounds(171, 42, 98, 20);
		paneinformacoes.add(textFieldNomeUsuario);
		
		JLabel lblValorRendaMensal = new JLabel("Nome Usuario:");
		lblValorRendaMensal.setForeground(Color.LIGHT_GRAY);
		lblValorRendaMensal.setFont(new Font("Impact", Font.PLAIN, 15));
		lblValorRendaMensal.setBounds(10, 47, 151, 14);
		paneinformacoes.add(lblValorRendaMensal);
		
		textFieldSenhaUsuario = new JTextField();
		textFieldSenhaUsuario.setColumns(10);
		textFieldSenhaUsuario.setBounds(461, 11, 98, 20);
		paneinformacoes.add(textFieldSenhaUsuario);
		
		JLabel lblSenhaUsuario = new JLabel(" Senha:");
		lblSenhaUsuario.setForeground(Color.LIGHT_GRAY);
		lblSenhaUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		lblSenhaUsuario.setBounds(279, 15, 172, 14);
		paneinformacoes.add(lblSenhaUsuario);
		
		textFieldSenhaUsuarioC = new JTextField();
		textFieldSenhaUsuarioC.setText("\r\n");
		textFieldSenhaUsuarioC.setHorizontalAlignment(SwingConstants.LEFT);
		textFieldSenhaUsuarioC.setColumns(10);
		textFieldSenhaUsuarioC.setBounds(461, 43, 263, 20);
		paneinformacoes.add(textFieldSenhaUsuarioC);
		
		JLabel lblSenhaUsuarioC = new JLabel("Confirmar senha : ");
		lblSenhaUsuarioC.setForeground(Color.LIGHT_GRAY);
		lblSenhaUsuarioC.setFont(new Font("Impact", Font.PLAIN, 15));
		lblSenhaUsuarioC.setBounds(279, 48, 172, 14);
		paneinformacoes.add(lblSenhaUsuarioC);
		
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
		
		JLabel lblInserirUsuario = new JLabel("Inserir ");
		lblInserirUsuario.setForeground(Color.LIGHT_GRAY);
		lblInserirUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneInserir.add(lblInserirUsuario);
		
		JPanel paneDeletar = new JPanel();
		paneDeletar.addMouseListener(new PanelButtonMouseAdapter(paneDeletar) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneDeletar.setToolTipText("");
		paneDeletar.setBackground(new Color(17, 65, 82));
		paneDeletar.setBounds(171, 5, 151, 30);
		paneMenuHome.add(paneDeletar);
		
		JLabel lblDeletarUsuario = new JLabel("Deletar");
		lblDeletarUsuario.setForeground(Color.LIGHT_GRAY);
		lblDeletarUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneDeletar.add(lblDeletarUsuario);
		
		JPanel paneAlterar = new JPanel();
		paneAlterar.addMouseListener(new PanelButtonMouseAdapter(paneDeletar) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneAlterar.setToolTipText("");
		paneAlterar.setBackground(new Color(17, 65, 82));
		paneAlterar.setBounds(332, 5, 151, 30);
		paneMenuHome.add(paneAlterar);
		
		JLabel lblAlterarUsuario = new JLabel("Alterar ");
		lblAlterarUsuario.setForeground(Color.LIGHT_GRAY);
		lblAlterarUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneAlterar.add(lblAlterarUsuario);
		
		JPanel paneVer = new JPanel();
		paneVer.addMouseListener(new PanelButtonMouseAdapter(paneVer) {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		paneVer.setToolTipText("");
		paneVer.setBackground(new Color(17, 65, 82));
		paneVer.setBounds(493, 5, 151, 30);
		paneMenuHome.add(paneVer);
		
		JLabel lblVerUsuario = new JLabel("Ver");
		lblVerUsuario.setForeground(Color.LIGHT_GRAY);
		lblVerUsuario.setFont(new Font("Impact", Font.PLAIN, 15));
		paneVer.add(lblVerUsuario);
		setVisible(true);
	}
	
    public void menuClicked(JPanel panel) {
        if (panel == paneInserir) {
            inserirUsuario();
        } else if (panel == paneDeletar) {
            deletarUsuario();
        } else if (panel == paneVer) {
            verUsuario();
        }
    }
    private void inserirUsuario() {
   
    }
    private void deletarUsuario() {

    }

    private void verUsuario() {

    }

    
    private class PanelButtonMouseAdapter extends MouseAdapter {

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
