package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import br.com.sfd.mvp.entities.Prospeccao;

public class ProspeccaoPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel idLabel;
    private JTextField idField;
    private JLabel descricaoLabel;
    private JTextField descricaoField;
    private JLabel valorLabel;
    private JTextField valorField;
    private JLabel parcelasLabel;
    private JTextField parcelasField;
    private JButton executarButton;

    public ProspeccaoPanel() {
        setTitle("Prospecção");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        idLabel = new JLabel("ID da Prospeccao:");
        idField = new JTextField(10);

        descricaoLabel = new JLabel("Descrição:");
        descricaoField = new JTextField(10);

        valorLabel = new JLabel("Valor:");
        valorField = new JTextField(10);

        parcelasLabel = new JLabel("Parcelas:");
        parcelasField = new JTextField(10);

        executarButton = new JButton("Executar Prospeccao");

        panel.add(idLabel);
        panel.add(idField);
        panel.add(descricaoLabel);
        panel.add(descricaoField);
        panel.add(valorLabel);
        panel.add(valorField);
        panel.add(parcelasLabel);
        panel.add(parcelasField);
        panel.add(executarButton);

        executarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String descricao = descricaoField.getText();
                float valor = Float.parseFloat(valorField.getText());
                int parcelas = Integer.parseInt(parcelasField.getText());

                Prospeccao prospeccao = new Prospeccao(id, descricao, valor, parcelas);
                prospeccao.executarProspeccao();
            }
        });

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProspeccaoPanel prospeccaoGUI = new ProspeccaoPanel();
            prospeccaoGUI.setVisible(true);
        });
    }
}
