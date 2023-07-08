package br.com.sfd.mvp.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.sfd.mvp.entities.Prospeccao;

public class PanelProfits extends JPanel {

    private static final long serialVersionUID = 1L;
    private Prospeccao prospeccao;
    private JTextField textFieldId;
    private JTextField textFieldValor;
    private JTextField txtFieldParcelas;
    private JTextField txtFieldDescriao;

    private JPanel paneInserir;
    private JPanel paneDeletar;
    private JPanel paneVer;

    public PanelProfits() {

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

        JLabel lblInserirProspeccao = new JLabel("Inserir");
        lblInserirProspeccao.setForeground(new Color(192, 192, 192));
        lblInserirProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        paneInserir.add(lblInserirProspeccao);

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

        JLabel lblDeletarProspeccao = new JLabel("Deletar ");
        lblDeletarProspeccao.setForeground(new Color(192, 192, 192));
        lblDeletarProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        paneDeletar.add(lblDeletarProspeccao);

        JPanel paneAlterar = new JPanel();
        paneAlterar.setToolTipText("");
        paneAlterar.addMouseListener(new PanelButtonMouseAdapter(paneAlterar) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(paneDeletar);
            }
        });
        paneAlterar.setBackground(new Color(17, 65, 82));
        paneAlterar.setBounds(332, 5, 151, 30);
        paneMenuHome.add(paneAlterar);

        JLabel lblAlterarProspeccao = new JLabel("Alterar ");
        lblAlterarProspeccao.setForeground(new Color(192, 192, 192));
        lblAlterarProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        paneAlterar.add(lblAlterarProspeccao);

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

        JLabel lblVerProspeccao = new JLabel("Ver");
        lblVerProspeccao.setForeground(new Color(192, 192, 192));
        lblVerProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        paneVer.add(lblVerProspeccao);

        JPanel paneinformacoes = new JPanel();
        paneinformacoes.setBackground(new Color(17, 65, 82));
        paneinformacoes.setBounds(10, 64, 760, 113);
        add(paneinformacoes);
        paneinformacoes.setLayout(null);

        JLabel lblIdProspeccao = new JLabel("ID Prospeccao: ");
        lblIdProspeccao.setForeground(new Color(192, 192, 192));
        lblIdProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        lblIdProspeccao.setBounds(10, 17, 150, 14);
        paneinformacoes.add(lblIdProspeccao);

        textFieldId = new JTextField();
        textFieldId.setToolTipText("");
        textFieldId.setHorizontalAlignment(SwingConstants.LEFT);
        textFieldId.setBounds(176, 11, 120, 20);
        paneinformacoes.add(textFieldId);
        textFieldId.setColumns(10);

        textFieldValor = new JTextField();
        textFieldValor.setColumns(10);
        textFieldValor.setBounds(176, 42, 120, 20);
        paneinformacoes.add(textFieldValor);

        JLabel lblValorProspeccao = new JLabel("Valor Prospeccao: ");
        lblValorProspeccao.setForeground(Color.LIGHT_GRAY);
        lblValorProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        lblValorProspeccao.setBounds(10, 48, 150, 14);
        paneinformacoes.add(lblValorProspeccao);

        JLabel lblNumeroParcelas = new JLabel("Numero Prospeccao: ");
        lblNumeroParcelas.setForeground(Color.LIGHT_GRAY);
        lblNumeroParcelas.setFont(new Font("Impact", Font.PLAIN, 15));
        lblNumeroParcelas.setBounds(306, 17, 150, 14);
        paneinformacoes.add(lblNumeroParcelas);

        txtFieldParcelas = new JTextField();
        txtFieldParcelas.setColumns(10);
        txtFieldParcelas.setBounds(466, 11, 120, 20);
        paneinformacoes.add(txtFieldParcelas);

        txtFieldDescriao = new JTextField();
        txtFieldDescriao.setText("\r\n");
        txtFieldDescriao.setHorizontalAlignment(SwingConstants.LEFT);
        txtFieldDescriao.setColumns(10);
        txtFieldDescriao.setBounds(466, 42, 263, 20);
        paneinformacoes.add(txtFieldDescriao);

        JLabel lblDescricaoProspeccao = new JLabel("Descricao Prospeccao: ");
        lblDescricaoProspeccao.setForeground(Color.LIGHT_GRAY);
        lblDescricaoProspeccao.setFont(new Font("Impact", Font.PLAIN, 15));
        lblDescricaoProspeccao.setBounds(306, 48, 150, 14);
        paneinformacoes.add(lblDescricaoProspeccao);

        JPanel panelcontent = new JPanel();
       panelcontent.setBounds(10, 188, 760, 265);
        add(panelcontent);
    }

    public void menuClicked(JPanel panel) {
        if (panel == paneInserir) {
            inserirProspeccao();
        } else if (panel == paneDeletar) {
            deletarProspeccao();
        } else if (panel == paneVer) {
            verProspeccao();
        }
    }

    private void inserirProspeccao() {
        try {
            int id = Integer.parseInt(textFieldId.getText());
            String descricao = txtFieldDescriao.getText();
            float valor = Float.parseFloat(textFieldValor.getText());
            int parcelas = Integer.parseInt(txtFieldParcelas.getText());

            prospeccao = new Prospeccao(id, descricao, valor, parcelas);
            prospeccao.executarProspeccao();
            JOptionPane.showMessageDialog(this, "prospeccaa salva", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter ID da prospecçao para um número inteiro.");
        }
    }

    private void deletarProspeccao() {
        try {
            int id = Integer.parseInt(textFieldId.getText());
            String arquivo = "prospeccao.dat";
            Prospeccao prospeccao = Prospeccao.carregarProspeccao(arquivo);

            if (prospeccao != null && prospeccao.getIdProspeccao() == id) {
                prospeccao = null;
                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo));
                outputStream.writeObject(prospeccao);
                JOptionPane.showMessageDialog(this, "prospeccaa deletada", "Erro", JOptionPane.ERROR_MESSAGE);
                outputStream.close();
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter ID da prospecção para um número inteiro.");
        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo de prospecção.");
        }
    }

    private void verProspeccao() {
    	JOptionPane.showMessageDialog(this, "nao fucionando ainda", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void limparCampos() {
        textFieldId.setText("");
        txtFieldDescriao.setText("");
        textFieldValor.setText("");
        txtFieldParcelas.setText("");
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