package br.com.sfd.mvp.interfaceGrafica;

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

import br.com.sfd.mvp.panels.PanelCustomers;
import br.com.sfd.mvp.panels.PanelHome;
import br.com.sfd.mvp.panels.PanelOrders;
import br.com.sfd.mvp.panels.PanelProfits;
import br.com.sfd.mvp.panels.PanelSetting;

public class FrameDashboard extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Image iconImage = new ImageIcon( FrameDashboard.class.getResource("/res/bank.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	
	private PanelHome panelHome;
	private PanelProfits panelProfits;
	private PanelOrders panelOrders;
	private PanelCustomers panelCustomers;
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
		contentPane.setBackground(new Color(17, 65, 83));
		contentPane.setForeground(new Color(46, 138, 153));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    panelHome = new PanelHome();
	    panelProfits = new PanelProfits(); 
	    panelOrders = new PanelOrders();
	    panelCustomers = new PanelCustomers();
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
		
		JPanel paneHome = new JPanel();
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome){

			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelHome);
			}
		});
		paneHome.setBackground(new Color(31, 110, 140));
		paneHome.setBounds(1, 173, 260, 34);
		panemenu.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblConta = new JLabel("Conta");
		lblConta.setForeground(new Color(192, 192, 192));
		lblConta.setFont(new Font("Impact", Font.PLAIN, 14));
		lblConta.setBounds(70, 10, 116, 14);
		lblConta.setHorizontalAlignment(SwingConstants.LEFT);
		paneHome.add(lblConta);
		
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
		
		JLabel lblProspec = new JLabel("Prospecção");
		lblProspec.setForeground(new Color(192, 192, 192));
		lblProspec.setHorizontalAlignment(SwingConstants.LEFT);
		lblProspec.setFont(new Font("Impact", Font.PLAIN, 14));
		lblProspec.setBounds(70, 11, 116, 14);
		paneProfits.add(lblProspec);
		
		JPanel paneOrders = new JPanel();
		paneOrders.addMouseListener(new PanelButtonMouseAdapter(paneOrders){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelOrders);
			}
		});
		paneOrders.setBackground(new Color(31, 110, 140));
		paneOrders.setBounds(1, 237, 260, 34);
		panemenu.add(paneOrders);
		paneOrders.setLayout(null);
		
		JLabel lblRendaMensal = new JLabel("Renda Mensal");
		lblRendaMensal.setForeground(new Color(192, 192, 192));
		lblRendaMensal.setHorizontalAlignment(SwingConstants.LEFT);
		lblRendaMensal.setFont(new Font("Impact", Font.PLAIN, 14));
		lblRendaMensal.setBounds(70, 10, 116, 14);
		paneOrders.add(lblRendaMensal);
		
		JPanel paneCustomers = new JPanel();
		paneCustomers.addMouseListener(new PanelButtonMouseAdapter(paneCustomers){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelCustomers);
			}
		});
		paneCustomers.setBackground(new Color(31, 110, 140));
		paneCustomers.setBounds(1, 269, 260, 34);
		panemenu.add(paneCustomers);
		paneCustomers.setLayout(null);
		
		JLabel lblLancamentoGastos = new JLabel("Lancamento gastos");
		lblLancamentoGastos.setForeground(new Color(192, 192, 192));
		lblLancamentoGastos.setHorizontalAlignment(SwingConstants.LEFT);
		lblLancamentoGastos.setFont(new Font("Impact", Font.PLAIN, 14));
		lblLancamentoGastos.setBounds(70, 10, 116, 14);
		paneCustomers.add(lblLancamentoGastos);
		
		JPanel paneSetting = new JPanel();
		paneSetting.addMouseListener(new PanelButtonMouseAdapter(paneSetting){
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelSetting);
			}
		});
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
		paneMainContent.setBounds(272, 21, 787, 468);
		contentPane.add(paneMainContent);
	    paneMainContent.setLayout(null);
		
	    paneMainContent.add(panelHome);
	    
	    paneMainContent.add(panelProfits);
	    paneMainContent.add(panelOrders);
	    paneMainContent.add(panelCustomers);
	    paneMainContent.add(panelSetting);
	    
	    menuClicked(panelHome);
	}
	
	public void menuClicked(JPanel panel) {
		panelHome.setVisible(false);
		panelProfits.setVisible(false);
		panelOrders.setVisible(false);
		panelCustomers.setVisible(false);
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
