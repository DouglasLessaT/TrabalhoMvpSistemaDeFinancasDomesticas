package br.com.sfd.mvp.application;

import br.com.sfd.mvp.panels.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class FrameDashboard extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    private Image iconImage = new ImageIcon(FrameDashboard.class.getResource("/br/com/sfd/mvp/res/bank.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);

    private PanelAccount panelAccount;
    private PanelProfits panelProfits;
    private PanelMonthlyIncome panelMonthlyIncome;
    private PanelSpendingBids panelSpendingBids;
    private PanelSetting panelSetting;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FrameDashboard frame = new FrameDashboard();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FrameDashboard() {
        setBackground(new Color(47, 79, 79));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1080, 500);
        setUndecorated(true);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(17, 65, 82));
        contentPane.setForeground(new Color(46, 138, 153));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        panelAccount = new PanelAccount();
        panelAccount.setBackground(new Color(17, 65, 83));
        panelProfits = new PanelProfits();
        panelMonthlyIncome = new PanelMonthlyIncome();
        panelSpendingBids = new PanelSpendingBids();
        panelSetting = new PanelSetting();

        JPanel panelMenu = new JPanel();
        panelMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
        panelMenu.setBackground(new Color(31, 110, 140));
        panelMenu.setBounds(0, 0, 262, 500);
        contentPane.add(panelMenu);
        panelMenu.setLayout(null);

        JLabel lblIconLogo = new JLabel("");
        lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
        lblIconLogo.setBounds(10, 11, 241, 153);
        lblIconLogo.setIcon(new ImageIcon(iconImage));
        panelMenu.add(lblIconLogo);

        JPanel paneAccount = new JPanel();
        paneAccount.addMouseListener(new PanelButtonMouseAdapter(paneAccount) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(panelAccount);
            }
        });
        paneAccount.setBackground(new Color(31, 110, 140));
        paneAccount.setBounds(1, 173, 260, 34);
        panelMenu.add(paneAccount);
        paneAccount.setLayout(null);

        JLabel lblAccount = new JLabel("Conta");
        lblAccount.setForeground(new Color(192, 192, 192));
        lblAccount.setFont(new Font("Impact", Font.PLAIN, 14));
        lblAccount.setBounds(70, 10, 116, 14);
        lblAccount.setHorizontalAlignment(SwingConstants.LEFT);
        paneAccount.add(lblAccount);

        JPanel paneProfits = new JPanel();
        paneProfits.addMouseListener(new PanelButtonMouseAdapter(paneProfits) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(panelProfits);
            }
        });
        paneProfits.setBackground(new Color(31, 110, 140));
        paneProfits.setBounds(1, 205, 260, 34);
        panelMenu.add(paneProfits);
        paneProfits.setLayout(null);

        JLabel lblProfits = new JLabel("Prospecção");
        lblProfits.setForeground(new Color(192, 192, 192));
        lblProfits.setHorizontalAlignment(SwingConstants.LEFT);
        lblProfits.setFont(new Font("Impact", Font.PLAIN, 14));
        lblProfits.setBounds(70, 11, 116, 14);
        paneProfits.add(lblProfits);

        JPanel paneMonthlyIncome = new JPanel();
        paneMonthlyIncome.addMouseListener(new PanelButtonMouseAdapter(panelMonthlyIncome) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(panelMonthlyIncome);
            }
        });
        paneMonthlyIncome.setBackground(new Color(31, 110, 140));
        paneMonthlyIncome.setBounds(1, 237, 260, 34);
        panelMenu.add(paneMonthlyIncome);
        paneMonthlyIncome.setLayout(null);

        JLabel lblMonthlyIncome = new JLabel("Renda Mensal");
        lblMonthlyIncome.setForeground(new Color(192, 192, 192));
        lblMonthlyIncome.setHorizontalAlignment(SwingConstants.LEFT);
        lblMonthlyIncome.setFont(new Font("Impact", Font.PLAIN, 14));
        lblMonthlyIncome.setBounds(70, 10, 116, 14);
        paneMonthlyIncome.add(lblMonthlyIncome);

        JPanel paneSpendingBids = new JPanel();
        paneSpendingBids.addMouseListener(new PanelButtonMouseAdapter(paneSpendingBids) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(panelSpendingBids);
            }
        });

        paneSpendingBids.setBackground(new Color(31, 110, 140));
        paneSpendingBids.setBounds(1, 269, 260, 34);
        panelMenu.add(paneSpendingBids);
        paneSpendingBids.setLayout(null);

        JLabel lblSpendingBids = new JLabel("Lançamento de Gastos");
        lblSpendingBids.setForeground(new Color(192, 192, 192));
        lblSpendingBids.setHorizontalAlignment(SwingConstants.LEFT);
        lblSpendingBids.setFont(new Font("Impact", Font.PLAIN, 14));
        lblSpendingBids.setBounds(70, 10, 150, 14);
        paneSpendingBids.add(lblSpendingBids);

        JPanel paneSetting = new JPanel();
        paneSetting.addMouseListener(new PanelButtonMouseAdapter(paneSetting) {
            @Override
            public void mouseClicked(MouseEvent e) {
                menuClicked(panelSetting);
            }
        });
        paneSetting.setBackground(new Color(31, 110, 140));
        paneSetting.setBounds(1, 301, 260, 34);
        panelMenu.add(paneSetting);
        paneSetting.setLayout(null);

        JLabel lblSetting = new JLabel("Configurações");
        lblSetting.setForeground(new Color(192, 192, 192));
        lblSetting.setHorizontalAlignment(SwingConstants.LEFT);
        lblSetting.setFont(new Font("Impact", Font.PLAIN, 14));
        lblSetting.setBounds(70, 10, 116, 14);
        paneSetting.add(lblSetting);

        
        JPanel panelMainContent = new JPanel();
        panelMainContent.setBackground(new Color(17, 65, 83));
        panelMainContent.setBounds(272, 21, 787, 468);
        contentPane.add(panelMainContent);
        panelMainContent.setLayout(null);

        panelMainContent.add(panelAccount);
        panelMainContent.add(panelProfits);
        panelMainContent.add(panelMonthlyIncome);
        panelMainContent.add(panelSpendingBids);
        panelMainContent.add(panelSetting);

        menuClicked(panelAccount);
    }
    
    

    public void menuClicked(JPanel panel) {
        panelAccount.setVisible(false);
        panelProfits.setVisible(false);
        panelMonthlyIncome.setVisible(false);
        panelSpendingBids.setVisible(false);
        panelSetting.setVisible(false);

        panel.setVisible(true);
    }

    private class PanelButtonMouseAdapter extends MouseAdapter {

        JPanel panel;

        public PanelButtonMouseAdapter(JPanel paneSingOut) {
            this.panel = panel;
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            panel.setBackground(new Color(112, 128, 144));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            panel.setBackground(new Color(31, 110, 140));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            panel.setBackground(new Color(60, 179, 113));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            panel.setBackground(new Color(112, 128, 144));
        }

        @Override
        public void mouseClicked(MouseEvent e) {
        }
    }
}
