package essai.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class AppliSwingOuPas extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  AppliSwingOuPas() {
		super( "My First Swing application");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(640, 495);
		this.setLocationRelativeTo(null);
		
		JPanel contentPane = (JPanel) this.getContentPane();
		
		JLabel lblLesPtits = new JLabel("New label");
		lblLesPtits.setVisible(false);
		/*créer le chemin relatif !!*/
		lblLesPtits.setIcon(new ImageIcon("C:\\Users\\aNewL\\eclipse-workspace\\DeuxiemePas\\media\\les 75 ptits.jpg"));
		lblLesPtits.setBounds(111, 148, 373, 272);
		getContentPane().add(lblLesPtits);
		
		JLabel lblNewLabel_1 = new JLabel("LES PENSEES DE PANGU");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 24));
		lblNewLabel_1.setBounds(166, 6, 278, 23);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Veux-tu r\u00E9ellement conna\u00EEtre les pens\u00E9es de Pangounet ?");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(63, 36, 520, 28);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblMaisSi = new JLabel("Mais si, cliques sur \"Oui !\", tu vas rire !");
		lblMaisSi.setVisible(false);
		lblMaisSi.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblMaisSi.setOpaque(true);
		lblMaisSi.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblMaisSi.setIcon(null);
		lblMaisSi.setDisplayedMnemonic('1');
		lblMaisSi.setBounds(111, 159, 400, 283);
		getContentPane().add(lblMaisSi);
		
		JLabel lblPensees = new JLabel("Je veux des croquettes et voir si Galice dort !");
		lblPensees.setFont(new Font("Segoe Print", Font.PLAIN, 18));
		lblPensees.setVisible(false);
		lblPensees.setBounds(89, 109, 422, 38);
		getContentPane().add(lblPensees);

	
		
		JButton btnOui = new JButton("Oui !");
		btnOui.setEnabled(false);
		btnOui.setBounds(397, 76, 78, 28);
		btnOui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMaisSi.setVisible(false);
				lblLesPtits.setVisible(true);
				lblPensees.setVisible(true);
				
			}
		});
		
		getContentPane().setLayout(null);
		
		
		
		contentPane.add(btnOui);
		JButton btnNon = new JButton("Non !");
		btnNon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMaisSi.setVisible(true);
				btnOui.setEnabled(true);
				
			}
		});
		btnNon.setBounds(151, 76, 95, 28);
		contentPane.add(btnNon);
		
		
	
		
	}

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		AppliSwingOuPas myWindow = new AppliSwingOuPas();
		myWindow.setVisible(true);		


	}
}
