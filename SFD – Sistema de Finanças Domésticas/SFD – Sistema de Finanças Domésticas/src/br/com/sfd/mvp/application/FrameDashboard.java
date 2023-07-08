package br.com.sfd.mvp.application;

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

import br.com.sfd.mvp.panels.PanelSpendingBids;
import br.com.sfd.mvp.panels.PanelAccont;
import br.com.sfd.mvp.panels.PanelMonthlyIncome;
import br.com.sfd.mvp.panels.PanelProfits;
import br.com.sfd.mvp.panels.PanelSetting;

public class FrameDashboard extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private Image iconImage = new ImageIcon( FrameDashboard.class.getResource("/br/com/sfd/mvp/res/bank.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private PanelAccont panelAccont;
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
		
	    panelAccont = new PanelAccont();
	    panelAccont.setBackground(new Color(17, 65, 83));
	    panelProfits = new PanelProfits(); 
	    panelMonthlyIncome = new PanelMonthlyIncome();
	    panelSpendingBids = new PanelSpendingBids();
	    panelSetting = new PanelSetting();	    		
		
		JPanel panemenu = new JPanel();
		panemenu.setBorder(new LineBorder(new Color(0, 0, 0)));
		panemenu.setBackground(new Color(31, 110, 140));
		panemenu.setBounds(0, 0, 262, 500);
		contentPane.add(panemenu);
		panemenu.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(10, 11, 241, 153);
		lblIconLogo.setIcon(new ImageIcon(iconImage));;
		panemenu.add(lblIconLogo);
		
		JPanel paneAccont = new JPanel();
		paneAccont.addMouseListener(new PanelButtonMouseAdapter(paneAccont){

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelAccont);
			}
		});
		paneAccont.setBackground(new Color(31, 110, 140));
		paneAccont.setBounds(1, 173, 260, 34);
		panemenu.add(paneAccont);
		paneAccont.setLayout(null);
		
		JLabel lblConta = new JLabel("Conta");
		lblConta.setForeground(new Color(192, 192, 192));
		lblConta.setFont(new Font("Impact", Font.PLAIN, 14));
		lblConta.setBounds(70, 10, 116, 14);
		lblConta.setHorizontalAlignment(SwingConstants.LEFT);
		paneAccont.add(lblConta);
		
		JPanel paneProfits = new JPanel();
		paneProfits.addMouseListener(new PanelButtonMouseAdapter(paneProfits){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelProfits);
			}
		});
		paneProfits.setBackground(new Color(31, 110, 140));
		paneProfits.setBounds(1, 205, 260, 34);
		panemenu.add(paneProfits);
		paneProfits.setLayout(null);
		
		JLabel lblProfits = new JLabel("Prospecção");
		lblProfits.setForeground(new Color(192, 192, 192));
		lblProfits.setHorizontalAlignment(SwingConstants.LEFT);
		lblProfits.setFont(new Font("Impact", Font.PLAIN, 14));
		lblProfits.setBounds(70, 11, 116, 14);
		paneProfits.add(lblProfits);
		
		JPanel paneMonthlyIncome = new JPanel();
		paneMonthlyIncome.addMouseListener(new PanelButtonMouseAdapter(paneMonthlyIncome){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelMonthlyIncome);
			}
		});
		paneMonthlyIncome.setBackground(new Color(31, 110, 140));
		paneMonthlyIncome.setBounds(1, 237, 260, 34);
		panemenu.add(paneMonthlyIncome);
		paneMonthlyIncome.setLayout(null);
		
		JLabel lblRendaMensal = new JLabel("Renda Mensal");
		lblRendaMensal.setForeground(new Color(192, 192, 192));
		lblRendaMensal.setHorizontalAlignment(SwingConstants.LEFT);
		lblRendaMensal.setFont(new Font("Impact", Font.PLAIN, 14));
		lblRendaMensal.setBounds(70, 10, 116, 14);
		paneMonthlyIncome.add(lblRendaMensal);
		
		JPanel paneSpendingBids = new JPanel();
		paneSpendingBids.addMouseListener(new PanelButtonMouseAdapter(paneSpendingBids){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelSpendingBids);
			}
		});
		paneSpendingBids.setBackground(new Color(31, 110, 140));
		paneSpendingBids.setBounds(1, 269, 260, 34);
		panemenu.add(paneSpendingBids);
		paneSpendingBids.setLayout(null);
		
		JLabel lblLancamentoGastos = new JLabel("Lancamento gastos");
		lblLancamentoGastos.setForeground(new Color(192, 192, 192));
		lblLancamentoGastos.setHorizontalAlignment(SwingConstants.LEFT);
		lblLancamentoGastos.setFont(new Font("Impact", Font.PLAIN, 14));
		lblLancamentoGastos.setBounds(70, 10, 116, 14);
		paneSpendingBids.add(lblLancamentoGastos);
		
		JPanel paneSetting = new JPanel();
		paneSetting.addMouseListener(new PanelButtonMouseAdapter(paneSetting));
