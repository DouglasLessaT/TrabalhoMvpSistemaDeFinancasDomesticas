package br.com.sfd.mvp.models;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UsuarioPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField idField;
    private JTextField nomeField;
    private JTextField senhaField;
    private JTextField confirmaSenhaField;
    private JButton addButton;
    private JButton removeButton;
    private JButton exibirButton;

    private List<Usuario> usuarios;

    public UsuarioPanel(List<Usuario> usuarios) {
        this.usuarios = usuarios;

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 90, 150, 30);
        idField = new JTextField();
        idField.setBounds(170, 90, 225, 30);
        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10, 135, 150, 30);
        nomeField = new JTextField();
        nomeField.setBounds(170, 131, 225, 30);
        JLabel senhaLabel = new JLabel("Senha:");
        senhaLabel.setBounds(10, 176, 150, 30);
        senhaField = new JTextField();
        senhaField.setBounds(170, 172, 225, 30);
        JLabel confirmaSenhaLabel = new JLabel("Confirmar Senha:");
        confirmaSenhaLabel.setBounds(10, 217, 150, 30);
        confirmaSenhaField = new JTextField();
        confirmaSenhaField.setBounds(170, 217, 225, 30);

        addButton = new JButton("Adicionar");
        addButton.setBounds(10, 11, 150, 30);
        removeButton = new JButton("Remover");
        removeButton.setBounds(170, 11, 150, 30);
        exibirButton = new JButton("Exibir");
        exibirButton.setBounds(330, 11, 150, 30);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarUsuario();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerUsuario();
            }
        });

        exibirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirUsuarios();
            }
        });

        setLayout(null);
        add(idLabel);
        add(idField);
        add(nomeLabel);
        add(nomeField);
        add(senhaLabel);
        add(senhaField);
        add(confirmaSenhaLabel);
        add(confirmaSenhaField);
        add(addButton);
        add(removeButton);
        add(exibirButton);
    }

    private void adicionarUsuario() {
        int id = Integer.parseInt(idField.getText());
        String nome = nomeField.getText();
        String senha = senhaField.getText();
        String confirmaSenha = confirmaSenhaField.getText();

        Usuario usuario = new Usuario(id, nome, senha, confirmaSenha);
        usuarios.add(usuario);

        limparCampos();
    }

    private void removerUsuario() {
        int id = Integer.parseInt(idField.getText());

        Usuario usuarioRemover = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getIdUsuario() == id) {
                usuarioRemover = usuario;
                break;
            }
        }

        if (usuarioRemover != null) {
            usuarios.remove(usuarioRemover);
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário não encontrado!");
        }
    }

    private void limparCampos() {
        idField.setText("");
        nomeField.setText("");
        senhaField.setText("");
        confirmaSenhaField.setText("");
    }

    private void exibirUsuarios() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Lista de Usuários ===\n");
        for (Usuario usuario : usuarios) {
            sb.append("ID: ").append(usuario.getIdUsuario()).append("\n");
            sb.append("Nome: ").append(usuario.getNome()).append("\n");
            sb.append("-----------------------------\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString(), "Usuários", JOptionPane.INFORMATION_MESSAGE);
    }
}
