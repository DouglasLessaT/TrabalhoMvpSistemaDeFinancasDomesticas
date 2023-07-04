package br.com.sfd.mvp.entities;


import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContaPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JLabel idLabel;
    private JTextField idField;
    private JLabel nomeLabel;
    private JTextField nomeField;
    private JLabel contaLabel; // Novo componente
    private JTextField contaField; // Novo componente

    private JButton inserirButton;
    private JButton deletarButton;
    private JButton alterarButton;
    private JButton verButton;
    private List<Conta> contas;
    private Conta conta;

    public ContaPanel(List<Conta> contas) {
        this.contas = contas;
        initComponents();
        setConta(new Conta());
    }

    private void initComponents() {
        setLayout(null);

        idLabel = new JLabel("ID da Conta:");
        idLabel.setBounds(10, 10, 100, 20);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(120, 10, 100, 20);
        add(idField);

        nomeLabel = new JLabel("Nome da Conta:");
        nomeLabel.setBounds(10, 40, 100, 20);
        add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(120, 40, 100, 20);
        add(nomeField);

        contaLabel = new JLabel("Número da Conta:"); // Novo componente
        contaLabel.setBounds(10, 70, 100, 20); // Novo componente
        add(contaLabel); // Novo componente

        contaField = new JTextField(); // Novo componente
        contaField.setBounds(120, 70, 100, 20); // Novo componente
        add(contaField); // Novo componente

        inserirButton = new JButton("Inserir Conta");
        inserirButton.setBounds(10, 100, 120, 23);
        inserirButton.addActionListener(e -> inserirConta());
        add(inserirButton);

        deletarButton = new JButton("Deletar Conta");
        deletarButton.setBounds(140, 100, 120, 23);
        deletarButton.addActionListener(e -> deletarConta());
        add(deletarButton);

        alterarButton = new JButton("Alterar Conta");
        alterarButton.setBounds(270, 100, 120, 23);
        alterarButton.addActionListener(e -> alterarConta());
        add(alterarButton);

        verButton = new JButton("Ver Conta");
        verButton.setBounds(400, 100, 120, 23);
        verButton.addActionListener(e -> verConta());
        add(verButton);
    }

    private void inserirConta() {
        int id = Integer.parseInt(idField.getText());
        String nome = nomeField.getText();
        String numeroConta = contaField.getText();
        Conta novaConta = new Conta(id, nome, numeroConta);
        contas.add(novaConta);
    }

    private void deletarConta() {
        int id = Integer.parseInt(idField.getText());

        Conta contaRemover = null;
        for (Conta c : contas) {
            if (c.getIdConta() == id) {
                contaRemover = c;
                break;
            }
        }

        if (contaRemover != null) {
            contas.remove(contaRemover);
        }
    }

    private void alterarConta() {
        int id = Integer.parseInt(idField.getText());
        String nome = nomeField.getText();
        String numeroConta = contaField.getText();

        for (Conta c : contas) {
            if (c.getIdConta() == id) {
                c.setNomeConta(nome);
                c.setNumeroConta(numeroConta);
                break;
            }
        }
    }

    private void verConta() {
        int id = Integer.parseInt(idField.getText());

        Conta contaEncontrada = null;
        for (Conta c : contas) {
            if (c.getIdConta() == id) {
                contaEncontrada = c;
                break;
            }
        }

        if (contaEncontrada != null) {
            idField.setText(Integer.toString(contaEncontrada.getIdConta()));
            nomeField.setText(contaEncontrada.getNomeConta());
            contaField.setText(contaEncontrada.getNumeroConta());
        } else {
            idField.setText("");
            nomeField.setText("");
            contaField.setText("");
        }
    }

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
}