//		paneSetting.addMouseListener(new PanelButtonMouseAdapter(paneSetting){
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				menuClicked(panelSetting);
//			}
//		});
		paneSetting.setBackground(new Color(31, 110, 140));
		paneSetting.setBounds(1, 301, 260, 34);
		panemenu.add(paneSetting);
		paneSetting.setLayout(null);
		
		JLabel lblUsuarios = new JLabel("Usuarios");
		lblUsuarios.setForeground(new Color(192, 192, 192));
		lblUsuarios.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuarios.setFont(new Font("Impact", Font.PLAIN, 14));
		lblUsuarios.setBounds(70, 10, 116, 14);
		paneSetting.add(lblUsuarios);
		
		JPanel paneSingOut = new JPanel();
		paneSingOut.addMouseListener(new PanelButtonMouseAdapter(paneSingOut));
//		paneSingOut.addMouseListener(new PanelButtonMouseAdapter(paneSingOut){
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				if(JOptionPane.showConfirmDialog(null, "are you sure you wnat to sing out?")==0) {
//					FrameLogin frmaeLogin = new FrameLogin();
//					FrameLogin.setVisible(true);
//					FrameDashboard.this.dispose();
//				}
//
//			}
//		});
		paneSingOut.setBackground(new Color(31, 110, 140));
		paneSingOut.setBounds(1, 333, 260, 34);
		panemenu.add(paneSingOut);
		paneSingOut.setLayout(null);
		
		JLabel lblSingout = new JLabel("Singout");
		lblSingout.setForeground(new Color(192, 192, 192));
		lblSingout.setHorizontalAlignment(SwingConstants.LEFT);
		lblSingout.setFont(new Font("Impact", Font.PLAIN, 14));
		lblSingout.setBounds(70, 10, 116, 14);
		paneSingOut.add(lblSingout);
		
		JLabel lblExit = new JLabel("X");
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setForeground(Color.WHITE);
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblExit.setBounds(1064, 0, 16, 14);
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want close this application?","confirmation", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
					FrameDashboard.this.dispose();
				}
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblExit.setForeground(Color.WHITE);
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblExit.setForeground(Color.WHITE);
			}
		});
		contentPane.add(lblExit);
		
		JPanel paneMainContent = new JPanel();
		paneMainContent.setBackground(new Color(17, 65, 83));
		paneMainContent.setBounds(272, 21, 787, 468);
		contentPane.add(paneMainContent);
	    paneMainContent.setLayout(null);
		
	    paneMainContent.add(panelAccont);
	    
	    paneMainContent.add(panelProfits);
	    paneMainContent.add(panelMonthlyIncome);
	    paneMainContent.add(panelSpendingBids);
	    paneMainContent.add(panelSetting);
	    
	    menuClicked(panelAccont);
	}
	
	public void menuClicked(JPanel panel) {
		panelAccont.setVisible(false);
		panelProfits.setVisible(false);
		panelMonthlyIncome.setVisible(false);
		panelSpendingBids.setVisible(false);
		panelSetting.setVisible(false);

		panel.setVisible(true);
		
	}
	
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
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
