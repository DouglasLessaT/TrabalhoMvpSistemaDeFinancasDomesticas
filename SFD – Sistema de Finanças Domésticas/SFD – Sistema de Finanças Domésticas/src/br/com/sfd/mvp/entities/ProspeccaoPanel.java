package br.com.sfd.mvp.entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProspeccaoPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private Prospeccao prospeccao;
    private JTextField textFieldId;
    private JTextField textFieldDescricao;
    private JTextField textFieldValor;
    private JTextField textFieldParcelas;

    public ProspeccaoPanel(Prospeccao prospeccao) {
        this.prospeccao = prospeccao;
        setLayout(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(10, 11, 46, 14);
        add(lblId);

        textFieldId = new JTextField();
        textFieldId.setBounds(74, 8, 86, 20);
        add(textFieldId);
        textFieldId.setColumns(10);

        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(10, 36, 64, 14);
        add(lblDescricao);

        textFieldDescricao = new JTextField();
        textFieldDescricao.setBounds(74, 33, 86, 20);
        add(textFieldDescricao);
        textFieldDescricao.setColumns(10);

        JLabel lblValor = new JLabel("Valor:");
        lblValor.setBounds(10, 61, 46, 14);
        add(lblValor);

        textFieldValor = new JTextField();
        textFieldValor.setBounds(74, 58, 86, 20);
        add(textFieldValor);
        textFieldValor.setColumns(10);

        JLabel lblParcelas = new JLabel("Parcelas:");
        lblParcelas.setBounds(10, 86, 64, 14);
        add(lblParcelas);

        textFieldParcelas = new JTextField();
        textFieldParcelas.setBounds(74, 83, 86, 20);
        add(textFieldParcelas);
        textFieldParcelas.setColumns(10);

        JButton btnInserir = new JButton("Inserir");
        btnInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inserirProspeccao();
            }
        });
        btnInserir.setBounds(10, 114, 89, 23);
        add(btnInserir);
    }
    
    

    private void inserirProspeccao() {
        int id = Integer.parseInt(textFieldId.getText());
        String descricao = textFieldDescricao.getText();
        float valor = Float.parseFloat(textFieldValor.getText());
        int parcelas = Integer.parseInt(textFieldParcelas.getText());

        prospeccao = new Prospeccao(id, descricao, valor, parcelas);
        prospeccao.executarProspeccao();

        limparCampos();
    }

    private void limparCampos() {
        textFieldId.setText("");
        textFieldDescricao.setText("");
        textFieldValor.setText("");
        textFieldParcelas.setText("");
    }
}
