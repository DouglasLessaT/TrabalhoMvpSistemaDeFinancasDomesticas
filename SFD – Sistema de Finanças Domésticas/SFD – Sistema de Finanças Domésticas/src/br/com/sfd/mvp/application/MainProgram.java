package br.com.sfd.mvp.application;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import br.com.sfd.mvp.entities.ContaPanel;
import br.com.sfd.mvp.entities.LancamentosGastos;
import br.com.sfd.mvp.entities.LancamentosGastosPanel;
import br.com.sfd.mvp.entities.Prospeccao;
import br.com.sfd.mvp.entities.ProspeccaoPanel;
import br.com.sfd.mvp.entities.RendaMensal;
import br.com.sfd.mvp.entities.RendaMensalPanel;
import br.com.sfd.mvp.models.UsuarioPanel;

public class MainProgram {

    private List<LancamentosGastos> lancamentos;
    private List<RendaMensal> rendaMensalList;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainProgram window = new MainProgram();
                    window.initialize();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainProgram() {
        lancamentos = new ArrayList<>();
        rendaMensalList = new ArrayList<>();
    }

    private void initialize() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        JButton btnConta = new JButton("Conta");
        btnConta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
                exibirContaPanel();
            }
        });

        JButton btnProspeccao = new JButton("Prospecção");
        btnProspeccao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirProspeccaoPanel();
            }
        });

        JButton btnRendaMensal = new JButton("Renda Mensal");
        btnRendaMensal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirRendaMensalPanel();
            }
        });

        JButton btnLancamentosGastos = new JButton("Lançamentos Gastos");
        btnLancamentosGastos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirLancamentosPanel();
            }
        });

        JButton btnUsuario = new JButton("Usuário");
        btnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exibirUsuarioPanel();
            }
        });

        btnConta.setBounds(10, 10, 200, 23);
        btnProspeccao.setBounds(220, 10, 200, 23);
        btnRendaMensal.setBounds(430, 10, 200, 23);
        btnLancamentosGastos.setBounds(640, 10, 200, 23);
        btnUsuario.setBounds(850, 10, 200, 23);

        mainPanel.add(btnConta);
        mainPanel.add(btnProspeccao);
        mainPanel.add(btnRendaMensal);
        mainPanel.add(btnLancamentosGastos);
        mainPanel.add(btnUsuario);

        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 1280, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }

    private void exibirLancamentosPanel() {
        JFrame lancamentosFrame = new JFrame("Lançamentos de Gastos");
        lancamentosFrame.setSize(1280, 800);

        LancamentosGastosPanel lancamentosPanel = new LancamentosGastosPanel(lancamentos);
        lancamentosFrame.getContentPane().add(lancamentosPanel);

        lancamentosFrame.setVisible(true);
    }

    private void exibirUsuarioPanel() {
        JFrame usuarioFrame = new JFrame("Usuários");
        usuarioFrame.setSize(400, 300);

        UsuarioPanel usuarioPanel = new UsuarioPanel(new ArrayList<>());
        usuarioPanel.setBounds(10, 60, 380, 200);
        usuarioFrame.getContentPane().add(usuarioPanel);

        usuarioFrame.setVisible(true);
    }

    private void exibirContaPanel() {
        JFrame contaFrame = new JFrame("Conta");
        contaFrame.setSize(1280, 800);
        ContaPanel contaPanel = new ContaPanel(null);
        contaFrame.getContentPane().add(contaPanel);

        contaFrame.setVisible(true);
    }

    private void exibirRendaMensalPanel() {
        JFrame rendaMensalFrame = new JFrame("Renda Mensal");
        rendaMensalFrame.setSize(1000, 800);

        RendaMensalPanel rendaMensalPanel = new RendaMensalPanel(rendaMensalList);
        rendaMensalFrame.getContentPane().add(rendaMensalPanel);

        rendaMensalFrame.setVisible(true);
    }

    private void exibirProspeccaoPanel() {
        JFrame prospeccaoFrame = new JFrame("Prospecção");
        prospeccaoFrame.setSize(800, 600);

        Prospeccao prospeccao = new Prospeccao(1, "Descrição da Prospecção", 1000.0f, 12);
        ProspeccaoPanel prospeccaoPanel = new ProspeccaoPanel(prospeccao);
        prospeccaoFrame.getContentPane().add(prospeccaoPanel);

        prospeccaoFrame.setVisible(true);
    }
}
