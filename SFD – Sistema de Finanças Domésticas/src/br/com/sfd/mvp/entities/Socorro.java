package br.com.sfd.mvp.entities;

import br.com.sfd.mvp.entities.Conta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Socorro extends JFrame {

    private JTextArea textoArea;

    public Socorro() {
        setTitle("Salvar: ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel contentPane = new JPanel(new BorderLayout());

        textoArea = new JTextArea();
        contentPane.add(new JScrollPane(textoArea), BorderLayout.CENTER);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarArquivo();
            }
        });
        contentPane.add(btnSalvar, BorderLayout.SOUTH);

        setContentPane(contentPane);
    }

    private void salvarArquivo() {
        Conta conta = new Conta(1, "Conta 1");
        String conteudo = "ID da Conta: " + conta.getIdConta() + "\n" +
                "Nome da Conta: " + conta.getNomeConta();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int resultado = fileChooser.showSaveDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File diretorio = fileChooser.getSelectedFile();
            String caminhoArquivo = diretorio.getAbsolutePath() + File.separator + "informacoes.txt";

            try {
                FileWriter writer = new FileWriter(caminhoArquivo);
                writer.write(conteudo);
                writer.close();
                JOptionPane.showMessageDialog(this, "Arquivo salvo com sucesso em: " + caminhoArquivo);
            } catch (IOException e) {
                e.printStackTrace();
    
            }
        }
    }

 
}
