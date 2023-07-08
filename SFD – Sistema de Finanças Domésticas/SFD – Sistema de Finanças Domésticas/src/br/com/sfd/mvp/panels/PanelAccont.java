package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.sfd.mvp.entities.Conta;

public class PanelAccont extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField textFieldIdConta;
    private JTextField textFieldNumeroConta;
    private JTextField textFieldNomeConta;
    private List<Conta> contas;
    private Conta conta;
    private JPanel paneInserir;
    private JPanel paneDeletar;
    private JPanel paneAlterar;
    private JPanel paneVer;

    public PanelAccont() {
        setBackground(new Color(17, 65, 82));
        setBounds(1, 1, 780, 464);
        setLayout(null);

        JPanel paneMenuHome = new JPanel();
        paneMenuHome.setBackground(new Color(17, 65, 82));
        paneMenuHome.setBounds(10, 11, 760, 42);
        add(paneMenuHome);
        paneMenuHome.setLayout(null);

        paneInserir = new JPanel();
        paneInserir.setBackground(new Color(17, 65, 82));
        paneInserir.addMouseListener(new PanelButtonMouseAdapter(paneInserir) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(paneInserir);
            }
        });
        paneInserir.setToolTipText("");
        paneInserir.setBounds(10, 5, 151, 30);
        paneMenuHome.add(paneInserir);

        JLabel lblInserirConta = new JLabel("Inserir ");
        lblInserirConta.setForeground(new Color(192, 192, 192));
        lblInserirConta.setFont(new Font("Impact", Font.PLAIN, 15));
        paneInserir.add(lblInserirConta);

        paneDeletar = new JPanel();
        paneDeletar.setToolTipText("");
        paneDeletar.addMouseListener(new PanelButtonMouseAdapter(paneDeletar) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(paneDeletar);
            }
        });
        paneDeletar.setBackground(new Color(17, 65, 82));
        paneDeletar.setBounds(171, 5, 151, 30);
        paneMenuHome.add(paneDeletar);

        JLabel lblDeletarConta = new JLabel("Deletar ");
        lblDeletarConta.setForeground(new Color(192, 192, 192));
        lblDeletarConta.setFont(new Font("Impact", Font.PLAIN, 15));
        paneDeletar.add(lblDeletarConta);

        paneAlterar = new JPanel();
        paneAlterar.setToolTipText("");
        paneAlterar.addMouseListener(new PanelButtonMouseAdapter(paneAlterar) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(paneAlterar);
            }
        });
        paneAlterar.setBackground(new Color(17, 65, 82));
        paneAlterar.setBounds(332, 5, 151, 30);
        paneMenuHome.add(paneAlterar);

        JLabel lblAlterarConta = new JLabel("Alterar ");
        lblAlterarConta.setForeground(new Color(192, 192, 192));
        lblAlterarConta.setFont(new Font("Impact", Font.PLAIN, 15));
        paneAlterar.add(lblAlterarConta);

        paneVer = new JPanel();
        paneVer.setToolTipText("");
        paneVer.addMouseListener(new PanelButtonMouseAdapter(paneVer) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(paneVer);
            }
        });
        paneVer.setBackground(new Color(17, 65, 82));
        paneVer.setBounds(493, 5, 151, 30);
        paneMenuHome.add(paneVer);

        JLabel lblVerConta = new JLabel("Ver ");
        lblVerConta.setForeground(new Color(192, 192, 192));
        lblVerConta.setFont(new Font("Impact", Font.PLAIN, 15));
        paneVer.add(lblVerConta);

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

        textFieldNomeConta = new JTextField();
        textFieldNomeConta.setColumns(10);
        textFieldNomeConta.setBounds(97, 72, 98, 20);
        paneinformacoes.add(textFieldNomeConta);

        JLabel lblNomeConta = new JLabel("Nome Conta:");
        lblNomeConta.setForeground(Color.LIGHT_GRAY);
        lblNomeConta.setFont(new Font("Impact", Font.PLAIN, 15));
        lblNomeConta.setBounds(10, 78, 86, 14);
        paneinformacoes.add(lblNomeConta);

        JPanel paneContat = new JPanel();
        paneContat.setBounds(10, 188, 760, 265);
        add(paneContat);
        paneContat.setLayout(null);

        setVisible(true);

        contas = new ArrayList<>();
    }

    public void menuClicked(JPanel panel) {
        if (panel == paneInserir) {
            inserirConta();
        } else if (panel == paneDeletar) {
            deletarConta();
        } else if (panel == paneAlterar) {
            alterarConta();
        } else if (panel == paneVer) {
            verConta();
        }
    }

    private void inserirConta() {
        try {
            int id = Integer.parseInt(textFieldIdConta.getText());
            String nome = textFieldNomeConta.getText();
            String numero = textFieldNumeroConta.getText();
            Conta novaConta = new Conta(id, nome, numero);
            contas.add(novaConta);
            novaConta.executarConta();
            salvarContas("contas.txt");

            if (nome != null && numero != null) {


                Conta conta = new Conta(id, nome, numero);
                try (FileOutputStream fileOut = new FileOutputStream("contas.txt");
                     ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

                    objectOut.writeObject(conta);
                    System.out.println("Conta salva com sucesso.");

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter ID da conta para um número inteiro.");
        }

        
    }
    
    private void salvarContas(String arquivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            outputStream.writeObject(contas);
        } catch (IOException e) {
            System.out.println("Erro ao salvar contas: " + e.getMessage());
        }
    }

    private void deletarConta() {
        int id = Integer.parseInt(textFieldIdConta.getText());

        Conta contaRemover = null;
        for (Conta c : contas) {
            if (c.getIdConta() == id) {
                contaRemover = c;
                break;
            }
        }
        if (contaRemover != null) {
            contas.remove(contaRemover);
            salvarContas("contas.txt");
            
            JOptionPane.showMessageDialog(this, "Conta removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Conta não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void alterarConta() {
        int id = Integer.parseInt(textFieldIdConta.getText());
        String nome = textFieldNomeConta.getText();
        String numeroConta = textFieldNumeroConta.getText();

        for (Conta c : contas) {
            if (c.getIdConta() == id) {
                c.setNomeConta(nome);
                c.setNumeroConta(numeroConta);
                salvarContas("contas.txt");
                JOptionPane.showMessageDialog(this, "Conta alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Conta não encontrada.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
        
        }
    }

    private void verConta() {
        int id = Integer.parseInt(textFieldIdConta.getText());

        Conta contaEncontrada = null;
        for (Conta c : contas) {
            if (c.getIdConta() == id) {
                contaEncontrada = c;
                break;
            }
        }

        if (contaEncontrada != null) {
            textFieldIdConta.setText(Integer.toString(contaEncontrada.getIdConta()));
            textFieldNomeConta.setText(contaEncontrada.getNomeConta());
            textFieldNumeroConta.setText(contaEncontrada.getNumeroConta());
        } else {
            textFieldIdConta.setText("");
            textFieldNomeConta.setText("");
            textFieldNumeroConta.setText("");
        }
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
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