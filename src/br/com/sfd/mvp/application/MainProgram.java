package br.com.sfd.mvp.application;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.sfd.mvp.entities.ContaPanel;
import br.com.sfd.mvp.entities.LancamentosGastos;
import br.com.sfd.mvp.entities.LancamentosGastosPanel;
import br.com.sfd.mvp.entities.Prospeccao;
import br.com.sfd.mvp.entities.ProspeccaoPanel;
import br.com.sfd.mvp.entities.RendaMensal;
import br.com.sfd.mvp.entities.RendaMensalPanel;
import br.com.sfd.mvp.entities.UsuarioPanel;

public class MainProgram {

    private JFrame frame;
    private List<LancamentosGastos> lancamentos;
    private List<RendaMensal> rendaMensalList;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainProgram window = new MainProgram();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainProgram() {
        lancamentos = new ArrayList<>();
        rendaMensalList = new ArrayList<>();
        initialize();
        
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1280, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

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
        btnUsuario.setBounds(850, 10, 200, 23);
        frame.getContentPane().add(btnUsuario);

        btnConta.setBounds(10, 10, 200, 23);
        frame.getContentPane().add(btnConta);

        btnProspeccao.setBounds(220, 10, 200, 23);
        frame.getContentPane().add(btnProspeccao);

        btnRendaMensal.setBounds(430, 10, 200, 23);
        frame.getContentPane().add(btnRendaMensal);

        btnLancamentosGastos.setBounds(640, 10, 200, 23);
        frame.getContentPane().add(btnLancamentosGastos);

        btnUsuario.setBounds(850, 10, 200, 23);
        frame.getContentPane().add(btnUsuario);
    }
/*    private static void criarArquivo() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o arquivo.");
            e.printStackTrace();
        }
    }
*/
    private void exibirLancamentosPanel() {
        JFrame lancamentosFrame = new JFrame("Lançamentos de Gastos");
        lancamentosFrame.setSize(1280, 800);

        LancamentosGastosPanel lancamentosPanel = new LancamentosGastosPanel(lancamentos);
        lancamentosFrame.add(lancamentosPanel);

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
        ContaPanel contaPanel = new ContaPanel();
        contaFrame.add(contaPanel);

        contaFrame.setVisible(true);
    }

    private void exibirRendaMensalPanel() {
        JFrame rendaMensalFrame = new JFrame("Renda Mensal");
        rendaMensalFrame.setSize(1000, 800);

        RendaMensalPanel rendaMensalPanel = new RendaMensalPanel(rendaMensalList);
        rendaMensalFrame.add(rendaMensalPanel);

        rendaMensalFrame.setVisible(true);
    }

    private void exibirProspeccaoPanel() {
        JFrame prospeccaoFrame = new JFrame("Prospecção");
        prospeccaoFrame.setSize(800, 600);

        Prospeccao prospeccao = new Prospeccao(1, "Descrição da Prospecção", 1000.0f, 12);
        ProspeccaoPanel prospeccaoPanel = new ProspeccaoPanel(prospeccao);
        prospeccaoFrame.add(prospeccaoPanel);

        prospeccaoFrame.setVisible(true);
    }
}
